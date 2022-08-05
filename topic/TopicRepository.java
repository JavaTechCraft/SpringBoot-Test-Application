package com.techcraft.springboot.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String>{
	
	//getAllTopics()
	//getTopic(String id)
	//deleteTopic(String id)
	//updateTopic(Topic topic)

}
