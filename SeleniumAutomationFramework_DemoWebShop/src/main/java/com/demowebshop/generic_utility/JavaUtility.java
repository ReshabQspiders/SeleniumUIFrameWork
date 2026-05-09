package com.demowebshop.generic_utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.UUID;

public class JavaUtility {
	//Time stamp
	public String getTimeStamp() {
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
		return LocalDateTime.now().format(format);
	}
	//Random No
	public int getRandomNum(int boundry) {
		Random random=new Random();
		return random.nextInt(boundry);
	}
	//Random Value
	public String getRandomValue() {
		return UUID.randomUUID().toString();
	}
}
