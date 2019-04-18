SELECT m.movie_title, m.movie_year,
       CONCAT(d.director_first_name , d.director_last_name) as director_name,
       CONCAT(a.actor_first_name , a.actor_last_name) as actor_name,
       mc.role
    FROM movies m
    JOIN movies_cast mc ON m.movie_id = mc.movie_id
    JOIN actors a ON mc.actor_id = a.actor_id
    JOIN movies_directors md ON m.movie_id = md.movie_id
    JOIN directors d ON md.director_id = d.director_id
	WHERE movie_time = (SELECT MIN(movie_time) FROM movies);
       