package org.honeyrock.aa;

import java.util.List;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class User {

	@GraphId
	private Long id;
	private String name;
	private Integer age;
	
	@Relationship(type="RATED", direction=Relationship.INCOMING)
	private List<Movie> movies;
	
	public List<Movie> getMovies() {
		return movies;
	}

	public User() {
		
		
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	
	
}
