package com.example.ratingdataservice.controllers;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingdataservice.models.Rating;

@RestController
@RequestMapping("/ratingsData")
public class RatingController {
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId){
		return new Rating(movieId,5);
	}

}
