import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime1 
{
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement u_name=driver.findElement(By.xpath("//b[contains(.,'admin')]"));
		System.out.println("id is:"+u_name.getText());
		WebElement p_word=driver.findElement(By.xpath("//b[contains(.,'manager')]"));
		System.out.println("password:"+p_word.getText());
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys(username.getText());
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys(password.getText());
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		
		

}
}