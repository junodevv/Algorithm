-- 코드를 입력하세요
SELECT HOUR(DATETIME) as HOUR, COUNT(ANIMAL_ID) as COUNT
FROM ANIMAL_OUTS
GROUP BY HOUR
HAVING HOUR BETWEEN 9 and 19
ORDER BY HOUR asc;