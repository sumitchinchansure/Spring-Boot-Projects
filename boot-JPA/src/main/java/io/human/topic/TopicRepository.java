package io.human.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {

	//CrudRepository<Topic, String> is class developed by Spring team which contains 
	// all the basic CRUD operations one will need.
}
