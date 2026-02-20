-- 코드를 입력하세요
SELECT 
    r.REST_ID,
    r.REST_NAME,
    r.FOOD_TYPE,
    r.FAVORITES,
    r.ADDRESS,
    ROUND(AVG(rv.REVIEW_SCORE), 2) AS SCORE  -- 소수점 3번째에서 반올림 = 2자리 유지
FROM REST_INFO r
JOIN REST_REVIEW rv ON r.REST_ID = rv.REST_ID  -- 식당ID 기준으로 연결
WHERE r.ADDRESS LIKE '서울%'                 
GROUP BY 
    r.REST_ID, 
    r.REST_NAME, 
    r.FOOD_TYPE, 
    r.FAVORITES, 
    r.ADDRESS                                
ORDER BY 
    SCORE DESC,r.FAVORITES DESC;