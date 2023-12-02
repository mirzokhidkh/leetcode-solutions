select t.user_id, count(t.follower_id) followers_count
from Followers t
group by t.user_id
order by t.user_idl