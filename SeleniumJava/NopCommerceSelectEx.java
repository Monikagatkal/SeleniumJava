package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceSelectEx {
static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		WebElement emailField = driver.findElement(By.tagName("input"));
		emailField.clear();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		emailField.sendKeys("admin@yourstore.com");
		
		WebElement passwordField = driver.findElement(By.name("Password"));
		passwordField.clear();
		passwordField.sendKeys("admin");
		
		driver.findElement(By.tagName("button")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		
		driver.findElement(By.id("SearchProductName")).sendKeys("abc");
		
		WebElement category = driver.findElement(By.id("SearchCategoryId"));
		Select selectcat = new Select(category);
		selectcat.selectByValue("2");
		List<WebElement> cat = selectcat.getOptions();
		for(WebElement cat1 : cat) 
		{
			System.out.println(cat1.getText());
		}
		
		WebElement ware = driver.findElement(By.id("SearchWarehouseId"));
		Select ware1 = new Select(ware);
		List <WebElement> ware2 = ware1.getOptions();
		ware1.selectByVisibleText("Warehouse 2 (Los Angeles)");
		
		for(WebElement webelement : ware2 )
		{
			System.out.println(webelement.getText());
		}
		
		WebElement product = driver.findElement(By.id("SearchProductTypeId"));
		Select product1 = new Select(product);
		List<WebElement> product2 = product1.getOptions();
		product1.selectByValue("5");
		
		WebElement manufacture = driver.findElement(By.id("SearchManufacturerId"));
		Select manufacture1 = new Select(manufacture);
		List<WebElement> manufacture2 = manufacture1.getOptions();
		manufacture1.selectByVisibleText("Nike");
		
		
		
		
}
}
