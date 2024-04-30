package com.SpringBootWithJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBootWithJPA.DAO.UserRepository;
import com.SpringBootWithJPA.Entities.User;

@SpringBootApplication
public class SpringBootWithJpaApplication {

	public static void main(String[] args) {
		ApplicationContext Context = SpringApplication.run(SpringBootWithJpaApplication.class, args);
		UserRepository userRepository = Context.getBean(UserRepository.class);
		User user = new User();
		user.setId(13);
		user.setName("Abhay Kumar");
		user.setCity("Sasaram");
		user.setState("Daudnagar");
		
		
		User user2 = userRepository.save(user);
		System.out.println(user2);
	}


}
