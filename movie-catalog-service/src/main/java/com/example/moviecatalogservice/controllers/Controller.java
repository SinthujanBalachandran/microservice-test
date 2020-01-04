package com.example.moviecatalogservice.controllers;

import java.util.List;
import java.util.Collections;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.moviecatalogservice.entities.Model;

@RestController
@RequestMapping("/catalog")
public class Controller {
	@RequestMapping("/{userId}")
	public List<Model> getCatelog(@PathVariable("userId") String userId){
		return Collections.singletonList(new Model("Transformers","Test","4"));
	}

}
