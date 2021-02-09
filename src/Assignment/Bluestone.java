package Assignment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		List<WebElement> dash=driver.findElements(By.xpath("//a[contains(.,'All Jewellery')] "));
		Actions a=new Actions(driver);
		for(WebElement d:dash)
		{
			a.moveToElement(d).build().perform();
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//a[contains(.,'Kadas')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//img[@alt='The Udith Kada For Him']")).click();
		Thread.sleep(4000);
		for(String win:driver.getWindowHandles())
		{
			driver.switchTo().window(win);
		}
		Thread.sleep(4000);
		driver.findElements(By.xpath("//span[text()=' Select Size ']"));
		driver.findElements(By.xpath("//span[@class='size]/parent::li[@data-key='02']"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id=\'buy-now\']")).click();
		Thread.sleep(4000);
		String error1=driver.findElement(By.xpath("//a[text()='The Udith Kada For Him']")).getText();
		System.out.println(error1);
		
	}

}
