-- Last updated: 13/08/2026, 09:23:56
# Write your MySQL query statement below
SELECT euni.unique_id, e.name 
FROM Employees e  
LEFT JOIN EmployeeUNI euni  
ON e.id = euni.id;