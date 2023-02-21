package com.example;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("movies")
public class MovieController{
	private Map<String,Movie> movies=new concurrentHashMap<String,Movie>();
	
	public MovieController()
	{
		movie.put("M001", new Movie("M001", "TopGun",10000));
		movie.put("M002", new Movie("M002", "The Mummy", 20000));
	}
	
	@GetMapping
	public Map getMovies()
	{
		return movies;
	}
	
	@GetMapping("/{movieId}")
	publuc Movie getMovie(@PathVariable("movieId") String movieId)
	{
		return movies.get(movieId);
	}
	
	@PostMapping(path="/",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> addMovie(@RequestBody Movie movie)
	{
		movies.out(movie.getMovieId(), movie);
		return new ResponseEntity<Object>(HttpStatus.CREATED);
	}
	@PutMapping("/{movieId}")
	public ResponseEntity<Object> updateMovie(@PathVariable("movieId") String mId, @ModelAttribute("movieId")String movieId)
	{
		
		if(movies.containsKey(mId)) {
			movies.put(mId,new Movie(movieId,movieName,movieCollection));
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//204
			
		}
		else
		{
			
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);//500
		}
	}
	
	@DeleteMapping("/{movieId}")
	public ResponseEntity<Object> deleteMovie(@PathVariable("movieId")String movieId)
	{
		if(movies.containsKey(movieId))
		{
			movies.remove(movieId);
			return new ResponseEntity<Object>(HttpStatus.NO_CONTENT);//204
		}
		else
		{
			return new ResponseEntity<Object>(HttpStatus.INTERNAL_SERVER_ERROR);//500
		}
	}
}
