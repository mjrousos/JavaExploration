package com.mjrousos.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
	private int minutes;

	@Range(min = 0 /*, max = 120*/)
	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
}
