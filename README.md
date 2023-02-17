# Project_tfms P0 <br>
I have worked on the project called "Trainee Feedback Management System".<br>
In this project I have used technologies like Mysql,Java,logger4j,junit.<br>
In this project my usecase is "Capture Feedback". <br>
For this: <br>
1.I have created ER diagram <br>
2.I have created Capture feedback Table using DDL in sql workbench.This table contains three foreign keys which are taken from the tables Trainer,Associate,Question management.I have used joins on two tables called question management and capture feedback in order to get "Average rating by section'","Average Topic Rating","Average Trainer Rating".Then I have created one more table User for Authentication.<br>
3.In eclipse I created Maven project In pom.xml file then I have added apache.maven plugin.<br>
4.I have created POJO classes for Capture feedback ,User then in dao layer I created inferface which consist of abstract methods (i)setFeedback (ii)showFeedback  All these methods are implemented in dao.impl layer. In service layer there are interfaces for setFeedbackInput and showFeedbackDetailsByParameters and these are implemented in service.impl.I have also written code in application class in order to run these methods.<br>
5.While implementing, to establish connection between mysql and eclipse  I have used JDBC, I have added mysql-connector-j dependency in my pom.xml file then added database.propeties file I have established connection using singleton JDBC connection.<br>
6.For logging purpose I have added logger4j dependency in pom.xml.<br>
7.For testcases I have added junit dependency in pom.xml I have created testcases for i)Establishing connection ii)User authentication .<br>

# Project_tfms P1 <br>

1)I have created two views: <br>
i)bySection and ii)byTrainer <br>
----- bySection view is created for selecting particular columns from trainer_details table and there i have applied a join on two tables called question management and capture feedback in order to get "Average rating by section".<br>
-----byTrainer view is created for selecting particular columns from trainer_details and there i have applied a join on two tables called trainer_details and capture feedback in order to get rating according to trainer.<br>
------The main purpose of creating these views is, by combining these two views i can able to see a single table which contains trainer-name,topic,section,topic-wise rating and overall rating.<br>
2)In eclipse I have created Maven project using web-app archetype then in pom.xml file I have added the dependencies for servlets,jsp,mysql also I have added the plugin for tomcat server.So with the help of server my entire application can be run.<br>
3)In com.revature.config package I have created a class named CoonectionFactory in order to establish the connection between mysql and eclipse.
4)Then I have created Jsp files and servlets.<br>
5)Jsp files and all my assets for project are stored in webapp folder.<br>
6)I have implemented two servlets <br>
---i)"LoginAuthentication" which is exectued when LoginFile.jsp  is submitted.<br>
--ii)"Done" which is executed when GiveFeedback.jsp is submitted.<br>



This is all about my project.
