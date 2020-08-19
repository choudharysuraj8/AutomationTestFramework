package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.qa.base.ActionBase;

public class CreateOrderPage extends ActionBase{

	@FindBy(xpath="//span[contains(text(),'Home')]")
	WebElement home_button;
	
	@FindBy(xpath="//a[@class='sf-with-ul'][contains(text(),'Women')]")
	WebElement women;
	
	@FindBy(xpath="//div[@class='product-container']//descendant::a[contains(text(),'Faded Short Sleeve T-shirts')]")
	WebElement dress_click;
	
	@FindBy(xpath="//button[@name='Submit']//child::span[contains(text(),'Add to cart')]")
	WebElement addtocart;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	WebElement proceedtocheckout;
	
	@FindBy(xpath="//p[@class='cart_navigation clearfix']//child::a[@title='Proceed to checkout']")
	WebElement cartproceed;
	
	@FindBy(xpath="//button[@name='processAddress']")
	WebElement processAddress;
	
	@FindBy(xpath="//input[@id='cgv']")
	WebElement iacceptcheckbox;
	
	@FindBy(xpath="//button[@name='processCarrier']")
	WebElement processCarrier;
	
	@FindBy(xpath="//a[@class='bankwire']")
	WebElement bankwire;
	
	
	@FindBy(xpath="//span[contains(text(),'I confirm my order')]//parent::button[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//p[@class='cheque-indent']")
	WebElement confirmedtext;
	
	public String getconfirmed(){
		String actualresult=confirmedtext.getText();
		return actualresult;
	}
	
	
	public void create(){
		
		Click(home_button);
		Click(women);
		Click(dress_click);
		Click(addtocart);
		Click(proceedtocheckout);
		Click(cartproceed);
		Click(processAddress);
		Click(iacceptcheckbox);
		Click(processCarrier);
		Click(bankwire);
		Click(submit);
		
	}
	
	//driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	
		

}
