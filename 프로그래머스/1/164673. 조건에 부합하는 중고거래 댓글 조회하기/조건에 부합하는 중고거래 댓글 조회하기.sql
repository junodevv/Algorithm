-- 코드를 입력하세요
-- 2022년 10월에 작성된, 댓글 작성일을 기준으로 오름차순 정렬, 댓글 작성일이 같다면 게시글 제목을 기준으로 오름차순 정렬
-- "b.게시글 제목, **b.게시글 ID**, r.댓글 ID, r.댓글 작성자 ID, r.댓글 내용, r.댓글 작성일"
SELECT 
    b.TITLE,
    b.BOARD_ID,
    r.REPLY_ID,
    r.WRITER_ID,
    r.CONTENTS,
    DATE_FORMAT(r.CREATED_DATE, '%Y-%m-%d') as 댓글작성일
FROM USED_GOODS_BOARD as b JOIN USED_GOODS_REPLY as r
  ON b.BOARD_ID = r.BOARD_ID
WHERE #DATE_FORMAT(b.CREATED_DATE, '%Y-%m') = '2022-10'
      b.CREATED_DATE LIKE '2022-10%'
ORDER BY r.CREATED_DATE asc, b.TITLE asc;