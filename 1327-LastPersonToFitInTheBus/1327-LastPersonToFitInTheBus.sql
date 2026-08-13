-- Last updated: 13/08/2026, 09:25:06

# Write your MySQL query statement below
SELECT person_name FROM Queue q1 WHERE 1000 >= ( SELECT SUM(weight) FROM Queue q2 WHERE q2.turn <= q1.turn )ORDER BY turn DESC LIMIT 1;