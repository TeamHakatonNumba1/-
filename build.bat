:: Build script.
::
@echo off

set JRE=java
set JDK=javac

:: Intire point to program.
set PACKAGE_NAME=ru.siteparsers.Main
set BIN_PATH="bin"
set SRC_PATH="src"
set LIBS=lib/jsoup-1.8.3.jar

if "%~1" == "build" (
    if not exist %BIN_PATH% mkdir %BIN_PATH%
    %JDK% -d %BIN_PATH% -sourcepath %SRC_PATH% -cp %LIBS% %SRC_PATH%/ru/siteparsers/Main.java
)
if "%~1" == "run" (
    %JRE% -cp %BIN_PATH%;%LIBS% %PACKAGE_NAME% %*
)

if "%~1" neq "build" if "%~1" neq "run" echo Unknown argument %~1
