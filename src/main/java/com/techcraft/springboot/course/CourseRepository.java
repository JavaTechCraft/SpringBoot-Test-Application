package com.techcraft.springboot.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{
	
	//getAllTopics()
	//getTopic(String id)
	//deleteTopic(String id)
	//updateTopic(Topic topic)
	
	public List<Course> findByTopicId(String topicId);
	
}
