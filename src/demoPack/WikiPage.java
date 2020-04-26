package demoPack;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();


		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		
		WebElement LoginLink = driver.findElement(By.xpath("//*[@id='pt-login']/a"));
		LoginLink.click();
		
		WebElement username = driver.findElement(By.id("wpName1"));
		username.sendKeys("DivyaKothandan");
		
		WebElement password = driver.findElement(By.id("wpPassword1"));
		password.sendKeys("SeleniumTesting");
		
		
		WebElement LoginButton = driver.findElement(By.id("wpLoginAttempt"));
		LoginButton.click();
		
		
		
		

	}

}
