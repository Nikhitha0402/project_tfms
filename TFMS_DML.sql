use TFMS;
insert into trainer_details values('1001','GANGADHR PARDE', 'java', 'M.TECH', '10 YRS'),
('1002','GANGADHR PARDE', 'java', 'M.TECH', '10 YRS'),
('1003','PREETI AGRWAL', 'mainframe', 'M.TECH', '10 YRS'),
('1004','AKASH SOLANKE', 'testing', 'M.TECH', '10 YRS');

INSERT INTO Associate VALUES('101','Aakash','Java','M-Tech','5'),
('102','krunal','Mainframe','M.sc','6'),
('103','vasavi','testing','MCA','8'),
('104','prathamesh','DotNet','B-Tech','7'),
('105','Ankita','Java','M-Tech','10'),
('106','Swaraj','Mainframe','MCA','12'),
('107','ram','testing','MCA','12'),
('108','shriram','DotNet','B.tech','20'),
('109','veera','Java','M-Tech','12'),
('110','hemlata','Mainframe','M.sc','12');



insert into batch values
('Core Java','4600','2022-12-12','2023-03-12','1001','101'),
('Maven','3400','2022-12-12','2023-03-12','1003','104'),
('Angular','2200','2022-12-12','2023-03-12','1002','102'),
('Spring','2500','2022-12-12','2023-03-12','1004','103');

insert into question_management values
('Q1','Instructor','Instructor knowledgeable and handle all your queries'),
('Q2','Instructor','All the topics in a particular course handled by the trainer without any gaps or slipages'),
('Q3','Course Material','The course material(presentation,hands on,etc.) referred during the training are relevent and useful'),
('Q4','Course Material','The reference material referred for each module are adequate'),
('Q5','Learning Effectiveness','Knoweledge and skills presented in this training are applicable to your work'),
('Q6','Environment','The physical environment(classroom space,air-conditioning) was conductive to learning'),
('Q7','Environment','The software/hardware environment provided was sufficient for the purpose of the training'),
('Q8','Job Impact','This training will improve your job performance');


insert into capture_feedback values 
('1001','103','Core Java','Q1','Instructor','How does instructor communicate with the class',4),
('1001','103','Core Java','Q2','Course Material','Have instructor provided proper course study material',3),
('1001','103','Core Java','Q3','Learning Effectiveness','Are your all doubts being addressed and solved by the instructor',4),
('1001','103','Core Java','Q4','Environment','How is the environment of the class',5),
('1001','103','Core Java','Q5','Job Impact','How did the course help you in your job or project',3),
('1001','103','Core Java','Q6','Environment','How is the environment of the class',3),
('1001','103','Core Java','Q7','Environment','How is the environment of the class',4),
('1001','103','Core Java','Q8','Job Impact','This training will improve your job performance',5);
insert into capture_feedback values ('1002','104','JDBC','Q1','Instructor','How does instructor communicate with the class',4),
('1002','104','JDBC','Q2','Course Material','Have instructor provided proper course study material',3),
('1002','104','JDBC','Q3','Learning Effectiveness','Are your all doubts being addressed and solved by the instructor',4),
('1002','104','JDBC','Q4','Environment','How is the environment of the class',5),
('1002','104','JDBC','Q5','Job Impact','How did the course help you in your job or project',3),
('1002','104','JDBC','Q8','Job Impact','How did the course help you in your job or project',4);

delete from capture_feedback where Associate_id="103";

















