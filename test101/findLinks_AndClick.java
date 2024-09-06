package Interview_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findLinks_AndClick {
	static WebDriver browser;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//		browser.get("http://thedemosite.co.uk/");
		browser.get("https://www.etsy.com/");
		WebElement block=browser.findElement(By.xpath("//main[@id='content']//ul"));
		List<WebElement> ls=block.findElements(By.tagName("a"));
//		List<WebElement> ls=browser.findElements(By.tagName("a"));
		int sz=ls.size();
		
//		List<WebElement> l=browser.findElements(By.tagName("a"));
//		int sz=l.size();
//		System.out.println(sz);
//		List<WebElement> imgLinks=browser.findElements(By.tagName("img"));
//		int imgLinksz=imgLinks.size();
//		ls.addAll(imgLinks);
		
//		List<WebElement> lsLink=browser.findElements(By.tagName("link"));
//		int sz=ls.size();
		
		for (int i = 0; i < sz; i++)
		/*for(WebElement l:ls)*/{
			String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			l.sendKeys(s);
			ls.get(i).sendKeys(s);
			
//			Thread.sleep(2000);
			
			
//			if (i==4) {
//				break;
//			}
		}
		
	}

}
