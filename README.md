# Java development

Учебные работы по Java для проекта **Turan**.

**Студент:** Аладенских Олег

**Группа:** 262 ДОТ

## Работа с переменными и операциями в Java

Программа `VariablesDemo` демонстрирует переменные типов `int`, `double`, `char`, `boolean`, `String`, арифметические операции `+`, `-`, `*`, `/`, `%`, логические операции `&&`, `||`, `!`, объединение строк и форматированный вывод `printf`.

Возраст и рост взяты из задания как учебные значения; имя заменено на Олег.

## Запуск

Нужен JDK (проверено на OpenJDK Temurin 21.0.12.1). Maven и Gradle не требуются.

### Windows и Visual Studio Code

Откройте папку проекта в VS Code. Нажмите **Ctrl+Shift+B** — запустится задача `Run VariablesDemo`.

Либо выполните в терминале PowerShell из папки проекта:

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File ./run.ps1
```

Скрипт ищет JDK в `JAVA_HOME` или `PATH`, компилирует исходник в папку `out` и запускает программу. Параметр `ExecutionPolicy` применяется только к этому процессу; постоянная политика Windows не меняется.

### Команды для ручного запуска

```text
javac -encoding UTF-8 -d out src/VariablesDemo.java
java -Dstdout.encoding=UTF-8 -cp out VariablesDemo
```

При JDK 8–17, если консоль использует другую кодировку, настройте терминал на UTF-8. Рекомендуемая и проверенная среда для этой работы — JDK 21.

## Результаты

При `a = 15` и `b = 4`: сумма **19**, разность **11**, произведение **60**, целое частное **3**, остаток **3**.

При `x = true` и `y = false`: `x && y` → `false`, `x || y` → `true`, `!x` → `false`, `!y` → `true`.

Полный вывод: [console-output.txt](report/console-output.txt).

## Отчёт

- [Отчёт Word](report/Report_Aladenskikh_262_DOT.docx)
- [Отчёт PDF](report/Report_Aladenskikh_262_DOT.pdf)
- [Отчёт для просмотра на GitHub](report/Report.md)
- [Исходный код](src/VariablesDemo.java)

В отчёте приведены код, фактический вывод программы, разбор результатов, вывод и ответы на контрольные вопросы.

Репозиторий: [O1SEeez/Java-development](https://github.com/O1SEeez/Java-development). Основная ветка — `main`.
