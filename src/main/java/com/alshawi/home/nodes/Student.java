package com.alshawi.home.nodes;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Student {
	@GraphId 
	private Long ID;	
	private String name;
	private String major;
	private String university;
	
	public void setName(String n){name = n;}
	public void setMajor(String m){major = m;}	
	public void setUniversity(String u){university = u;}
	public void setID(long n){ID =  n;}
	public String getName(){return name;}
	public String getMajor(){return major;}	
	public String getUniversity(){return university;}
	public Long getID(){return ID;}
}
