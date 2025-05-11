@echo off
REM Remove old build directory (if exists)
if exist build (
  rmdir /s /q build
)

REM Recreate build directory
mkdir build

REM Compile all .java files under src\ into build\
for /R src %%f in (*.java) do (
  javac -d build "%%f"
)

echo.
echo Compilation complete. .class files are under "build\"
pause
