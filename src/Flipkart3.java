import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);
		List<WebElement> menus=driver.findElements(By.xpath("//div[@class='_1kidpb']/span"));
		 Thread.sleep(3000);
		Actions a=new Actions(driver);
		for(WebElement menuName:menus)
		{
			
			a.moveToElement(menuName).build().perform();
			String mName=menuName.getText();
			System.out.println(mName);
		   Thread.sleep(5000);
		   List<WebElement> submenues=driver.findElements(By.xpath("//span[contains(.,'"+mName+"')]/parent::div/descendant::div/a"));
				   for(WebElement submenuName:submenues)
					{
						System.out.println(submenuName.getText());
						Thread.sleep(3000);
					}
				}	   
		
}
}