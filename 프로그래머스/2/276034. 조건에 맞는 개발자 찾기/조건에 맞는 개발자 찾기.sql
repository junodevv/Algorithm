-- 코드를 작성해주세요
SELECT DISTINCT ID, EMAIL, FIRST_NAME, LAST_NAME
FROM DEVELOPERS
WHERE 
(SELECT CODE FROM SKILLCODES WHERE NAME='C#') = (SKILL_CODE&(SELECT CODE FROM SKILLCODES WHERE NAME='C#')) 
OR
(SELECT CODE FROM SKILLCODES WHERE NAME='python') = (SKILL_CODE&(SELECT CODE FROM SKILLCODES WHERE NAME='python'))
ORDER BY ID asc;