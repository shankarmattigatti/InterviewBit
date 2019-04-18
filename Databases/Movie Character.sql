SELECT m.movie_title,
    CONCAT(d.director_first_name , d.director_last_name) as director_name
	FROM movies m
	JOIN movies_cast mc ON m.movie_id = mc.movie_id
	JOIN movies_directors md ON m.movie_id = md.movie_id
	JOIN directors d ON md.director_id = d.director_id
	WHERE mc.role = 'SeanMaguire';