## Deliverables
* Trello Board - To begin your case study, create a Trello board with at least 5 columns accounting for each of the following
* this board will be used by the instructor to evaluate progress.
* Please ensure the instructor has access to this Trello board
	* `Ideation`
		* This column will first contain cards describing a potential application to be built.
		* Upon concept approval, this column will be re-purposed to describe potential features of the approved application.
	* `Backlog`
		* This column will contain cards describing work that **will not be** done in a near-future, but **must be done** eventually for the product to be considered completed
	* `Upcoming`
		* This column will contain cards describing work that **will not be** done in the current-sprint commitment, but **will be committed to** in the upcoming-sprint commitment.
	* `Current`
		* This column will contain cards describing work that **will be** done in the current-sprint commitment.
	* `In Review
		* This column will contain cards describing work that **need to be reviewed** to be considered **done**.
	* `Completed`
		* This column will contain cards describing work that has been reviewed and is considered completed

1. Database (MariaDB) – This deliverable includes creating a database that reflects the website you have decided to create
	* Schema diagram: a visual representation of your database 
	* Database file creation (.sql): Queries used to create the database 


2. Core Java & JPA - This deliverable includes creating a back-end environment that is composed of different Java classes
	* Models: Java classes that represent an entity and are used to transfer data related to an entity, create multiple queries, and represent the database as an object-oriented model
	* Persistence.xml: This file configures the Java classes that are going to be using JPA to interact with the database.
	* Persistence Java Class: A static class that allows the application to create a persistent object which can be used to interact with the database.
	* Service Class or Data Access Objects (DAO): Java classes that are composed of one or more functions and have direct access to the database by using JPA persistent object. Each function in a DAO class interacts with the database differently.
	* Custom Exceptions: Java classes that allow you to describe an error while the application is running.
	* Utilizes: Java classes that hold constant variables (Variables that never change from its initial value). The value of these variables can be requested parameters, Database queries used in the DAO, name of HTML pages, or URL patterns to forward a request to. 
3. HTML5/CSS3 – This deliverable includes creating every page required by the given case study
	* HTML5: Use HTML for static and dynamic pages and markup the structure of every page.
	* CSS3: Use CSS3 to style your HTML pages and make sure to take into consideration the knowledge acquired from the visual design lessons.
4. Spring MVC - This deliverable includes connecting no. 1, 2 and 3 deliverables to function together
	* Spring MVC: Responsible for responding to a request made by the user. This can be login, registration, etc. When using Spring MVC make sure to use at least the following functionalities: different type of session management, annotation-based controller, exception handling, models, model attributes.
5. Junit (Test all DAO classes) - This deliverable includes creating a test class for each DAO available and creating a test case in the test class for each function inside the DAO
	* Junit: A Java framework responsible for performing unit testing against every DAO class available. There should be a test class for every DAO and inside the test classes, there should be at least one test case for every function inside the DAO classes. When using JUnit make sure to use the following functionalities: Suite classes, Runner, Feature life cycle, Test, Parameterized classes, Java Hamcrest library.
