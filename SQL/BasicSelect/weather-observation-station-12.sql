/*
Enter your query here.
*/
SELECT CITY FROM STATION WHERE LOWER(CITY) REGEXP '^[^aeiou].*[^aeiou]$' GROUP BY CITY;
