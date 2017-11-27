package com.mjrousos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mjrousos.model.Activity;
import com.mjrousos.model.Exercise;
import com.mjrousos.service.ExerciseService;

@Controller
public class MinutesController {
	@Autowired
	private ExerciseService exerciseService;

	@RequestMapping(value = "/addMinutes")
	// @ModelAttribute implicitly adds the indicated parameter object to the Model hashmap (as a model 'attribute')
	public String addMinutes(@ModelAttribute("exercise") Exercise exercise) {
		
		// Print the number of minutes entered in the input
		System.out.println("Minutes: " + exercise.getMinutes());
		System.out.println("Activity: " + exercise.getActivity());
		
		// Reset the minutes exercised to 0
		exercise.setMinutes(0);
		
		return "addMinutes";
		
		// Forward or redirect (*outside* of Framework and then back in through Tomcat/web.config (hence needing .html)
		// return "forward:addMoreMinutes.html"; // Forward invisible to client
		// return "redirect:addMoreMinutes.html"; // 302
	}
	
//	@RequestMapping(value = "/addMoreMinutes")
//	public String addMoreMinutes(@ModelAttribute("exercise") Exercise exercise) {
//		
//		// Print the number of minutes entered in the input
//		System.out.println("More minutes: " + exercise.getMinutes());
//		
//		// Reset the minutes exercised to 0
//		exercise.setMinutes(0);
//		
//		// Return view
//		return "addMinutes";
//	}

	@RequestMapping(value="/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities() {
		return exerciseService.findAllActivities();
	}
}
