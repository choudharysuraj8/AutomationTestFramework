package com.qa.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ActionBase {

	 public static void sendKeys(WebElement element,String data){
		 element.sendKeys(data);
	 }
	 
	 public static void Click(WebElement element){
		 element.click();
	 }
	 
	 public static void selectdropdown(WebElement element,String data){
		 Select select= new Select(element);
		 select.selectByVisibleText(data);
	 }
	 
	
}
