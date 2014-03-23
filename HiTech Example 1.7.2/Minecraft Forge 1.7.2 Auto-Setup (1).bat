@echo off
cls
echo COnfiguring Forge 1.7.2
start /wait cmd /c gradlew.bat setupDevWorkspace --refresh-dependencies
start /wait cmd /c gradlew.bat eclipse
exit