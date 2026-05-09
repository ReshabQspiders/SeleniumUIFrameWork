package com.practice;

import org.testng.annotations.Test;

public class LearningInvocationCount {
	@Test(priority = 1)
	public void register() {
		System.out.println("---Register new Patient---");
	}
	@Test(invocationCount = 3,priority = 2)
	public void appointment() {
		System.out.println("---Appointing Patient to a doctor---");
	}
	@Test(invocationCount = 2,priority = 3)
	public void dignosis() {
		System.out.println("---Dignosing the Patient---");
	}
	@Test(priority = 4)
	public void bloodTest() {
		System.out.println("---Performing blood test on Patient---");
	}
	@Test(priority = 4)
	public void SampleTest() {
		System.out.println("---Performing blood test on Patient---");
	}

}
