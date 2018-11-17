package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	@Autowired
	private TopicRepository topicRepository;
//	List<Topic> topics =new ArrayList<>( Arrays.asList(
//			new Topic("spring", "SpringFramework", "sparing framewrk"),
//			new Topic("JS","Java script", "java java")
//			));
			
    public List<Topic> getAllTopics() {
    	List<Topic> topics= new ArrayList<>();
    	topicRepository.findAll().forEach(topics::add);;
    	return topics;
    }
    
//    public Topic getTopic(String Id) {
//    	return topicRepository.findById(Id);
//    	//return topics.stream().filter(t -> t.getId().equals(Id)).findFirst().get();
//    }
    public void addTopic(Topic topic) {
    	topicRepository.save(topic);
    	//topics.add(topic);
    }
    public void updateTopic(Topic topic, String id)
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
    	topicRepository.save(topic);
    }
    public void deleteTopic(String id)
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
    	topicRepository.deleteById(id);
    }
}
