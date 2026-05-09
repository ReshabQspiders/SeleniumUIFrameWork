package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningRoprterLog {
	@Test
	public void greet() {
		Reporter.log("Hello Report", false);
	}
    @Test
	public void welcome() {
		Reporter.log("Welcome to console and Reports", true);
	}

}
