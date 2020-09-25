







DSHOPPING.COM DELIVERABLES

PREREQUISITES :        1: Make sure MySQl & JDK is installed on the machine.
                       2: Make sure to change your mysql username and password in Application.Properties file inside the Resource Folder.
		       3: Make sure to create database Scehma named dshopping using query: Create Schema dshopping. Please refer the pics below:
		       
		     	 


1: TRELLO BOARD: Trello board is a web-based Kanban Style list-making application. 
                 Users can create their task boards with different columns and move the tasks between them.
                 I have included the following columns:
                 a: Ideation
                 b: Backlog
                 c: Upcoming
                 d: Current
                 e: Review
                 f: Completed

                 The URL for this board is as follows: https://trello.com/b/77nYDHS9/dshoppingcom


2: SCHEMA DIAGRAM: A Schema Diagram is the blueprints of your database. It represents the description of a Database structure, data types, and the constraints on the database.
                            

 


3: PROJECT URL:  https://github.com/deepti102915/newcasestudy

4: STEPS TO CLONE REPOSITORY WITHOUT FORKING:  Please follow the steps to clone the project in your repository in order to run it successfully

A: Copy URL of the project you want to clone
B: $git clone URL new folder name
C: cd new folder name
D: rm -rf .git
E: Add a repository in your git hub with same name as new folder name
F: $git init
G: $git add.
H: $git commit -m ""
I: $git  remote add origin (new repository url to push)
J: $git push

5: OPEN THE PROJECT IN INTELLIJ: Now I will display step by step the complete functionality of this application:
 
STEP1: Run Main Application by doing right click and then click on Run

