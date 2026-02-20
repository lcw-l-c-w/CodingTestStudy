-- 코드를 입력하세요
SELECT  o.rest_id, o.rest_name,o.food_type,o.favorites,o.address,FLOOR(AVG(w.review_score), 2) as score
FROM rest_info o inner join rest_review w
ON o.rest_id= w.rest_id
WHERE address like '서울%'
GROUP BY o.rest_id, 
         o.rest_name, 
         o.food_type, 
         o.favorites, 
         o.address
ORDER BY score desc,o.favorites desc