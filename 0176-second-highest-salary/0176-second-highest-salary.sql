# Write your MySQL query statement below
SELECT max(salary) AS SecondHighestSalary from Employee
Where salary <> (Select max(salary) from Employee);