package TestAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchPrac {

	public  WebDriver driver;
	
	@BeforeTest
		public void Setup() {
			driver =  WebDriverManager.chromedriver().create();
			driver.get("https://whitehat:aUV9NLtDZaVqLAjN@whitehat.impactguru.com/carepalsecure?pay=0");
		driver.manage().window().maximize();
		}
		@org.testng.annotations.Test
		public void Test() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
		
		@AfterTest
		public void clear() {
			driver.quit();
		}
		
	
	
	
}
