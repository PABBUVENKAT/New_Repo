package com.example.REST.resourse;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.REST.model.innojc_table;
import com.example.REST.repo.user_manager_repo;

@RestController
public class user_manager_resourse {
	
	@Autowired
	user_manager_repo u_m_r;
	
	
	@RequestMapping(value="/user_manager")
	public List<innojc_table> getAll(){
		return u_m_r.findAll();
	}

}
