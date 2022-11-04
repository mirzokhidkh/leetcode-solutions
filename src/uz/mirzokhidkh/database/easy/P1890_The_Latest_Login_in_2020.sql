select t.user_id, max(t.time_stamp) last_stamp
from Logins t
where extract(year from t.time_stamp) = 2020
group by t.user_id
