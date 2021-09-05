package com.onlinetest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onlinetest.entity.exam.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long>{
	
	public List<Profile> findByUserId(Long uId);

}
