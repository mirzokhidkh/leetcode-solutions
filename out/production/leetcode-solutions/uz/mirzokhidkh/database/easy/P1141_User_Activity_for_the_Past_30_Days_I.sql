select to_char(t.activity_date,'yyyy-mm-dd') day, count(distinct t.user_id ) active_users
from Activity  t
where activity_date between to_date( '2019-07-28', 'yyyy-mm-dd' )-30 and '2019-07-27'
group by t.activity_date