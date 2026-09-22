$ErrorActionPreference = 'Stop'
Set-Location $PSScriptRoot
[Console]::OutputEncoding = [System.Text.UTF8Encoding]::new($false)
$OutputEncoding = [Console]::OutputEncoding

$jdkRoot = $env:JAVA_HOME
if (-not $jdkRoot) {
    $jdkRoot = [Environment]::GetEnvironmentVariable('JAVA_HOME', 'User')
}
if ($jdkRoot -and (Test-Path "$jdkRoot/bin/javac.exe")) {
    $compiler = "$jdkRoot/bin/javac.exe"
    $runtime = "$jdkRoot/bin/java.exe"
} else {
    $compiler = (Get-Command javac -ErrorAction Stop).Source
    $runtime = (Get-Command java -ErrorAction Stop).Source
}

New-Item -ItemType Directory -Force -Path 'out' | Out-Null
& $compiler -encoding UTF-8 -d out src/VariablesDemo.java
if ($LASTEXITCODE -ne 0) { throw 'Java compilation failed.' }
& $runtime '-Dfile.encoding=UTF-8' '-Dstdout.encoding=UTF-8' -cp out VariablesDemo
if ($LASTEXITCODE -ne 0) { throw 'Java program failed.' }
