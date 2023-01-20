use tfms;
create table user
(
username varchar(30),
password varchar(25),
role varchar(30)
);
insert into user values('Vasavi','v123','admin'),('Nikhitha','n123','associate'),('Swapna','s123','trainer');
select*from user;