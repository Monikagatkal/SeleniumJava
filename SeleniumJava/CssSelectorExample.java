package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {
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
		String header = driver.findElement(By.cssSelector("h1")).getText();
		System.out.println("Header of Page= "+header);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		//CssSelector with ID #Idvalue
		boolean present = driver.findElement(By.cssSelector("#loginForm")).isDisplayed();
		System.out.println("Insta login form is present ="+present);
		
		//CssSelector with classname .classnamevalue
		
		String usernameText = driver.findElement(By.cssSelector("._9nyy2")).getText();
		System.out.println("Insta login form is present ="+usernameText);

		//CssSelector with TagName and Attibutr value tagName[attributeName='AttributeValue']
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("Monika_gatkal");
		
		//CssSelector with TagName and Multiple Attibutr value tagName[attributeName='AttributeValue'][attributeName='AttributeValue']
		driver.findElement(By.cssSelector("input[autocorrect='off'][name='password']")).sendKeys("Monika@123");
		
		//CssSelector with TagName and Partial Attibutr value tagName[attributeName='partialAttributeValue']
		driver.findElement(By.cssSelector("button[type*='submit']")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			}
		//CssSelector with parent and child tagName parentTag
		System.out.println("Error msg: "+driver.findElement(By.cssSelector("div[class='eiCW-'] p")).getText());
	}

public static void main(String ars[])
{
	launchBrowser();
	getheader();
}

}