package seleniumJava;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDateOfBirth {

	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.partialLinkText("Create")).click();
		
	//WebDriverWait wait = new WebDriverWait(driver, 10);
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver, 10).pollingEvery(Duration.ofSeconds(2));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Sign Up']")));
		driver.findElement(By.name("firstname")).sendKeys("Monika");
		
		WebElement date =driver.findElement(By.id("day"));
		Select selectdate = new Select(date);
		
	/*	System.out.println("first selection:" +selectdate.getFirstSelectedOption().getText());
		selectdate.selectByIndex(10);
		
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		selectMonth.selectByValue("5");
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2001");*/
		
		List<WebElement> dates = selectdate.getOptions();
		System.out.println(dates.size());
		
		for(WebElement ele : dates) {
			System.out.println(ele.getText());
		}
		driver.quit();
		}
		
		
	}


