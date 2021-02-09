import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification 
{
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
	 ChromeOptions co=new Chromeoptions();
	 co.addArguments("--disabled-notifications");
	 WebDriver driver=new ChromeDriver(co);
	driver.manage().window().maximize();
	driver.get("https://www.redbus.com/");
	 
	 
	}

}
