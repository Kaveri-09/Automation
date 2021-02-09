import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String []args)
	{System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.gmail.com/");
	WebElement id=driver.findElement(By.id("identifierId"));
	id.sendKeys("kaverikishor13@gmail.com");
	driver.findElement(By.id("identifierNext")).click();
		
	}

}
