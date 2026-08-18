-- Write your query below
select 
employee_id,
CASE
  WHEN employee_id % 2 = 0 THEN 0
  WHEN name like 'M%' THEN 0
  WHEN employee_id % 2 <> 0 and name not like 'M%' THEN salary 
  END as bonus
    from employees
    order by employee_id,bonus,employee_id
