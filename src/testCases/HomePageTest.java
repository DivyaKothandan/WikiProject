package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTest {
	public static void main(String args[]) {

	
	System.setProperty("webdriver.chrome.driver", "D:/Drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();


	driver.get("https://en.wikipedia.org/wiki/Main_Page");

	HomePage login = new HomePage(driver);

	login.clickLoginTab();
	login.typeUserName();
	login.typePassword();
	login.clickLoginButton();
	System.out.println("Login is successfull");


	driver.quit();

}
}
