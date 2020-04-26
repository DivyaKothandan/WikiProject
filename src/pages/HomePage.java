package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	
	
	By LoginTab = By.xpath("//*[@id='pt-login']/a");
	By username = By.xpath("//*[@id='wpName1']");
	By password = By.xpath("//*[@id='wpPassword1']");
	By logIn = By.xpath("//*[@id='wpLoginAttempt']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickLoginTab() {
		driver.findElement(LoginTab).click();
	}
	
	public void typeUserName() {
		driver.findElement(username).sendKeys("DivyaKothandan");
	}
	

	public void typePassword() {
		driver.findElement(password).sendKeys("SeleniumTesting");
	}
	
	public void clickLoginButton() {
		driver.findElement(logIn).click();
	}
}
