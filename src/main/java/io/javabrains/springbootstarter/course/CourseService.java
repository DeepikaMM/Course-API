package io.javabrains.springbootstarter.course;

//import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
//	List<Topic> topics =new ArrayList<>( Arrays.asList(
//			new Topic("spring", "SpringFramework", "sparing framewrk"),
//			new Topic("JS","Java script", "java java")
//			));
			
    public List<Course> getAllCourses(String topicId) {
    	//List<Course> courses= new ArrayList<>();
    	return courseRepository.findByTopicId(topicId);
    	//return courses;
    }
    
//    public Topic getTopic(String Id) {
//    	return topicRepository.findById(Id);
//    	//return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
//    }
    public void addCourse(Course course) {
    	courseRepository.save(course);
    	//topics.add(topic);
    }
    public void updateCourse(Course topic, String id)
    {
//       for( i=0; i<topics.size();i++)
//       {
//    	   Topic t =topics.get(i);
//    	   if(t.getId().equals(id))
//    	   {
//    		   topics.set(i,topic);
//    		   return ;
//    	   }
//       }
    	courseRepository.save(topic);
    }
    public void deleteCourse(String id)
    {
//    	 for( i=0; i<topics.size();i++)
//         {
//      	   Topic t =topics.get(i);
//      	   if(t.getId().equals(id))
//      	   {
//      	      topics.remove(i);
//      		   return ;
//      	   }
//         }
    	courseRepository.deleteById(id);
    }
    public void setTopic(Topic topic)
    {
    	
    }
}
