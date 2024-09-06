package Interview_Test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
		driver.get("https://www.gmail.com");
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String> it=s.iterator();
		
		while(it.hasNext())
		{
			String wid=it.next();
			System.out.println("Window Id is  :"+ wid);
			
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle()+"......."+driver.getCurrentUrl());
			try {
				driver.findElement(By.linkText("Terms of Service")).click();
				System.out.println(driver.getTitle()+"....."+driver.getCurrentUrl());
//				driver.switchTo().window(wid);
//				driver.findElement(By.linkText("Privacy")).click();
//				System.out.println(driver.getTitle()+"....."+driver.getCurrentUrl());
				Thread.sleep(5000);
				break;
			} catch (Exception e) {
				System.err.println("THIS LINK IS NOT IN THE PAGE");
			}
//			Thread.sleep(5000);
//			driver.switchTo().window(wid);
//			driver.findElement(By.linkText("Privacy")).click();
//			System.out.println(driver.getTitle()+"....."+driver.getCurrentUrl());
		}//while
		
		
		

	}

}
