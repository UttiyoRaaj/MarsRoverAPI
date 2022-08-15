package com.utydevs.web;

import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import com.utydevs.dto.HomeDto;
import com.utydevs.response.MarsRoverApiResponse;
import com.utydevs.service.MarsRoverApiService;

@Controller
public class HomeController {
	
	@Autowired
	private MarsRoverApiService roverService;
	
	@GetMapping("/")
	public String getHomeView (ModelMap model, Long userId, Boolean createUserFlag) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		HomeDto homeDto = createDefaultHomeDto(userId);
		
		if (Boolean.TRUE.equals(createUserFlag) && userId == null)
		{
			homeDto = roverService.save(homeDto);
		}
		else
		{
			homeDto = roverService.findByUserId(userId);
			if (homeDto == null)
			{
				homeDto = createDefaultHomeDto(userId);
			}
		}
		
		MarsRoverApiResponse roverData = roverService.getRoverData(homeDto);
		model.put("roverData", roverData);
		model.put("homeDto", homeDto);
		model.put("validCameras", roverService.getValidCameras().get(homeDto.getMarsRoverApiData()));
		
		if (!Boolean.TRUE.equals(homeDto.getRememberPreferences()) && userId != null)
		{
			HomeDto defaultHomeDto = createNonDefaultHomeDto(homeDto.getMarsRoverApiData(), userId);
			roverService.save(defaultHomeDto);
		}

		return "index";
	}
	
	  @GetMapping("/savedPreferences")
	  @ResponseBody
	  public HomeDto getSavedPreferences (Long userId) {
	    if (userId != null)
	      return roverService.findByUserId(userId);
	    else
	      return createDefaultHomeDto(userId);
	  }

	  
	private HomeDto createDefaultHomeDto(Long userId) {
		HomeDto homeDto = new HomeDto();
		homeDto.setMarsRoverApiData("Opportunity");
		homeDto.setMarsSol(1);
		homeDto.setUserId(userId);
		return homeDto;
	}
	
	private HomeDto createNonDefaultHomeDto(String currRoverName, Long userId) {
		HomeDto homeDto = new HomeDto();
		homeDto.setMarsRoverApiData(currRoverName);
		homeDto.setMarsSol(1);
		homeDto.setUserId(userId);
		return homeDto;
	}
	
	@PostMapping("/")
	public String postHomeView(HomeDto homeDto)
	{
		homeDto = roverService.save(homeDto);
		return "redirect:/?userId=" + homeDto.getUserId();
	}
	

	
}

