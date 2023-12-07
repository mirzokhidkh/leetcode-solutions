select t.name Employee
from Employee t
where t.salary > (select e.salary from Employee e where e.id = t.managerId);
