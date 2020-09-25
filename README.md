# Full Stack Web Application:	SpringBootWebBankingApplication

Deliverables:

Link to repository: https://github.com/monicadeshmukh/SpringBootBankingApplication
Link to Trello Board: https://trello.com/b/aFj8qeUp/case-study
Link to GoogleDocs for the wireframe design: https://docs.google.com/document/d/1rhN0rD_q0U9aOYoAmlsE9Cf-W0FaWILXAKIvGKY0g5s/edit?usp=sharing
Page Navigation Chart: https://app.lucidchart.com/invitations/accept/33021239-3c54-42e9-b05e-a73650ce4908
DataBase Schema: https://app.lucidchart.com/invitations/accept/33021239-3c54-42e9-b05e-a73650ce4908

Tech Stack: 

Version Control: GitHub
Wireframe: Pencil App
Agile Methodology followed using: Trello Board
Frontend: HTML, CSS, BootStrap4, JSP
Business Logic: Java Spring Boot
DataBase: MySQL (H2-Console used for testing) 
App runs on : localhost:Port8080/ No password needed to connect to the database
Tests: The App is tested by running the Main springBoot Application in IntelliJ IDE.
Controllers tested using Postman. Sample queries run on H2Console.

Description/ Page Navigation: This is a demo web banking application.

1. The user runs the MainApplication in IntelliJ to start the app. The user lands on the index.jsp page. User can navigate to pages like contact, about, home and loginRegister. 

2. When the 'Get Started' button is pressed on the index page, the loginRegister page opens.

3. New user can register with his details by pressing the 'Register For Online Banking' button. The page navigates back to login page after successful registration. At this time a new account is created for the user and 
the user is provided with a balance of $1000. In the H2-console run command 'select * from customer' and 'select * from accounts' to see the data populated in the database. 
At this time the database is also getting prepopulated with registred payee accounts. 'Dominion Enery' account is setup for doing transaction.
The registered user record is displayed in the customer table and the account details are shown in the accounts table.

4. On the loginRegistration page enter your username and password and press login. 

5. After successful login, the account details are displayed on the Account page with account number and balance.

6. On pressing the 'view transactions' button, a dummy transaction is displayed that shows a 100$ paid to payee "Dominion Energy". 
When the user navigates back to the account page and refreshes the account page, the balance is upated to refelct the amount withdrawn.

7. Still under contruction:  From Account page the user can go to billpay page. (This is still under constuction. At this time dummy payees are displayed with payee name. User can input the withdrawal amount and description of transaction. And press confirm button to submit the payment.
8. . After successful bill payment the transaction details are displayed on the transactions page.)


* **Objective** - to create an implementation of a web service
* **Purpose** - to demonstrate the construction of a full-stacked web-application
* **Description**
	* This Case Study is your first foray into building a full-stack application. You'll be building a Spring MVC based application, which means you'll learn about what it takes to build a functional application from the ground up yourself.
	* This is exciting! It's a lot, but we've given you the tools to be able to build what you need, and you get to decide what you do with it. You also get to be creative in choosing what sort of application you want to build!
	* You will be working individually to design your app. We hope you'll exercise creativity on this project, sketch some wireframes before you start, make sure you have time to run these ideas by your instructors to get their feedback before you dive too deep into coding! Remember to keep things small and focus on mastering the fundamentals.
* **Additional Resources**
	* [The Original Case Study Document](./case-study.pdf)
	* [Case Study Outline](./case-study-outline.pdf)
	* [Case Study Deliverables](./README_deliverables.md)
	* [Identifying Plagiarism](./README_plagiarism.md)
	* [Suggested Project Topics](./README_suggested-project-topics.md)



## Minimum Features
* `RESTful` web service which consumes requests from a front-end web application and caches each request and the respective response to a database.
* The application must support a login functionality.




## Developmental Notes

### Tech Stack Selection
* Select at least 1 technology from each of the following categories:
  * **Version Control System**
    1. Github
    2. Bitbucket
    
  * **Wireframe**
    1. Mockflow
    2. Balsamiq
    3. Lucidcharts

  * **Frontend**
    1. Java Server Pages
    
  * **Business Logic**
    1. Java
    2. TypeScript

  * **WebServer Implementation**
    1. Spring Boot
    2. At least 1 [backing service](https://12factor.net/backing-services) API

  * **Data Layer**
    1. MySQL
    2. PostgreSQL
    3. MariaDB

  * **Web Server Cloud Deployment**
    1. Heroku
    2. AWS EC2 Instance
  
  * **Web Application Cloud Deployment**
    1. Netlify
    2. AWS EC2 Instance




### Installation
* It is advised that you make install each of the following technologies to ensure that are at least accessible
  * Install [NodeJs](https://nodejs.org/en/).
  * Install [Angular](http://angular.io/).
  * Install [AngularCli](https://cli.angular.io/).
