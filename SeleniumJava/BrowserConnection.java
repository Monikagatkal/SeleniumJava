package seleniumJava;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import java.net.URL;
public class BrowserConnection {
	
 static	WebDriver driver;
	public static void chromeLaunch() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("Title of Application:" + title);
		String url = driver.getCurrentUrl();
		System.out.println("URL of Application:" + url);
		System.out.println(driver.manage().getCookies());
		
		driver.manage().deleteAllCookies();
		System.out.println(driver.manage().getCookies());
		
		//driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		
		//System.out.println(driver.manage().window().getPosition());
		//System.out.println(driver.manage().window().getSize());
		
	//	Point point = new Point(150,100);
		//driver.manage().window().setPosition(point);
		
		//Dimension dim = new Dimension(0,0);
		//driver.manage().window().setSize(dim);
		
		//driver.manage().window().minimize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	//	driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
		
		URL url1 = new URL("https://www.amazon.com/");
		driver.navigate().to(url1);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();
		
			
	}
	public static void ieLaunch()
	{
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\Monika\\IEDriverServer_x64_4.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
	}
	
	/*public static void fireFoxLaunch()
	{
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Monika\\geckodriver.exe\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
	}*/
	
	/*public static void mEdgeLaaunch()
	{
		//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge_proxy.exe");
		WebDriver driver = new EdgeDriver();
		
	}*/


public static void main(String args[])
{
	try {
		chromeLaunch();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//ieLaunch();
	//fireFoxLaunch();
	//mEdgeLaaunch();
}
}