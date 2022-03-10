package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPage {
	static WebDriver driver;
	public static void launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	}
	public static void getHeaderOfPage() throws InterruptedException
	{
		WebElement element = driver.findElement(By.className("_9axz"));
		String text = element.getText();
		System.out.println(text);
		
		//System.out.println("Page header is present: "+element.isDisplayed());
		
		WebElement loginId = driver.findElement(By.name("email"));
		loginId.clear();
		loginId.sendKeys("Monikagatkal43");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("7767050633");
		
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.className("_xkt")).click();
		
		//WebElement ForPassword = driver.findElement(By)
		
	}
	public static void main(String[] args) throws InterruptedException {
		launchbrowser();
		getHeaderOfPage();
		
	}

}
