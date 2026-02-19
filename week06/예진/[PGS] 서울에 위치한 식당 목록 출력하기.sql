SELECT info.rest_id
     , info.rest_name
     , info.food_type
     , info.favorites
     , info.address
     , IFNULL(review.score, 0) AS score
  FROM REST_INFO info
       JOIN (SELECT rest_id
                  , ROUND(AVG(review_score), 2) AS score
               FROM REST_REVIEW
              GROUP BY rest_id
            ) review
       ON info.rest_id = review.rest_id 
 WHERE info.address LIKE '서울%'
 ORDER BY review.score DESC, info.favorites DESC