package seleniumJava;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelect {

	static WebDriver driver;
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Monika\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
	//	WebElement command =driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		WebElement command = driver.findElement(By.name("selenium_commands"));
		Select selectcommand = new Select(command);
		
		selectcommand.selectByVisibleText("Browser Commands");
		selectcommand.selectByVisibleText("Switch Commands");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
		}
		
		List<WebElement> com = selectcommand.getAllSelectedOptions();
		
		for(WebElement ele : com) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> selectAll = selectcommand.getOptions();
		for(WebElement ele1 : selectAll) {
			System.out.println("All List: "+ele1.getText());
		}
		driver.quit();
	}

}
