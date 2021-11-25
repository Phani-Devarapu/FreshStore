package com.freshstore.application.dao;

import com.freshstore.application.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.freshstore.application.repository.UserRepository;



@RestController
@CrossOrigin(origins="https://localhost:4200")
@RequestMapping(path="users")
public class usercontroller {
 
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/get")
	public List<users> getusers(){
		return userRepository.findAll();                                               
	}
	
	@PostMapping("/post")
		public boolean postusers(@RequestBody users users){
			users savedUser = userRepository.save(users);
			return savedUser !=null;
		}
	@PutMapping("/put")
	public boolean updateUser(@RequestBody users users)
	{
		users updatedUser=userRepository.save(users); 
		return updatedUser !=null;
		
	}
	
	@DeleteMapping("/delete")
	public boolean deleteUser(@RequestBody users users) 
	{
		 userRepository.delete(users);
		return true;
	}
	}

