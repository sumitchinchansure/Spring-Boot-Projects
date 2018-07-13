package com.human.resocia.login.demo.service;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.human.resocia.login.demo.model.Role;
import com.human.resocia.login.demo.model.User;
import com.human.resocia.login.demo.repository.RoleRepository;
import com.human.resocia.login.demo.repository.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public User findByEmail(String email) {
		
		return userRepository.findByEmail(email);
		
	}

	@Override
	public void saveUser(User user) {
		
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        user.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
		userRepository.save(user);
		
	}

	@Override
	public User recoverPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
