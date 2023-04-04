package org.techinfo.starter.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topic")
	public List<Topic> getAllTopic() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framwork Description"),
				new Topic("Java", "Core Java", "Core Java Description"),
				new Topic("Javascript", "JavaScript", "JavaScript Description")
				
				);
	}

}
