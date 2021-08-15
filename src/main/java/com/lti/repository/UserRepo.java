package com.lti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.entity.User;


@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
	
	 
	public User findUserByUemailAndUpassword(String uemail, String upassword);

}
