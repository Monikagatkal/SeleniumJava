package seleniumJava;

import java.net.MalformedURLException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandleExample {
	
	static	WebDriver driver;
	public static void chromeLaunch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/");
		String str = driver.getWindowHandle();
		System.out.println(str);
		
		driver.findElement(By.cssSelector("a[title='Search Jobs']")).click();
		
		//driver.findElement(By.cssSelector("a[title='Jobseeker Login']")).click();
		
		 Set<String> window = driver.getWindowHandles();
		
		System.out.println(window);
		
		System.out.println("Title is: "+driver.getTitle());
		Iterator<String> itr = window.iterator();
		
		while(itr.hasNext()) {
			String win = itr.next();
			if(!win.equals(str))
				driver.switchTo().window(win);
		}
		System.out.println("Title is: "+driver.getTitle());
		
		//driver.close();
		//driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chromeLaunch();
	}

}
