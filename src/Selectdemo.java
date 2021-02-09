import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selectdemo
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("file:///C:/Users/Kishor/Documents/select1.html");
	    Thread.sleep(2000);
	    WebElement ele=driver.findElement(By.id("a"));
	    Select s=new Select(ele);
	    s.selectByValue("125");
	    s.selectByVisibleText("126");
	    
	}
}
