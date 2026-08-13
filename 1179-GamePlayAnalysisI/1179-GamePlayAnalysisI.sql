-- Last updated: 13/08/2026, 09:25:37
# Write your MySQL query statement below
select player_id,min(event_date) as first_login
from Activity
group by player_id