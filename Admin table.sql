use tfms;
create table admin
(
trainer_id varchar(20),
question_section varchar(40),
topic_name varchar(40),
rating_section int,
rating_topic int,
overall_rating float(4,3)
);
select *from admin;

insert into admin values('1001','Instructor','Core Java',4,5,'4.500');
insert into admin values('1001','Instructor','Maven',4,3,'3.500');
insert into admin values('1001','Instructor','Angular',4,4,'4.000');
insert into admin values('1001','Instructor','Spring',4,5,'4.500');
insert into admin values('1002','Instructor','Core Java',3,5,'4.000');
insert into admin values('1002','Instructor','Maven',3,4,'3.500');
insert into admin values('1002','Instructor','Angular',3,5,'4.000');
insert into admin values('1002','Instructor','Spring',3,4,'3.500');