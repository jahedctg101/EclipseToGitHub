package Interview_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ikea {
	static WebDriver browser;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.manage().window().maximize();
				
				
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		browser.get("https://www.ikea.com/us/en/");
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		jse.executeScript("document.body.style.zoom='50%';");
		WebElement s=browser.findElement(By.name("q"));
		s.sendKeys("sofa");
		browser.findElement(By.id("search-box__searchbutton")).click();
		browser.findElement(By.xpath("(//*[text()='UPPLAND'])[1]")).click();
		browser.findElement(By.xpath("//span[text()='Add to bag']")).click();
//		browser.findElement(By.xpath("(//span[@class='rec-btn__inner'])[1]")).click();
		browser.findElement(By.id("onetrust-accept-btn-handler")).click();
		browser.findElement(By.xpath("//a[text()='Continue to bag']")).click();
		Thread.sleep(3000);
		browser.findElement(By.xpath("//span[text()='Use a discount code']")).click();
		Thread.sleep(2000);
		browser.findElement(By.id("discountCode")).sendKeys("12345678U521458");
		browser.findElement(By.xpath("//span[text()='Apply discount']")).click(); 
		

	}

}
