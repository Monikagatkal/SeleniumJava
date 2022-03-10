package seleniumJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	static WebDriver driver;
	public static void launchbrowser() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.manage().window().maximize();
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	}

	
		public static void getHeaderOfPage()  
		{
		String title = driver.findElement(By.xpath("//h1")).getText();
		
		System.out.println("The title is: "+title);
		
		String welcomeMsg = driver.findElement(By.xpath("//strong")).getText();
		
		if(title.equals("Admin area demo")) {
		System.out.println("Test Passed : "+title +"is same as expected");	
		}else {
			System.err.println("Test failed : "+title+"is not same");
		}
		
		System.out.println("Welcome Msg: "+ welcomeMsg);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
		 username.clear();
		username.sendKeys("admin@yourstore.com");
		
		WebElement passwordField = driver.findElement(By.xpath("(//input) [2]"));
		passwordField.clear();
		passwordField.sendKeys("admin");
		
		
		System.out.println(driver.findElement(By.xpath("//div[@class='inputs reversed']/label")).getText());
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Recommended')]")).getText());

	//System.out.println("Dashboard sub header is displayed = "+driver.findElement(By.xpath("//div[contains(@class,'card-body')")).isDisplayed());
		
		System.out.println(driver.findElement(By.xpath("//a[starts-with(@class,'float')]")).getText());
		
		driver.findElement(By.xpath("//a[@class='nav-link' and @href='/logout']")).click();
	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		getHeaderOfPage();
	}

}
