package com.techcraft.springboot.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	/*
	 * private List<Course> topics_old = new ArrayList<>(Arrays.asList(new
	 * Course("Spring", "Spring Framework", "Spring Framework description"), new
	 * Course("Java", "Core Java", "Core Java description"), new
	 * Course("JavaScript", "JavaScript", "JavaScript description")));
	 */
	
	public List<Course> getAllCourses(String topicId){
		//return topics;
		/*
		 * List<Course> topics = new ArrayList<>();
		 * courseRepository.findAll().forEach(topics::add); return topics;
		 */
		List<Course> topics = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(topics::add);
		return topics;

	}
	
	public Optional<Course> getCourse(String id) {
		//return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
		
	}

	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		//topics.add(topic);	
		courseRepository.save(course);
	}

	public void updateCourse(Course topic) {
		// TODO Auto-generated method stub
		/*public void updateCourse(String id, Course topic) {
		 * for(int i=0; i<topics.size(); i++) { Topic t= topics.get(i);
		 * if(t.getId().equals(id)) { topics.set(i, topic); }
		 * 
		 * }
		 */
		
		courseRepository.save(topic);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		//topics.removeIf(t->t.getId().equals(id));
		courseRepository.deleteById(id);
	}
	
}
