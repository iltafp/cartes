@echo OFF
set ARTIFACT=superPoker.war
set DESTDIR=C:\Users\User\Desktop\servers\apache-tomcat-9.0.24\webapps
copy target\%ARTIFACT% %DESTDIR%