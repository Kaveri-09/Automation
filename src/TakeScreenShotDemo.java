import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenShotDemo 
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Facebook.com/");
		Thread.sleep(2000);
		Screenshot(driver,"Facebook");
	}
	public static void Screenshot(WebDriver driver,String name) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Screenshot=ts.getScreenshotAs(OutputType.FILE);
		File Screenshotsave=new File("./Screenshot/" + name +".png");
		Files.copy(Screenshot, Screenshotsave);

	}
}