package com.example.demo.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.User.User;

public interface UserRepository extends  JpaRepository<User , Integer>{

}
