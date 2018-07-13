package com.human.resocia.login.demo.service;

import com.human.resocia.login.demo.model.User;

public interface UserService {
	
	public User findByEmail(String email);
	
	public void saveUser(User user);
	
	public User recoverPassword(String email);

}
