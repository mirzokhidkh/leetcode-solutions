select t.patient_id, t.patient_name, t.conditions
from Patients t
where SUBSTR(t.conditions, 1, 5) like 'DIAB1%'
   or REGEXP_LIKE(t.conditions, ' DIAB1 ')
   or REGEXP_LIKE(t.conditions, ' DIAB1')