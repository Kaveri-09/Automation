import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2Auto 
{
    public static void main(String[] args) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@maxlength='2048']")).sendKeys("java");
		Thread.sleep(3000);
		
		
    }
}
