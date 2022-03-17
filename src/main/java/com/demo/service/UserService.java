package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repository.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository userRepository;
public User createUser(User u)
{
	return userRepository.save(u);
}
public List<User> readUsers()
{
	
return userRepository.findAll();
}
public void deleteUser(int id)
{
userRepository.deleteById(id);	
}

}
