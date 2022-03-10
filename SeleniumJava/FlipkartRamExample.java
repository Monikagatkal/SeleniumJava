package seleniumJava;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartRamExample {
	
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
			
			WebElement search = driver.findElement(By.tagName("input"));
			search.sendKeys("Mobiles");
			
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
			}
			
			driver.findElement(By.tagName("button")).click();
			
			List<WebElement> element = driver.findElements(By.cssSelector("div[class='_213eRC _2ssEMF']"));
			System.out.println(element.size());
			
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


