package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.model.Document;
import com.demo.model.Message;
import com.demo.model.User;
import com.demo.repository.DocumentRepository;
import com.demo.repository.MessageRepository;
import com.demo.repository.UserRepository;
import com.demo.service.DocumentService;
import com.demo.service.MessageService;
import com.demo.service.UserService;

@SpringBootApplication
public class RecapProjetHibernateRunnerApplication implements CommandLineRunner {
@Autowired
UserService userService;
@Autowired
DocumentService documentService;
@Autowired
MessageService messageService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(RecapProjetHibernateRunnerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		User u1= new User("test@gmail.com", "admin", "mypass", "user1", "userfirstname");
//		User u2=userService.createUser(u1); // pour récupérer l'instance qui sera insérer 
		//Document d1=new Document("document pdf du cours", "www.duranco.com/cours", "cours java EE", u2);
		//documentService.addDocument(d1);
		//Message m=new Message("bonjour","hello hibernate it is me spring", u2);
		//messageService.sendMessage(m);
		List<User> users=new ArrayList<User>();
		
		users=userService.readUsers();
		for(User us: users)
		{
			System.out.println(us.toString());
		
		}
		
		
		
		
	}

}
