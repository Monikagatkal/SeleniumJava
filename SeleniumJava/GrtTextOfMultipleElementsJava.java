package seleniumJava;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrtTextOfMultipleElementsJava {
	static WebDriver driver;
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}
	public static void getheader()
	{
		driver.get("https://www.flipkart.com");
		String str = driver.getWindowHandle();
		System.out.println(str);
		System.out.println(driver.getTitle());
		
		
		/*driver.findElement(By.cssSelector("input[type='text'][class='_2IX_2- VJZDxU']")).sendKeys("7767050633");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("7767050633");
		
		
		driver.findElement(By.cssSelector("button[class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			}*/
		List<WebElement> element = driver.findElements(By.cssSelector("div[class='xtXmba']"));
		System.out.println(element.size());
		
		/*for(int i=0;i<element.size();i++)
		{
			System.out.println(element.get(i).getText());
		}*/
		
		Iterator<WebElement> itr = element.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
		
}
	public static void main(String[] args)
	{
		launchBrowser();
		getheader();	
	}
	}
