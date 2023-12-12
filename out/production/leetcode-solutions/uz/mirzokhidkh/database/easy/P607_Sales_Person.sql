select t.name
from SalesPerson t
where t.sales_id not in (
    select s.sales_id
    from SalesPerson s
             inner join Orders o on s.sales_id = o.sales_id
             inner join Company c on o.com_id = c.com_id
    where c.name = 'RED'
)
