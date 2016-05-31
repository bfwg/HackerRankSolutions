/*
Enter your query here.
*/
SELECT CONCAT(Name, '(', LEFT(Occupation, 1), ')') FROM OCCUPATIONS ORDER BY Name;

SELECT CONCAT("There are total ", COUNT(Occupation), " ", LOWER(Occupation), "s.") FROM OCCUPATIONS GROUP BY Occupation ORDER BY 1, Occupation;
