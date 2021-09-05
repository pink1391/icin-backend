package com.onlinetest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onlinetest.entity.exam.Profile;
import com.onlinetest.services.ProfileService;

@RestController
@CrossOrigin("*")
@RequestMapping("/profile")
public class ProfileController {
	
	@Autowired
	private ProfileService profileService;
	
	// Add Profile
	
	@PostMapping("/")
	public ResponseEntity<Profile> addProfile(@RequestBody Profile profile){
		return ResponseEntity.ok(this.profileService.addProfile(profile));
	}
	
	@PutMapping("/")
	public ResponseEntity<Profile> updateProfile(@RequestBody Profile profile){
		return ResponseEntity.ok(this.profileService.updateProfile(profile));
	}
	
	@GetMapping("/{userId}")
	public List<Profile> getProfile(@PathVariable("userId") Long userId){
		return this.profileService.getProfile(userId);
	}

}
