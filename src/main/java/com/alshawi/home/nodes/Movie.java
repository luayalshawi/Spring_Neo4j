package com.alshawi.home.nodes;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {

	  @GraphId 
	  private Long id;
	  private String title;
	  public void setId(Long id)
	  {
		  this.id = id;
	  }
	  public void setName(String title)
	  {
		  this.title= title;
	  }
	  public String gettitle()
	  {
		  return title;
	  }	  
	  	  
}
