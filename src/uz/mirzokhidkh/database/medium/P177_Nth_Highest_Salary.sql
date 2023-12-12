CREATE FUNCTION getNthHighestSalary(N IN NUMBER)
    RETURN NUMBER IS
           result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */

-- SELECT salary
-- into result
-- FROM (SELECT salary
--       from (SELECT distinct salary
--             FROM employee
--             order by salary desc
--             offset N-1 rows fetch next 1 rows only));


SELECT salary
into result
FROM (SELECT salary, rownum rn
      from (SELECT distinct salary
            FROM employee
            order by salary desc))
where rn = N;


RETURN result;
END;