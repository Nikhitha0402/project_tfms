use tfms;
drop table  if exists user;

create table user
(
username varchar(30),
password varchar(25),
role varchar(30)
);
insert into user values('Nikhitha','n123','admin'),('Vasavi','v123','associate'),('103','l123','associate'),('Prathamesh','p123','associate'),('Gangadhr parde','g123','trainer'),('akshay','a123','trainer');
select*from user;