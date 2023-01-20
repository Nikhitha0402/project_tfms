use tfms;
select*from capture_feedback;
select c.topic_name as 'Topic',q.question_section as 'Section',avg(c.rating) as 'Average Rating by Section' from capture_feedback c join question_management q on c.question_id=q.question_id group by c.topic_name, q.question_section;

select topic_name as 'Topic',avg(rating) as 'Average Topic Rating' from capture_feedback group by(topic_name);

select t.trainer_name as 'Trainer',avg(c.rating) as 'Average Trainer Rating'from capture_feedback c join trainer_details t on c.trainer_id=t.trainer_id group by c.trainer_id;
select avg(rating) from capture_feedback;