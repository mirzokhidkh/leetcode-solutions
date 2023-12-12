/* Write your PL/SQL query statement below */
select t.player_id, min(to_char(t.event_date, 'yyyy-mm-dd')) first_login
from activity t
group by t.player_id




