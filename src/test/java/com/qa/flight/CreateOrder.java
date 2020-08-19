package com.qa.flight;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.base.ActionBase;
import com.qa.base.ApplicationBase;

import pages.CreateOrderPage;
import pages.Login;


public class CreateOrder extends ApplicationBase{

	@Test
	public void verifyFlightBooking() throws Exception {
		System.out.println("Flight Booking");
		ApplicationBase ab=PageFactory.initElements(driver, ApplicationBase.class);
		 System.out.println("driver::"+driver);
		
		 //driver.get("http://newtours.demoaut.com/");
		
		 driver.get("http://automationpractice.com/index.php");
		 	// driver.navigate().to("http://automationpractice.com/index.php");	 
		System.out.println("sdsfsf");
		//click on sign In button 	 
		
		JSONObject filedata=JsonRead.extractData_JSON("E://workspace3//AutomationTestFramework-master//AutomationTestFramework-master//src//test//resources//logindata.json");
		String u=(String) filedata.get("username");
		System.out.println(u);
		String p=(String) filedata.get("password");
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Login page = PageFactory.initElements(driver, Login.class);
		
		page.login(u,p);
		
		CreateOrderPage cop= PageFactory.initElements(driver, CreateOrderPage.class);
		cop.create();
		String AcR=cop.getconfirmed();
		//String ActualResult= driver.findElement(By.xpath("//p[@class='cheque-indent']")).getText();
		String ExpR="Your order on My Store is complete.";
		
		Assert.assertEquals(AcR, ExpR);

	}
	
	
}
