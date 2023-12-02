select t1.id
from weather t1
         inner join weather t2 on to_char(t1.recordDate, 'yyyy-mm-dd') = to_char(t2.recordDate + 1, 'yyyy-mm-dd')
where t1.temperature > t2.temperature;
