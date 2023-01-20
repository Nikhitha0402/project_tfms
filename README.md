# project_tfms
I have worked on the project called "Trainee Feedback Management System".
In this project I have used technologies like Mysql,Java,logger4j,junit.
In this project my usecase is "Capture Feedback". 
For this: 
1.I have created ER diagram 
2.I have created Capture feedback Table using DDL in sql workbench.This table contains three foreign keys which are taken from the tables Trainer,Associate,Question management. Then I have created one more table for User for Authentication.
3.In eclipse I created Maven project In pom.xml file then I have added apache.maven puglin.
4.I have created POJO classes for Capture feedback User then in dao layer I created inferface which consist of abstract methods (i)setFeedback (ii)showFeedback  All these methods are implemented in dao.impl layer. In service layer there are interfaces for setFeedbackInput and showFeedbackDetailsByParameters and these are implemented in service.impl.I have also written code in application class in order to run these methods. 
5.While implementing, to establish connection between mysql and eclipse  I have used JDBC, I have added mysql-connector-j dependency in my pom.xml file then added database.propeties file I have established connection using singleton JDBC connection.
6.For logging purpose I have added logger4j dependency in pom.xml.
7.For testcases I have added junit dependency in pom.xml I have created testcases for i)establishing connection ii)authentication user.

This is all about my project.
