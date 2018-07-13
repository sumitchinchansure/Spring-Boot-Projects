package com.human.resocia.login.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.human.resocia.login.demo.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{
	
	Role findByRole(String role);

}
