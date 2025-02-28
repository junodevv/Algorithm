-- 코드를 입력하세요
SELECT 
    MEMBER_ID, 
    MEMBER_NAME, 
    GENDER, 
    TO_CHAR(DATE_OF_BIRTH, 'YYYY-MM-DD') as DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE TO_CHAR(DATE_OF_BIRTH, 'MM') = '03'
  AND GENDER = 'W'
  AND TLNO IS NOT NULL
ORDER BY MEMBER_ID asc

-- 1. 3월 추출: DATE형을 문자로(to_char)변환해서 문자열을 매치
-- 2. NULL 값 제외: IS NOT NULL