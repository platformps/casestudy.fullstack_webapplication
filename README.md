# Full Stack Web Application

* **My case study lives here: My Case Study lives here: https://github.com/PhillipKinney/casestudy.ddemployeemanagement**
* **Application has been deployed to Heroku: https://dry-atoll-35480.herokuapp.com**
* **Video Walkthough of how to use application can be found here: https://youtu.be/MVr9_AnhBOc**

* **Objective** - to create an implementation of a web service
* **Purpose** - to demonstrate the construction of a full-stacked web-application
* **Description**
	* I decided to build an blog and employee management system for my blog.
	* The system allows users to perform CRUD operations on employees and on blog posts.
	* The system allow users to register and sign in to the application.
	
* **Additional Resources**
	* [Custom Sign-in page tutorial that I used]https://www.youtube.com/watch?v=_5sAmaRJd2c
	* [Management System Tutorital]https://www.youtube.com/watch?v=Hk70e7KR290 This is link is to the first video of an 8 part series that I followed. All otehr vidoes can be 		accessed from this one
	
* **How To Access/Use Program**
	* Program can be accessed by navigating to https://dry-atoll-35480.herokuapp.com
	* From here you can register to be come a user.
	* After registering, click on "login" located below the registration screen to be taken to the login in screen.
	* Use the credentials you just created to signin
	* After signin you land at the main menu page 
	* Here you can select which operation you would like to perfrom
	*Please see video for full application walkthrough
	https://youtu.be/MVr9_AnhBOc



## Features
* Log in feature using Spring Security 
* Passowrd encryption (BCrypt)
* CRUD operations for posts and employees
* Nav Bar Navigation at the top of each page




## Developmental Notes

### Tech Stack Selection
* Select at least 1 technology from each of the following categories:
  * **Version Control System**
    1. Github
    
    
  * **Wireframe**
    1. draw.io

  * **Frontend**
    1. Thymeleaf
    2. HTML
    3. CSS
    4. Bootstrap 4
    
  * **Business Logic**
    1. Java
    

  * **WebServer Implementation**
    1. Spring Boot
    2. Spring Security

  * **Data Layer**
    1. MySQL (on my local machine)
    2. Heroku in memory db (once deployed)

  * **Web Server Cloud Deployment**
    1. Heroku
    
    ## Challenges
    1. Wanted to set up author as type User in Posts class, but had issues figuring out how to pass that from the front end since controller was looking for entire User object 	and not just a the name of user. Tried to do user.firstName but it did not work so I changed type to String
    2. Wanted to add department as a field of the Employee Class, but had issues similar to #1
    3. Project actually started as blog, but had issues with tutorials I was loking into, so I changed it to an employee mangement system. After following the management system I 	realized I could much of the same logic to create an MVP for my blog.
    4. I could not get dateCreated to auto generate for Post. Also had Date issues with hireDate in the Employee Class. It didn't even dawn on me at the time that I could have 	used Date methods to format the date. 
    5. When deploying to Heroku, my GitBash would not run the `create heroku` command. The CLI would freeze after loggin me in to Heroku. Thanks to stackoverflow, I learned how to 		change the shell of my terminal in Intellij to accept Git commands and run the needed Heroku commands.
    6. Not sure if this qualifies as a challenge, but I am not sure why my data is persisting with Heroku. I intalled JawsDB to my Heroku account, but did not configure it. The data     	that put on Heroku on 9/25/20 was still there on 9/26/20. Since I was under the impression that data would not persist (and I am not yet sure sure why it is) I added dummy data 	to the ProjectConfig file so that in case data does not persist, the blog posts page will have data on each run. However, with data currently persisting, this causes data to 		be loaded multiple time. I will investigate this further as I work on v2.
    
    ## Deferred to v2
    1. Address Challenges mentioned above
    2. Assign Roles to Users
    3. Set up JawsDB on Heroku.
    4. After registration, login page loads instead of registration page
    5. Add space between top right nav bar buttons on new_employee, new_post, posts_home pages
    6. Refactor names of index and index2 Thymeleaf templates to more closely match their intentions
    
  
