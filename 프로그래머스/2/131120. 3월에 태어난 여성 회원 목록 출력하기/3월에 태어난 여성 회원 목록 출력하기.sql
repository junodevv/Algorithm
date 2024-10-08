-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, "%Y-%m-%d")
FROM MEMBER_PROFILE
WHERE GENDER = 'W'
  AND DATE_OF_BIRTH like '%-03-%'
  AND TLNO is NOT NULL
ORDER BY MEMBER_ID asc;