package DemotestngDemo.qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 
{
	WebDriver driver;

	@BeforeMethod
	public void beforeM()
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.manage().window().maximize();
	     driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	public void afterM()
	{
		driver.close();
	}
	
	@Test
	public void tc_1()
	{
	
     WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("java", Keys.ENTER);
		System.out.println("tc1");
		
	}
	
	@Test
	public void tc_2()
	{
		
	     WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			search.sendKeys("testng", Keys.ENTER);
			System.out.println("tc2");
			
	}

}
