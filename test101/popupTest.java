package Interview_Test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupTest {
	static WebDriver browser;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.manage().window().maximize();
				
				
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		browser.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#alertBox")).click();
		Thread.sleep(3000);

//		Actions class
		Actions act = new Actions(browser);
		act.sendKeys(Keys.ESCAPE).build().perform();

//		Alert()
//		browser.switchTo().alert().accept();
//		Capture and print Alert message
//		String alertMsg=browser.switchTo().alert().getText();
//		System.out.println(alertMsg);
		

	}

}
