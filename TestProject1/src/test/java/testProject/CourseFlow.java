package testProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CourseFlow 
{  

public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://qa4.cogbooks.com/sign-in.html");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.id("userName")).sendKeys("qajan2017user7");
	driver.findElement(By.id("passwd")).sendKeys("Pass@1234");
	driver.findElement(By.xpath("//*[@value=\"Sign In\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"2276\"]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("startIcon")).click();
	Thread.sleep(3000);
	
	WebElement slider = driver.findElement(By.xpath("//div[@role=\"slider\"]"));
	if(slider.equals("//div[@role=\"slider\"]"))
	{
	Actions moveSliderBar=new Actions(driver);
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.elementToBeClickable(slider));
	Action action1 = moveSliderBar.dragAndDropBy(slider, 350, 0).build();
	action1.perform();	  
	
	}
	
	
//	driver.close();
}
	public void m1(String stri)
	{
	
	}

}
