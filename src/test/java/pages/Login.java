package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.ActionBase;

public class Login extends ActionBase{

	@FindBy(xpath="//input[@id='email']")
	WebElement username;
	
	@FindBy(xpath="//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath="//p[@class='submit']//span[1]")
	WebElement submit;
	
	
	public void login(String uname,String pwd){
		//username.sendKeys(uname);
		sendKeys(username, uname);
		sendKeys(password, pwd);
		Click(submit);
		 
			
	}
}
