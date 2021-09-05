package com.onlinetest.services;

import java.util.List;

import com.onlinetest.entity.exam.Profile;

public interface ProfileService {
	
	public Profile addProfile(Profile profile);
	
	public Profile updateProfile(Profile profile);
	
	public List<Profile> getProfile(Long userId);
	
}
