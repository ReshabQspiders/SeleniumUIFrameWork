package com.demowebshop.generic_utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	public Select select;
	public SelectHelper(WebElement dropDown) {
		this.select=new Select(dropDown);
	}
	//Selection
	public void selectOptionByIndex(int indexOfOption) {
		select.selectByIndex(indexOfOption);
	}
	public void selectOptionByValue(String valueAttribute) {
		select.selectByValue(valueAttribute);
	}
	public void selectOptionByVisibleText(String visibleText) {
		select.selectByVisibleText(visibleText);
	}
	public void selectOptionByPartialVisibleText(String visibleText) {
		select.selectByContainsVisibleText(visibleText);
	}
	//deselection
	public void deselectOptionByIndex(int indexOfOption) {
		select.deselectByIndex(indexOfOption);
	}
	public void deselectOptionByValue(String valueAttribute) {
		select.deselectByValue(valueAttribute);
	}
	public void deselectOptionByVisibleText(String visibleText) {
		select.deselectByVisibleText(visibleText);
	}
	public void deselectOptionByPartialVisibleText(String visibleText) {
		select.deSelectByContainsVisibleText(visibleText);
	}
	public void deselectAllOptions() {
		select.deselectAll();
	}
	//Fetch all options
	public List<WebElement> fetchAllOptionsInDropDown() {
		List<WebElement> options = select.getOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		return options;
	}
	//Fetch Selected options
	public List<WebElement> fetchAllSelectedOptionsInDropDown() {
		List<WebElement> options = select.getAllSelectedOptions();
		for (WebElement option : options) {
			System.out.println(option.getText());
		}
		return options;
	}
	//Verify is the dropdown is multi-select
	public boolean checkDropDownIsMultiSelect() {
		return select.isMultiple();
	}
}
