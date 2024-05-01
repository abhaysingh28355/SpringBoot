package com.SpringBootWithJPA;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

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
		//Create the User
//		User user = new User();
//		user.setId(13);
//		user.setName("Abhay Kumar");
//		user.setCity("Sasaram");
//		user.setState("Daudnagar");
//		
//		
//		User user2 = userRepository.save(user);
//		System.out.println(user2);
//		User user1 = new User();
//		user1.setId(22);
//		user1.setName("Roshan Singh");
//		user1.setCity("city1");
//		user1.setState("Rohtas");
//		
//		User user2 = new User();
//		user2.setId(23);
//		user2.setName("Abhay Singh");
//		user2.setCity("City2");
//		user2.setState("Buxer");
//		//User userResult = userRepository.save(user2);
//		List<User> list = List.of(user1,user2);
//		Iterable<User> userResult = userRepository.saveAll(list);
//		userResult.forEach(user->{
//			System.out.println(user);
//		});
//		//System.out.println("userResult are show"+userResult);
//		System.out.println("userResult done");
		
		//Update the user
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		user.setName("Jhanu Singh");
//		userRepository.save(user);
//		System.out.println(user);
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
//		itr.forEach(new Consumer<User>() {
//
//			@Override
//			public void accept(User t) {
//				// TODO Auto-generated method stub
//				System.out.println(t);
//			}
//			
//		});
		
		//Using Lamda Expression
//		itr.forEach(User->{System.out.println(User);});
		//Deleting the User of databases
//		userRepository.deleteById(103);
//		userRepository.deleteById(102);
//		userRepository.deleteById(1);
//		System.out.println("Deleting");
		
		Iterable<User> findAll = userRepository.findAll();
		findAll.forEach(User -> System.out.println(User));
		userRepository.deleteAll(findAll);
		
	}


}
