-- 코드를 작성해주세요
-- 2번 형질이 보유하지 않으면서 1번이나 3번 형질을 보유하고 있는 대장균
-- 0001, 0100, 0101, 1001, 1100, 1101
--    1,    4,    5,    
SELECT COUNT(*) as COUNT
FROM ECOLI_DATA
WHERE (GENOTYPE & 5) > 0
AND (GENOTYPE & 2) = 0;