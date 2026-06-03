# Write your MySQL query statement below
SELECT eu.unique_id, e.name 
FROM  Employees e
left Join EmployeeUNI eu
on e.id = eu.id;