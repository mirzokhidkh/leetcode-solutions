/* Write your PL/SQL query statement below */

select to_char(t.event_day, 'yyyy-mm-dd') day, t.emp_id, sum(t.out_time - t.in_time) total_time
from Employees t
group by t.emp_id, t.event_day
order by day;