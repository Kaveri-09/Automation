import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook3
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
       WebElement createNewAcc=driver.findElement(By.xpath("//div[@class='_6ltg']/a"));
       System.out.println(createNewAcc.isEnabled());
       if(createNewAcc.isEnabled())
    	   createNewAcc.click();
       Thread.sleep(2000);
       WebElement day=driver.findElement(By.id("day"));
       Select sday=new Select(day);
       sday.selectByValue("8");
       WebElement month=driver.findElement(By.id("month"));
       Select smonth=new Select(month);
       smonth.selectByValue("1");
       WebElement year=driver.findElement(By.id("year"));
       Select syear=new Select(year);
       syear.selectByValue("1996");
          
	}
	

}
