#!/usr/bin/env bash

java -classpath ${RANDOOP_JAR}:../jsoup.jar randoop.main.Main gentests --classlist=randoop_classlist.txt --time-limit=20

JUNITPATH=/Users/maxi/.m2/repository/junit/junit/4.12/junit-4.12.jar:/Users/maxi/.m2/repository/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar
javac -classpath .:$JUNITPATH:../jsoup.jar RegressionTest*.java -sourcepath .:../src/main/java/
#java -classpath .:$JUNITPATH:../jsoup.jar org.junit.runner.JUnitCore ErrorTest
java -classpath .:$JUNITPATH:../jsoup.jar org.junit.runner.JUnitCore RegressionTest