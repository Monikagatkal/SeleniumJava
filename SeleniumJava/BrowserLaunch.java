package seleniumJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserLaunch {
		
		static WebDriver driver;
		public static void chromeLaunch()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		public static void ieLaunch()
		{
			//System.setProperty("webdriver.gecko.driver","C:\\webDriver\\IEDriverServer.exe");
			// driver=new InternetExplorer();
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		chromeLaunch();
		//ieLaunch();
		//fireFoxLaunch();
		//mEdgeLaaunch();
	}

}
