package seleniumJava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class ExplicityWaitEx {
	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.tagName("button")).click();
		System.out.println(driver.findElement(By.xpath("//p[@id='demo']")).getText());
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10));
		
		WebElement ele = wait.until(new Function<WebDriver, WebElement>(){
			public WebElement apply(WebDriver t)
			{
				WebElement ele1 = driver.findElement(By.xpath("//p[@id='demo']"));
				if(ele1.getText().equals("QTP")) {
					return ele1;
					
				}else
				{
					return null;
				}
			}
		});
		
		System.out.println(ele.getText());
	}
}
