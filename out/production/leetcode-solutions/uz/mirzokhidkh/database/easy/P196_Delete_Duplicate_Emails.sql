delete
from person t
where t.id not in (select min(p.id)
                   from person p
                   group by p.email
)


