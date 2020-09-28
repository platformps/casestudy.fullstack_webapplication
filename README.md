# Full Stack Web Application

* **Objective** - to create an implementation of a web service.

* **Purpose** - to demonstrate the construction of a full-stacked web-application for Healthy Living website that offers variety of services for organization of special events and some retail.

* **Description** 
	* This Case Study demonstrates the process of building a functional, Spring MVC based full-stack application from ground up. 
	* The Healthy living website offers its members health supplies and products. The members can login to attend events and also take part in a variety of offered services like Zumba classes and yoga.
	* Healthy Living is an app for users that are planning to stay fit for a lifetime of healthful benefits. 
    * The website includes six webpages: Welcome, Login, Registration, Members, Products, and Shopping Cart.


*## Features
* `RESTful` web service consumes requests from a front-end web application and caches each request and the respective response to a database.
* The application supports a login functionality.
* To access the services and view pages of the website a user will need to create their account, register and login with valid credentials.Thos portion is developed using the template
https://github.com/curriculeon/spring.jsp-loginpage.

* This app will allow a user to register for events and services and buy health foods and exercise gear and equipment.
*  adding the product or service to shopping cart and view the total for purchased products and services. 
* This app also keeps a tab of the loyalty points accrued for buying from us or being a registered member.


## Developmental Notes
### Tech Stack
  * **Version Control System**
    1. Github used
  


  * **Wireframe**
    1. Balsamiq
    2. Lucidcharts
    PNG files - images of the web pages


  * **Frontend**                                ***ReactJS
    1. Java Server Pages               	 	1.Axios 
    2.Java Server Pages				            2.npm and yarn
    3.Cascading Style Sheets(CSS)		      3.CSS
    4.JavaScript         		            	4.JavaScript files

  * **Business Logic**
    1. Java
   
  * **WebServer Implementation**
    1. Spring Boot
    2. At least 1 [backing service](https://12factor.net/backing-services) API   Microservices Architecture

*****How to start/Navigate

1. Navigate to the folder casestudy.fullstack_webapplication\healthyliving-casestudy\member-service. Start IntelliJ by clicking on Pom.xml. Run the Mainapplication. Keep it running.

2. Navigate to localhost:8080/h2-console  
 
                        <img src="/h2-connect1.png">
                        
Follow the JDBC URL, userName = root and Password =password. The result is that the members table is displayed on clicking on MEMBERS tableName and selecting RUN button.
                        <img src="/h2-connect2.png">
 
3. Navigate to http://localhost:8080/api/members/     in order to see the following screen.
                        
                        <img src="/Api-members">      

4 Start the react App by navigating to the folder /casestudy.fullstack_webapplication\healthyliving-casestudy\REACT-SPRINGBOOT_CRUD
cd react-frontend
npm install
npm run
npm start
The display on localhost:3000 is the default Member List from the database.
                    <img src="/members-api-react">

7. Still under contruction:  Adding buttons for Update and Delete.
8. . Adding Login and registration to the react app from the spring-jsp-template. Planning to do this for all the microservices developed so far.
