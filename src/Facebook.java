import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		String parent=driver.getWindowHandle();
		System.out.println("parent"+parent);
		Set<String> winshandle=driver.getWindowHandles();
		System.out.println( winshandle.getClass());
		ArrayList<String> a1=new ArrayList<>(winshandle);
		
		for(int i=a1.size()-1;i>=0;i--)
		{
			driver.switchTo().window(a1.get(i));
			driver.close();
			Thread.sleep(2000);
		}
		//winshandle.remove(parent);
		
		
		
		
		
	}


}
