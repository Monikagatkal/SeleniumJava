package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {
		static WebDriver driver;
		public static void launchBrowser()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/");
		}
		public static void getheader()
		{
			WebElement headerLbl = driver.findElement(By.cssSelector("h1"));
			String header = headerLbl.getText();
			System.out.println("Header of Page= "+header);
			
			String classValue = headerLbl.getAttribute("class");
			System.out.println("Header class attribute value ="+classValue);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
			}
			WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
			username.sendKeys("monika@gamtkal.com");
			
			System.out.println("Username field value = "+username.getAttribute("value"));
			System.out.println("Username field font size = "+username.getCssValue("font-size"));
			
			System.out.println("login button enable: "+driver.findElement(By.cssSelector("button[type='submit']")).isDisplayed());
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		getheader();
	
	}

}
