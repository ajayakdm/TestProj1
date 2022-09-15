package testProject;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchCases 
{

	    public WebDriver driver;
	    public String keyLocator; 
	    @BeforeTest
		public void launchBrowser() 
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://qa-blackboard.cogbooks.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
	    @Test
		public void launchLearner()
		{
			String userName="userName#user_id";
			String passWord="passWord#password";
			checkLocators(userName);
			checkLocators(passWord);
		}
	    
	    public void ab() 
	    {
	    	driver.findElement(By.id("user_id")).sendKeys("ABCDEFGH");;
	    }
	    
	    public void checkLocators(String strLocator)
	    {
	    	keyLocator=StringUtils.substringBefore(strLocator,"#");
	    	strLocator=StringUtils.substringAfter(strLocator, "#");
	    	
	    	switch(keyLocator) 
	    	
	    	{
	    	
	    	case "userName":
	        ab();
	    	System.out.println("User Name");
	    	break;
	    	
	    	case "passWord":
	    	System.out.println("Pass Word");
	    	break;
	    	
	    	default:
	    	System.out.println("default");
	    	
	    	}
	    	
	    	
	    }
}


