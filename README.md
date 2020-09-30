# Full Stack Web Application

* **Objective** - to create an implementation of a web service
* **Purpose** - to demonstrate the construction of a full-stacked web-application

* **Description**
	The Project is an E-commerce website that uses to sell the products. The admin can add, delete, or change products from the website.  the customers can filter by the low price, high price, newest listed, range of the price. The customers can add the products to the card before they bought them, or they can delete them from the cart. If they want to update the cart.  After they process their purchase, the website displays the details of the purchase.
	
* **Trello Link**
    https://trello.com/b/PUWfFL6E/casestudy

## Developmental Notes

### Tech Stack Selection
  * **Version Control System**
    Github
    
  * **Wireframe**
    Balsamiq
    
  * **Frontend**
    Angular Cascading Style Sheets(CSS) HTML
    
  * **Business Logic**
    Java
    
  * **WebServer Implementation**
    Spring Boot
 
  * **Data Layer**
    MariaDB

  * **Web Server Cloud Deployment**
    AWS EC2 Instance
  
  * **Web Application Cloud Deployment**
    1. Netlify
    2. AWS EC2 Instance

### Pre Requisite Software
* Java8 Runtime Environment
* AngularJS Cli
* MariaDB
  
### How to run Application
* run `generateTables.sql` in db scripts folder
* run [`pom.xml`](./backend/case-study-ecommerce/pom.xml) file
* update username and password of application.properties
`spring.datasource.username=root
 spring.datasource.password=1234`
 
* Open command line and run this command:
    `mvn spring-boot:run`
* From the root directory execute the following command:
    * `ng serve --open`
* Upon running, the application should be visible by navigating to       * `http://localhost:4200`

### Troubleshooting
* If your application cannot run because something is occupying a port, use this command with the respective port number specified:
    * **OSX and Linux**
	    * ``kill -kill `lsof -t -i tcp:8080` ``
	    * ``kill -kill `lsof -t -i tcp:4200` ``
    * **Windows**
        * _For use in command line_:
            * `for /f "tokens=5" %a in ('netstat -aon ^| find ":8080" ^| find "LISTENING"') do taskkill /f /pid %a`
            * `for /f "tokens=5" %a in ('netstat -aon ^| find ":4200" ^| find "LISTENING"') do taskkill /f /pid %a`
        * _For use in bat-file_:
            * `for /f "tokens=5" %%a in ('netstat -aon ^| find ":8080" ^| find "LISTENING"') do taskkill /f /pid %%a`
            * `for /f "tokens=5" %%a in ('netstat -aon ^| find ":4200" ^| find "LISTENING"') do taskkill /f /pid %%a` 
