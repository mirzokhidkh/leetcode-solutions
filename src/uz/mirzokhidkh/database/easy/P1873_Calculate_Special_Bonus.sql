-- # Write your MySQL query statement below
select t.employee_id,
       case
           when (t.employee_id % 2) <> 0 and t.name not like 'M%' then t.salary
           else 0
           end as bonus
from Employees t order by employee_id;
