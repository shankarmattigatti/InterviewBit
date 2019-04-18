SELECT m.movie_title
FROM movies m
JOIN movies_cast mc ON mc.movie_id = m.movie_id 
JOIN actors a ON a.actor_id = mc.actor_id
WHERE a.actor_id IN (
SELECT actor_id 
FROM movies_cast 
GROUP BY actor_id HAVING COUNT(*) >= 2);