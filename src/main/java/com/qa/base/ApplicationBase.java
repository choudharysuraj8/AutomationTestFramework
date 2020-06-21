package com.qa.base;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import net.bytebuddy.jar.asm.Opcodes;

public class ApplicationBase {

	WebDriver driver;
	private String dataFileName;
	protected String className;
	protected static ThreadLocal<String> testMethodName = new ThreadLocal<String>();
	
	public ApplicationBase() {
		className = getClassName(this.getClass());
		dataFileName = className + "_Data";
	}

	@BeforeMethod(alwaysRun = true)
	public void setUpMethod(ITestContext context) throws Exception {
		createDriver(context);
	}

	public void createDriver(ITestContext context) throws Exception {

		// could be platform version, os version
		Map<String, Object> driverParams = new HashMap<String, Object>();
		driverParams.put("className", this.className);
		driverParams.put("testMethodName", testMethodName.get());
		driverParams.put("browserName", context.getAttribute("browserName"));
		
		driver = getDriver();
	}
	
	/**
     * <b>Name:</b> getClassName <b>Description:</b> Get class name string of a
     * specific class object
     *
     * @param className - class object
     * @return class name string
     */
    public static String getClassName(Class<?> className) {
        String fqClassName = className.getName();
        int charIndex;
        charIndex = fqClassName.lastIndexOf('.') + 1;
        if (charIndex > 0) {
            fqClassName = fqClassName.substring(charIndex);
        }
        return fqClassName;
    }
    
    public WebDriver getDriver() throws Exception {
    	
    	Map<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        
    	ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--always-authorize-plugins");
        options.addArguments("--disable-popup-blocking");
        // options.addArguments("--disable-extensions");
        options.addArguments("--incognito");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        // options.addArguments("--headless");
        options.setExperimentalOption("useAutomationExtension", false);
    	System.setProperty("webdriver.chrome.driver", "D:\\Suraj\\workspace\\AutomationTestFramework\\lib\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(options);
		return driver;
    	
    }
}
