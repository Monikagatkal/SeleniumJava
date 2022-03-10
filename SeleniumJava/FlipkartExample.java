package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample {
	static WebDriver driver;
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	public static void getheader()
	{
		driver.get("https://www.flipkart.com");
		String str = driver.getWindowHandle();
		System.out.println(str);
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.cssSelector("input[type='text'][class='_2IX_2- VJZDxU']")).sendKeys("7767050633");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("7767050633");
		
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			}
		
		WebElement search = driver.findElement(By.tagName("input"));
		search.sendKeys("SAMSUNG Galaxy S21 FE 5G");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		driver.findElement(By.tagName("button")).click();
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			
		}
		
		driver.findElement(By.className("_1fQZEK")).click();
		
		
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
		}
		
		//driver.findElement(By.tagName("button")).click();

		//driver.findElement(By.className("_2KpZ6l _2U9uOA ihZ75k _3AWRsL")).click();
		
		//driver.findElement(By.cssSelector("button[class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		driver.findElement(By.cssSelector("button[class*='_2KpZ6l']")).click();

	}
	public static void main(String args[])
	{
		launchBrowser();
		getheader();
	}
}