![Step 1](https://user-images.githubusercontent.com/64552538/94212851-48a33000-fea3-11ea-9f8e-20ca95810960.png)


Step 2: Spring MVC should be up and running without any errors. Tomcat should start at Port 8080


   ![Step 2](https://user-images.githubusercontent.com/64552538/94212692-db8f9a80-fea2-11ea-886c-1625adc36ce0.png)

 
Step 3(a) Open MYSQL workbench, Connect To Database (MySQL). We will see that now all tables are created in database but there is no data inside them.

![Screen Shot 2020-09-23 at 7 58 56 PM](https://user-images.githubusercontent.com/64552538/94214957-13014580-fea9-11ea-8551-c4be2a78e647.png)

 
Step 3(b): Enter username, password & click OK:

![Screen Shot 2020-09-23 at 7 59 08 PM](https://user-images.githubusercontent.com/64552538/94215035-4cd24c00-fea9-11ea-8dd2-30b9a76552ac.png)

 
Step 3(c): Expand the Database to see all Tables created dynamically after starting the application on TomcatServer:

![Screen Shot 2020-09-23 at 7 59 32 PM](https://user-images.githubusercontent.com/64552538/94215224-eb5ead00-fea9-11ea-8882-68ef1c286075.png)


 
Step 3(d) : Run the Query as follows to check that there should not be any data in the deal table

![Screen Shot 2020-09-23 at 8 00 09 PM](https://user-images.githubusercontent.com/64552538/94215276-1d700f00-feaa-11ea-98db-c6ce372ff050.png)

 
Step 3(e): Run query for Item table: 

![Screen Shot 2020-09-23 at 8 00 23 PM](https://user-images.githubusercontent.com/64552538/94215319-4395af00-feaa-11ea-95e9-567896f6c6d6.png)

 
Step 3(f): Run Query for product table:

![Screen Shot 2020-09-23 at 8 00 34 PM](https://user-images.githubusercontent.com/64552538/94215356-67f18b80-feaa-11ea-978c-019e795b5aaf.png)


 
Step 3(g): Run query for User table:

![Screen Shot 2020-09-23 at 8 00 45 PM](https://user-images.githubusercontent.com/64552538/94215410-8d7e9500-feaa-11ea-8997-f0b09f1c81a3.png)

 


Step 4: Launched application using localhost URL which includes default port 8080

![Step 3](https://user-images.githubusercontent.com/64552538/94215510-d59db780-feaa-11ea-8d53-ca85c04cdd46.png)



 


Step 5: By Default the application starts with Home Screen

![Step 4](https://user-images.githubusercontent.com/64552538/94215562-febe4800-feaa-11ea-9a17-ac9b2c49518d.png)


 

Step 6(a): Now, go back to DB and check if there is data present in the tables now. Run Query for deal table. Data is available now.

![Screen Shot 2020-09-23 at 8 02 59 PM](https://user-images.githubusercontent.com/64552538/94215674-607eb200-feab-11ea-9827-cf3129031fbd.png)


 
Step 6(b): Run query for item table:

![Screen Shot 2020-09-23 at 8 03 09 PM](https://user-images.githubusercontent.com/64552538/94215740-886e1580-feab-11ea-9b91-69b1b157af11.png)

 
Step 6(c) : Run query for Product table:

![Screen Shot 2020-09-23 at 8 03 18 PM](https://user-images.githubusercontent.com/64552538/94215821-b5bac380-feab-11ea-95a7-a96582deb9f2.png)

 
Step 6(d): Run Query for user table, this should still be empty as no user has been registered:

![Screen Shot 2020-09-23 at 8 05 40 PM](https://user-images.githubusercontent.com/64552538/94215868-d84cdc80-feab-11ea-97c1-0176b54dce80.png)
 
Step 7: Go back to browser, Click on the tab About, the application moves container to About section

![Step 5](https://user-images.githubusercontent.com/64552538/94215593-20b7ca80-feab-11ea-9136-b2d65e83d74a.png)


 
Step 8(a): Click on the tab Products, the container shows all the available products for Shopping with their details provided on the screen.

![Step 6 a](https://user-images.githubusercontent.com/64552538/94215928-0a5e3e80-feac-11ea-96e9-752671617fa3.png)


 
Step8(b): Go back to IntelliJ, the products can be seen here on the screen:

![Step 6 b](https://user-images.githubusercontent.com/64552538/94215978-3083de80-feac-11ea-842a-e8c01d2257d8.png)

 
Step 9(a): Click on the tab Portfolio, all the product Categories will be displayed:

![Step 7 a](https://user-images.githubusercontent.com/64552538/94216033-5ad59c00-feac-11ea-8f16-dc81c658bf70.png)

 
Step 9(b): Click on the first one, Furniture:

![Step 7 b](https://user-images.githubusercontent.com/64552538/94216088-7d67b500-feac-11ea-877f-c0b51c35af64.png)

 
Step 9(c) : Click on the second one, Mobile: 

![Step 7 c](https://user-images.githubusercontent.com/64552538/94216131-9708fc80-feac-11ea-90c3-7a0d95d7b928.png)


 
Step 9 (d): Click on Books: 

![Step 7 d](https://user-images.githubusercontent.com/64552538/94216156-b011ad80-feac-11ea-8544-f99f38007bd9.png)


 
Step 9 (e) : Click on Computers

![Step 7 e](https://user-images.githubusercontent.com/64552538/94216192-cb7cb880-feac-11ea-8da4-6ba75fdce889.png)


 
Step 9(f): Click on Men

![Step 7 f](https://user-images.githubusercontent.com/64552538/94216272-f830d000-feac-11ea-9134-3f41ebe602a8.png)


 
Step 9(g): Click on Women:

![Step 7 g](https://user-images.githubusercontent.com/64552538/94216325-1696cb80-fead-11ea-9ae8-6b94ea7beb27.png)


 
Step 10 (a): Click on the tab Today’s Deal:

![Step 8 a](https://user-images.githubusercontent.com/64552538/94216380-3928e480-fead-11ea-9c27-d478147056dc.png)

 
Step 10(b): Click on the IntelliJ, the Deals can be seen here on the screen.

![Step 8 b](https://user-images.githubusercontent.com/64552538/94216448-58c00d00-fead-11ea-842c-5ea9b4a704c8.png)


 

Step 11(a): Click on the tab Contact:

![Step 9 a](https://user-images.githubusercontent.com/64552538/94216488-81e09d80-fead-11ea-9bdb-b7d648326098.png)

 
Step 11(b): Click on the email address, The page should be displayed as follows to send the email:

![Step 9 b](https://user-images.githubusercontent.com/64552538/94216526-9b81e500-fead-11ea-9422-8e5deabb1985.png)


 
Step 12 (a): Click on the tab SignIn/Register:

![Screen Shot 2020-09-23 at 8 06 00 PM](https://user-images.githubusercontent.com/64552538/94216613-cb30ed00-fead-11ea-8dd7-11d6051c92ca.png)


  
Step 12(b): Enter any random username and password which is not registered, it displays the error message “User not found. Kindly register”

![Screen Shot 2020-09-24 at 9 40 13 PM](https://user-images.githubusercontent.com/64552538/94216908-a5581800-feae-11ea-8b02-e250ae217520.png)

 

Step 12 (c) : Click on the tab Clear in the above step to clear the input.
 
Step 12(d): Click on Register tab to register the user:

![Screen Shot 2020-09-23 at 8 06 41 PM](https://user-images.githubusercontent.com/64552538/94217126-3929e400-feaf-11ea-809c-510e2445cb9f.png)


 
Step 12(e): Go back to My SQL to check to see that user is registered:

![Screen Shot 2020-09-23 at 8 07 11 PM](https://user-images.githubusercontent.com/64552538/94217226-7db57f80-feaf-11ea-8164-dad9bef69940.png)


 
Step 12(f): Go back to Main page, the user name is highlighted in the Sign In/Register tab as follows: 

![Screen Shot 2020-09-23 at 8 10 09 PM](https://user-images.githubusercontent.com/64552538/94217323-c3724800-feaf-11ea-9d4e-1d535385449b.png)


Step 13(a): Click on Cart, when user has not signed in. You will see the display message as follows:

![Screen Shot 2020-09-23 at 8 10 27 PM](https://user-images.githubusercontent.com/64552538/94217388-e0a71680-feaf-11ea-850c-5ed03c60de32.png)


 
Step 13(b): Sign In, if anything is present in the cart for that user it will be displayed. Click on Cart now. All Products in the cart will be displayed as follows: 
In DB we have only price and quantity, subtotal is calculated in loginconf.JSP files.  This ensures that HomeController works fine.

![Screen Shot 2020-09-23 at 8 18 37 PM](https://user-images.githubusercontent.com/64552538/94217480-16e49600-feb0-11ea-9ca3-ba8a6086cf6c.png)


 

Step 14(a): Go back to Constructor and click on the test case by doing right click on Test Constructor class. It checks all Constructors works fine.

![Screen Shot 2020-09-23 at 8 21 12 PM](https://user-images.githubusercontent.com/64552538/94217567-57441400-feb0-11ea-9a3f-1c4fc803a591.png)

 
Step 14(b): All Test cases should pass as follows:

![Screen Shot 2020-09-23 at 8 21 27 PM](https://user-images.githubusercontent.com/64552538/94217630-7d69b400-feb0-11ea-9844-5c1a7bd4f395.png)


 
Step 14(c) : Run Test Case for User Service Test to check if User is created successfully 

![Screen Shot 2020-09-23 at 8 21 37 PM](https://user-images.githubusercontent.com/64552538/94217923-3203d580-feb1-11ea-81ec-e38ef7eea137.png)



Step 14 (d) : The Test case should pass as follows: 

![Screen Shot 2020-09-23 at 8 21 59 PM](https://user-images.githubusercontent.com/64552538/94217749-c7529a00-feb0-11ea-913b-4efc6f4c739f.png)

  

 
