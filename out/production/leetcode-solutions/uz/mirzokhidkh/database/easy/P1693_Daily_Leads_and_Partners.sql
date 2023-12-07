select to_char(t.date_id, 'YYYY-MM-DD') date_id,
       t.make_name,
       count(distinct t.lead_id)        unique_leads,
       count(distinct t.partner_id)     unique_partners
from DailySales t
group by t.date_id, t.make_name;