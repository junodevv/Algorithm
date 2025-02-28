-- 코드를 입력하세요
# SELECT DISTINCT o1.USER_ID, o1.PRODUCT_ID
# FROM ONLINE_SALE as o1, ONLINE_SALE as o2
# WHERE o1.USER_ID = o2.USER_ID
# AND o1.PRODUCT_ID = o2.PRODUCT_ID
# AND o1.SALES_DATE != o2.SALES_DATE
# ORDER BY USER_ID asc, PRODUCT_ID desc;

SELECT USER_ID, PRODUCT_ID
FROM ONLINE_SALE
GROUP BY USER_ID, PRODUCT_ID
HAVING count(*) >= 2
ORDER BY USER_ID asc, PRODUCT_ID desc;