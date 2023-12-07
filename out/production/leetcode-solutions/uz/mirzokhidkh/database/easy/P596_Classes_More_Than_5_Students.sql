select t.class
from Courses t
group by t.class
having count(*) > 4;