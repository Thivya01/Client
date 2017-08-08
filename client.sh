#!bin/bash

mvn -f ./pom.xml/ clean install

java -cp ./target/tcpclient-1.0-SNAPSHOT.jar com.distributedsystem.tcpclient.RunClient