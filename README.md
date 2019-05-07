## Project Title - rsDicountAssignment
  
Calculate net Payable amount after applicable discounts.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Prerequisites

This application needs<br/>
1.JAVA8 <br/>
2.MAVEN <br/>
3.Git <br/>
4.Any preferred IDE for development and testing pusposes <br/>
5.SONARCUQE

## Installing

Download zip or copy the porject url and clone it into you local machine using git clone command


## Test and Run

After cloning the project go to the poject folder named discount and then run *mvn clean install* in terminal to install and run test cases. This will generate a jacoco report as well.

jacoco report can be published on sonarcube using command - *mvn sonar:sonar*
Sonarqube dashboard can be accessed on http://localhost:9000/dashboard?id=com.assgnment.rs%3Adiscount, before this step one should have sonarqube running on its local machine.

*mvn spring-boot:run* - will start the project and can be accessed on http://localhost:8080/swagger-ui.html#/bill-controller

8080 is default port on which poject will start, if you need to change the port go to projects application.properties file and add *server.port={portNumber}*

### Generate Jacoco Report

To generate jacoco report run - *mvn clean install jacoco:report*.
After Report generation navigate into project - *target/site/index.html* and open *index.html* in browser.

## Acknowledgment
See attached files for class diagrams and sonar cube dashborad screenshots.
