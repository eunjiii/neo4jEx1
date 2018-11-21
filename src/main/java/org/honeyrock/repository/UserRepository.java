package org.honeyrock.repository;

import java.util.Collection;

import org.honeyrock.domain.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long>{

	@Query("MATCH (u:User)<-[r:RATED]-(m:Movie) RETURN u,r,m")
	Collection<User> getAllUsers();

}
