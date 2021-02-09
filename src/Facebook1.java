import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email=driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("kakaka");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("kikiki");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println(driver.getTitle());
}
}


