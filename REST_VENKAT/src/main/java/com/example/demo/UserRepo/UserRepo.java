package com.example.demo.UserRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.userdata.userdata;

public interface UserRepo extends JpaRepository<userdata, Long>{

}
