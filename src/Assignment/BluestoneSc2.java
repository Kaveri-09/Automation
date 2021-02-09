package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BluestoneSc2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings",Keys.ENTER);
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath(""))).build().perform();
		driver.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
	}
}
