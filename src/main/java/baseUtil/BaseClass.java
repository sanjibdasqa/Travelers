package baseUtil;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\16788\\eclipse-workspace\\com.travelers\\driver\\chromedriver_win32\\chromedriver.exe");
		
	}
	

}
