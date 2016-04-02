package com.alshawi.home.bean;

import javax.annotation.ManagedBean;

import com.alshawi.home.nodes.Movie;

@ManagedBean(value="movieBean")
public class MovieBean {

	private Movie movie = new Movie();

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
//	public void create()
//	{
//		ClassPathre
//	}
}
