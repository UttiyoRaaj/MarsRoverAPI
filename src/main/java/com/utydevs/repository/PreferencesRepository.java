package com.utydevs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.utydevs.dto.HomeDto;

public interface PreferencesRepository extends JpaRepository<HomeDto, Long>{

	HomeDto findByUserId(Long userId);  //means Select * from HomeDto table(i.e. mars_api_preferences
											//where userId=value passed in userId

}
