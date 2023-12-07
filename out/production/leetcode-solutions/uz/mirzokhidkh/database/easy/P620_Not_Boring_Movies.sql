select *
from Cinema t
where mod(t.id, 2) != 0
  and t.description != 'boring'
order by t.rating desc