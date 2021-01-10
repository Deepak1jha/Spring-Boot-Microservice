package com.skills.Skills;

import com.skills.Skills.service.VideoStreamingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SkillsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillsApplication.class, args);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
		VideoStreamingService videoStreamingService = context.getBean("videoStreamingService",VideoStreamingService.class);
		context.close();
	}

}
