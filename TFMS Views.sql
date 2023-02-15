use tfms;
drop view bySection;
create view bySection as select (select distinct(t.trainer_name) from trainer_details t 
join capture_feedback x on t.trainer_id=x.trainer_id where x.trainer_id=f.trainer_id) as 'TrainerName',f.topic_name as 'Topic',q.question_section as 'Section',avg(f.rating) as 'AverageRatingbySection' from capture_feedback f join question_management q on f.question_id=q.question_id 
group by f.trainer_id,f.topic_name,q.question_section order by f.trainer_id;

select*from bySection;

drop view byTrainer;
create view byTrainer as select t.trainer_name as 'TrainerName',avg(f.rating) as 'Rating' from capture_feedback f join trainer_details t on f.trainer_id=t.trainer_id group by f.trainer_id;
select v1.TrainerName,v1.Topic,v1.Section,v1.AverageRatingbySection,v2.Rating from bySection v1 join byTrainer  v2 on v1.TrainerName=v2.TrainerName;