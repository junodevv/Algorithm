-- 코드를 입력하세요
SELECT fh.FLAVOR 
FROM FIRST_HALF as fh JOIN ICECREAM_INFO as ii ON fh.FLAVOR = ii.FLAVOR
WHERE fh.TOTAL_ORDER > 3000 
  AND ii.INGREDIENT_TYPE = 'fruit_based'
  ORDER BY fh.TOTAL_ORDER desc;