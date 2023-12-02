select u.user_id user_id ,
       INITCAP(u.name) name
from Users u
order by u.user_id;

select u.user_id user_id ,
   CONCAT(UPPER(SUBSTR(u.name,1,1)),LOWER(SUBSTR(u.name,2)))  name
from Users u
order by user_id;

