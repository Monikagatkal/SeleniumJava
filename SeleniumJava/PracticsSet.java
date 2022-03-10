package seleniumJava;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PracticsSet {
	
	static WebDriver driver;
	public static void mEdgeLaaunch()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge_proxy.exe");
	 driver = new EdgeDriver();
		driver.navigate().to("file:///C:/corejava/HTMLFile/MyfirstPage.html");
		
	}
	public static void chromeLaunch()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		//driver=new ChromeDriver();
		
		//driver.get("https://www.flipkart.com/");
		//String str1= driver.getWindowHandle();
	//	System.out.println(str1);
		
		//System.out.println("Title is : "+driver.getTitle());
		//System.out.println(driver.hashCode());
		
		
		//driver.close();
		
	/*	driver.findElement(By.cssSelector("a[title='Top Offers']")).click();
		Set<String> window = driver.getWindowHandles();
		
		System.out.println(window);
		
		System.out.println("Title is : "+driver.getTitle());
		Iterator<String> itr = window.iterator();
		
		while(itr.hasNext())
		{
			String s = itr.next();
			if(!s.equals(str1))
				driver.switchTo().window(s);
		}
		System.out.println("Title is : "+driver.getTitle());
	}*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//chromeLaunch();
		mEdgeLaaunch();
}

}
