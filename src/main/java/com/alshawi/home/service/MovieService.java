package com.alshawi.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alshawi.home.nodes.Movie;
import com.alshawi.home.repository.MovieRepository;

@Service("movieService")
public class MovieService {

	@Autowired
	private MovieRepository movieRespitory;
	
	public Movie create(Movie m)
	{
		return movieRespitory.save(m);
	}
	public long numelemnt(){return movieRespitory.count();}
	public String gtitle(String t)
	{
		return movieRespitory.getMovieFromTitle(t).gettitle();
	}
}
