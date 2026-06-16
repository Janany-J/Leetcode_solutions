SELECT MAX(salary) as SecondHighestSalary
FROM Employee
WHERE salary < (Select max(salary) from Employee);