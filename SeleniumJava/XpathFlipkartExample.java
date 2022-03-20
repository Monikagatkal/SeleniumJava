package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFlipkartExample {
	
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
			
			
			
			//String title = driver.findElement(By.xpath("//h1")).getText();
			//System.out.println("The title is: "+title);
			
			
			
			
			/*driver.findElement(By.xpath("//input[@type='text' and @class='_2IX_2- VJZDxU'")).sendKeys("7767050633");
			
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7767050633");
			
			
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();*/
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
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu' and @type='submit']")).click();
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				
			}
			
			driver.findElement(By.xpath("//div[contains(@class,'_4rR01T')]")).click();
			
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		launchBrowser();
		getheader();
	}

}
