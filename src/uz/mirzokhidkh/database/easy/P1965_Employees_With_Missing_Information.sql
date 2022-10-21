select case
           when a.employee_id is not null then a.employee_id
           else b.employee_id
           end employee_id
from Employees a
         full outer join Salaries b
                         on a.employee_id = b.employee_id
where a.name is not null and b.salary is null
   or a.name is null and b.salary is not null
order by employee_id;



-- SELECT employee_id FROM Employees WHERE employee_id NOT IN (SELECT employee_id FROM Salaries)
-- UNION
-- SELECT employee_id FROM Salaries WHERE employee_id NOT IN (SELECT employee_id FROM Employees)
-- ORDER BY employee_id;