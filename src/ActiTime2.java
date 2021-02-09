import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime2
{
	public static void main(String []args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement username=driver.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.xpath("//input[@name='pwd']"));
		password.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='searchItemList']/div[contains(.,'- New Customer -')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("x");
		driver.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")).sendKeys("y");
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']/div[@class='components_button_label']")).click();
		Thread.sleep(2000);
		String err=driver.findElement(By.xpath("//div[@class='basicLightboxFooter']/descendant::span[@class='errormsg']")).getText();
		System.out.println(err);
	
}
}
