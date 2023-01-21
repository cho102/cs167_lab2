#!/usr/bin/env sh
mvn clean package
hadoop jar target/cho102_lab2-1.0-SNAPSHOT.jar file://`pwd`/AREAWATER.csv hdfs:///AREAWATER.csv

