package com.mjrousos.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.mjrousos.model.Goal;

@Controller
@SessionAttributes("goal") // Indicates that 'goal' attributes in the models should be persisted within a session
public class GoalController {

	@RequestMapping(value = "/addGoal", method = RequestMethod.GET)
	public String addGoal(Model model) {
		// Add a goal object to our model object collection (hashmap)
		Goal goal = new Goal();
		goal.setMinutes(10);
		model.addAttribute("goal", goal);
		
		return "addGoal";
	}
	
	@RequestMapping(value = "/addGoal", method= RequestMethod.POST)
	// @Valid will automatically check JSR-303 validation on the model attribute and populate the BindingResult accordingly
	public String updateGoal(@Valid @ModelAttribute("goal") Goal goal, BindingResult result) {
		System.out.println("Goal minutes: " + goal.getMinutes());

		if (result.hasErrors()) {
			return "addGoal";
		} else {
			return "redirect:addMinutes.html";
		}
	}
}
