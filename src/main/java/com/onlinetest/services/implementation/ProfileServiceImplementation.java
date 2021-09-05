package com.onlinetest.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinetest.entity.exam.Profile;
import com.onlinetest.repository.ProfileRepository;
import com.onlinetest.services.ProfileService;

@Service
public class ProfileServiceImplementation implements ProfileService{

	@Autowired
	private ProfileRepository profileRepository;
	
	@Override
	public Profile addProfile(Profile profile) {
		return this.profileRepository.save(profile);
	}

	@Override
	public Profile updateProfile(Profile profile) {
		return this.profileRepository.save(profile);
	}

	@Override
	public List<Profile> getProfile(Long userId) {
		return this.profileRepository.findByUserId(userId);
	}

}
