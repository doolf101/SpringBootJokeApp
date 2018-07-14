package com.ciaranflood.joke.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ciaranflood.joke.services.JokeService;

@Controller
public class JokeControler {
	
	@Autowired
	private JokeService jokeService;
	
	@RequestMapping({"/",""})
	public String showJoke(Model model) {
		String joke = jokeService.getJoke();
		model.addAttribute("joke",joke);
		System.out.println(joke);
		return "chucknorris";
	}
	
}
