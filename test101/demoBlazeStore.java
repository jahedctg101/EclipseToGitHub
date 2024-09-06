package Interview_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoBlazeStore {
	public static WebDriver browser;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.manage().window().maximize();
				
				
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		browser.get("https://www.demoblaze.com/cart.html");
		Thread.sleep(2000);
		browser.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#name")).sendKeys("JAHED");
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#country")).sendKeys("Bangladesh");
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#city")).sendKeys("Chittagong");
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#card")).sendKeys("Cbh5263488");
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#month")).sendKeys("02");
		Thread.sleep(2000);
		browser.findElement(By.cssSelector("#year")).sendKeys("2022");
		Thread.sleep(2000);
		browser.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(2000);
		//WebElement a=browser.findElement(By.xpath("//p/br[2]/preceding::text()[1]"));
//		String b=a.toString();
//		System.out.println("Print : " + b);
		List<WebElement> ls=browser.findElements(By.xpath("//p/br/preceding::text()[1]"));
		int lsize=ls.size();
		System.out.println("Br size "+lsize);
		for(WebElement a:ls)
		{
			String aText=a.getText();
			System.out.println("Print a :"+aText);
		}
		
		

	}

}
