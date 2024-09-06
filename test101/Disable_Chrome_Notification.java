package Interview_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disable_Chrome_Notification {
	static WebDriver driver;
	public static void main(String[] args) {
		// Disable Chrome Notification
		// not done yet
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
//		driver.manage().window().maximize();		
		
		driver.get("https://www.carwale.com/");

		driver.manage().window().maximize();
	}

}
