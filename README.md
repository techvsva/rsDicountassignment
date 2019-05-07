# Project Title - rsDicountAssignment
  
Calculate net Payable amount after applicable discounts.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

This application needs
1.JAVA8
2.MAVEN
3.Git
4.Any preferred IDE for development and testing pusposes.
5.SONARCUQE

### Installing

Download zip or copy the porject url and clone it into you local machine using git clone command


## Install and Run

run mvn clean install in terminal to install and run test cases. This will generate a jacoco report as well.

jacoco report can be published on sonarcube using command - mvn sonar:sonar
Sonarqube dashboard can be accessed on http://localhost:9000/dashboard?id=com.assgnment.rs%3Adiscount, before this step one should have sonarqube running on its local machine.

mvn spring-boot:run - will start the project and can be accessed on http://localhost:8080/swagger-ui.html#/bill-controller

8080 is default port on which poject will start, if you need to change the port go to projects application.properties file and add server.port={portNumber}

