package com.alshawi.home.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alshawi.home.repository.MovieRepository;

@Controller
public class HomeController {

	@Autowired
	MovieRepository m;
	@RequestMapping("/")
	public String showHome()
	{
 //= new MovieService();
		
//		System.out.println(m.count());
//		System.out.println(m.getMovieFromId(0).gettitle());
//		System.out.println(m.getMovieFromId(100).gettitle());
//		Movie mymovie = new Movie();
//		
//		mymovie.setName("Alshawi Movie");
//		m.save(mymovie);

		return "home";
	}
}
