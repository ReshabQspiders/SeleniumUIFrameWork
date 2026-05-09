package com.practice;

import org.testng.annotations.Test;

public class LearningEnabled {
	@Test(priority = 1)
	public void register() {
		System.out.println("---Register new Patient---");
	}
	@Test(priority = 2)
	public void appointment() {
		System.out.println("---Appointing Patient to a doctor---");
	}
	@Test(priority = 3)
	public void dignosis() {
		System.out.println("---Dignosing the Patient---");
	}
	@Test(priority = 4,enabled = false)
	public void bloodTest() {
		System.out.println("---Performing blood test on Patient---");
	}

}
