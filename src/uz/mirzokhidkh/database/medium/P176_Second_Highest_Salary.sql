select max(t.salary) SecondHighestSalary
from Employee t
where t.salary < (select max(salary) from Employee)


