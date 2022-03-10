package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramPage {

	static WebDriver driver;
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
	}
	public static void loginPage() throws InterruptedException
	{
		WebElement element = driver.findElement(By.tagName("h1"));
		String text = element.getText();
		System.out.println(text);
		
		//WebElement emailField = driver.findElement(By.tagName("input"));
		//emailField.sendKeys("monika_gatkal");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("123456789");
		
		//driver.findElement(By.tagName("button")).click();	
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchBrowser();
		loginPage();
	}

}
