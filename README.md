# Plantagram Full Stack Web Application 

## Description
Plantagram is an online journal service to store albums and posts about your current garden operations so they can be accessed anywhere with an internet connection

## Requirements to run applicaiton locally
Node/NPM/YARN, IntelliJ IDEA/Eclipse and a valid mysql databse to seed before beginning the operation for testing purposes 

## Developmental Notes

### Installation
* It is advised that you install each of the following technologies
  * Install [NodeJs](https://nodejs.org/en/).
  * Install [IntellijIDEA](https://www.jetbrains.com/idea/).
  * Install [Maven] version 3.0 or higher(https://maven.apache.org/download.cgi).

### Getting Up and Running

#### Front End
* In your terminal once in the base branch of the project navigate to the frontend folder and use yarn add to download the necessary dependencies to start the front end of the applicaiton, once loaded start the front end of the application by running yarn start in the terminal but make sure the backend is running first in order to properly load everything. Navigate to localhost:3000 in order to get started creating your albums and posts for your gardening journal 

#### Back End
* In Intellij Make sure your project is set up correctly by opening it with the pom.xml file. Once dependencies have been installed cd to your project root folder in command line and type mvn spring-boot:run

## Technologies Used 

### Back End
Java, Spring, Spring Data JPA, Maven, MySQL, Auth0

### Front End
React, Material UI, Auth0, CSS

### WireFraming/Front-end Design
* **Mockflow Design** 
![login](login.png)
![Album Page Layout](Album_Page.png)
![Post Page Layout](Post_Page.png)


