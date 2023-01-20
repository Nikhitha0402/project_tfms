create database TFMS;
use TFMS;
Drop table if exists trainer_details;
create table trainer_details(
trainer_id varchar(15) PRIMARY KEY,
trainer_name varchar(255) NOT NULL,
trainer_track enum('Java','dotnet','mainframe','testing')NOT NULL,
qualification varchar(55)NOT NULL,
experience varchar(15)NOT NULL
);
Drop table if exists Associate;
create table Associate(
Associate_id varchar(40) PRIMARY KEY NOT NULL,
Associate_name varchar(30),
Associate_track enum('Java','dotnet','mainframe','testing') NOT NULL,
Associate_qualification varchar(255),
Associate_exp varchar(3)
);

Drop table if exists batch;
create table batch(
topic_name varchar(255),
batch_duration integer, 
start_date date,
end_date date,
trainer_id varchar(10),
FOREIGN KEY (trainer_id) REFERENCES trainer_details(trainer_id),
Associate_id varchar(10),
FOREIGN KEY (Associate_id) REFERENCES Associate(Associate_id)
);


Drop table if exists question_management;
create table question_management(
question_id varchar(10) primary key,
question_section enum('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
question_text varchar(300)
);


Drop table if exists capture_feedback;
create table capture_feedback(
trainer_id varchar(15),
FOREIGN KEY (trainer_id) REFERENCES trainer_details(trainer_id),
Associate_id varchar(40),
FOREIGN KEY (Associate_id) REFERENCES Associate(Associate_id),
topic_name varchar(255),
question_id varchar(10),
foreign key (question_id) references question_management(question_id),
question_section enum('Instructor','Course Material','Learning Effectiveness','Environment','Job Impact'),
question_text varchar(255),
rating int
);