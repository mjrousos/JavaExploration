package com.mjrousos.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mjrousos.model.Activity;

@Service("exerciseService")
public class ExerciseServiceImpl implements ExerciseService {

		public List<Activity> findAllActivities() {
			List<Activity> activities = new ArrayList<Activity>();
			
			Activity run = new Activity();
			run.setDesc("Running");
			activities.add(run);
			
			Activity bike = new Activity();
			bike.setDesc("Biking");
			activities.add(bike);
			
			Activity swim = new Activity();
			swim.setDesc("Swimming");
			activities.add(swim);
			
			return activities;
		}
}
