update Salary t
set t.sex = case
                when t.sex = 'm' then 'f'
                else 'm' end;
