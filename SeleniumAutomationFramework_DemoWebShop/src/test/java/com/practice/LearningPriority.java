package com.practice;

import org.testng.annotations.Test;

public class LearningPriority {
	@Test(priority = 0)
	public void register() {
		System.out.println("---Register new Patient---");
	}
	@Test(priority = 1)
	public void appointment() {
		System.out.println("---Appointing Patient to a doctor---");
	}
	@Test(priority = 2)
	public void dignosis() {
		System.out.println("---Dignosing the Patient---");
	}
	@Test(priority = 3)
	public void bloodTest() {
		System.out.println("---Performing blood test on Patient---");
	}

}
