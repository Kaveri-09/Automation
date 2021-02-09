package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone4 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> dash=driver.findElements(By.xpath("//li[@id='goldCoins']"));
		Thread.sleep(4000);
		Actions a=new Actions(driver);
		for(WebElement d:dash)
		{
		a.moveToElement(d).build().perform();
		Thread.sleep(2000);
		}
	    driver.findElement(By.xpath("//li[@id='goldCoins']/div/ul/li[1]/div/ul/li[6]/span")).click();
	    
		String plain=driver.findElement(By.xpath("//h1[contains(.,'50 gram 24 KT Gold Coin')]")).getText();
		System.out.println(plain);
}

}
