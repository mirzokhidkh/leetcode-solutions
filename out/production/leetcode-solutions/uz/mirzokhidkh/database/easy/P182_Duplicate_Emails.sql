select t.email
from person t
group by t.email
having count(t.email) > 1

