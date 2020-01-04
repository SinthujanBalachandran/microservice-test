package com.example.movieinfoservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.movieinfoservice.models.Movies;

@RestController
@RequestMapping("/movies")
public class MovieController {
	@RequestMapping("/{movieId}")
	public List<Movies> getMovies(@PathVariable("movieId")String movieId){
		return Collections.singletonList(
				new Movies(movieId,"TestName")
				);
	}

}
