package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.UserRepo.UserRepo;
import com.example.demo.userdata.userdata;

@RestController
public class Controller {

	@Autowired
	UserRepo Repo;

	@PostMapping("/user")
	public ResponseEntity<userdata> saveuser(@RequestBody userdata user) {
		return new ResponseEntity<>(Repo.save(user), HttpStatus.CREATED);
	}

	@GetMapping("/user")
	public ResponseEntity<List<userdata>> getuser() {
		return new ResponseEntity<>(Repo.findAll(), HttpStatus.OK);
	}

	@GetMapping("/user/{id}")
	public ResponseEntity<userdata> getuser(@PathVariable long id) {
		Optional<userdata> user = Repo.findById(id);
		if (user.isPresent()) {
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@PutMapping("/user/{id}")
	public ResponseEntity<userdata> Updateuser(@PathVariable long id, @RequestBody userdata userr) {
		Optional<userdata> user = Repo.findById(id);
		if (user.isPresent()) {
			user.get().setId(userr.getId());
			user.get().setNAME(userr.getNAME());
			user.get().setAGE(userr.getAGE());
			user.get().setAADHAR_NO(userr.getAADHAR_NO());
			user.get().setMOBILE_NO(userr.getMOBILE_NO());
			user.get().setADDRESS(userr.getADDRESS());
			return new ResponseEntity<>(Repo.save(user.get()), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity<userdata> deleteuser(@PathVariable long id) {
		Optional<userdata> user = Repo.findById(id);
		if (user.isPresent()) {
			Repo.deleteById(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}