import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> menus=driver.findElements(By.xpath("//div[@class='_3Il5oO dwRsDN']/div"));
		Actions a=new Actions(driver);
		for(WebElement menuName:menus)
		{
			System.out.println(menuName.getText());
			a.moveToElement(menuName).build().perform();
			
}
}
}