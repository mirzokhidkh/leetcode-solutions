select to_char(sell_date, 'YYYY-MM-DD') sell_date,
       count(t.product)                 num_sold,
       LISTAGG(t.product, ',')          WITHIN GROUP (ORDER BY t.product) products
from (select distinct sell_date, product
    from activities) t
group by t.sell_date






