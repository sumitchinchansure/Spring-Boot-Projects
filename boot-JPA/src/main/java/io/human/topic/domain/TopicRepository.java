package io.human.topic.domain;

import org.springframework.data.repository.CrudRepository;

import io.human.topic.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

	//CrudRepository<Topic, String> is class developed by Spring team which contains 
	// all the basic CRUD operations one will need.
}
