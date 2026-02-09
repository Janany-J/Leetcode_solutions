# Write your MySQL query statement below
SELECT d.name as 'Department', e.name as 'Employee',e.salary From Department d 
Join Employee e
On d.id = e.departmentId
Where e.salary = 
(Select Max(e2.salary) from Employee e2 where e2.departmentId = d.id );