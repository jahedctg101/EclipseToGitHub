package Interview_Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_All_Links {
	static WebDriver browser;
	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {/*
		// Test all links by response code
//		WebDriverManager.chromedriver().setup();
		browser = new ChromeDriver();
		browser.manage().window().maximize();
		browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
//		browser.get("http://thedemosite.co.uk/");
		browser.get("https://www.etsy.com/");
//		WebElement block=browser.findElement(By.xpath("//main[@id='content']//ul"));
		List<WebElement> aTag_ls=browser.findElements(By.tagName("a"));
		int aTaglinksz=aTag_ls.size();
		List<WebElement> imgTag_ls=browser.findElements(By.tagName("img"));
		int imgTagLinksz=imgTag_ls.size();
		aTag_ls.addAll(imgTag_ls);
		HttpURLConnection con=null;
		
		for(WebElement link:aTag_ls) {
			String url=link.getAttribute("href");
		
		if (url!=null &&!url.contains("javascript")) {
			con=(HttpURLConnection)(new URL(url)).openConnection();
			con.connect();
			con.setConnectTimeout(2000);
			int responseCode_link=con.getResponseCode();
			System.out.println("Connection status of links "+url+" is "+ responseCode_link);
		}
		}
		
		
	*/
		// playwright declaration and 
		//Fahmida APu project
		

	
//		     browser.get("https://news.ycombinator.com");
//				ArrayList<String> articleNames = new ArrayList<String>();
//				while (articleNames.size() < 100) {
//					List<WebElement> articles;
//		     WebDriverManager.chromedriver().setup();
				
				browser = new ChromeDriver();
				browser.manage().window().maximize();
				browser.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
						
				browser.get("https://news.ycombinator.com/");
					List<WebElement> articles = browser.findElements(By.xpath("//tr[@class='athing']"));
					int lsz=articles.size();//30
					System.out.println(lsz);
					for(WebElement ar : articles) {
						String page1=ar.getText();
						System.out.println(page1);
					}
//					Thread.sleep(3000);
					browser.findElement(By.xpath("//a[@class='morelink']")).click();//more
//					browser.findElement(By.linkText("More")).click();
//				}
				List<WebElement> articles1 = browser.findElements(By.xpath("//tr[@class='athing']"));
				int lsz1=articles1.size();
				
				for(WebElement ar : articles1) {
				String page2=ar.getText();
//				String page2=ar.getText();
				System.out.println(page2);
	}
				
//	Thread.sleep(3000);
				browser.findElement(By.xpath("//a[@class='morelink']")).click();
//				System.out.println(articleNames.size()+ " articles are given below:");
//				System.out.println(articleNames);}
				
				List<WebElement> articles3 = browser.findElements(By.xpath("//tr[@class='athing']"));
				int lsz2=articles3.size();
				System.out.println(lsz);
				for(WebElement ar : articles3) {
					String page3=ar.getText();
					System.out.println(page3);
				}
				
				browser.findElement(By.xpath("//a[@class='morelink']")).click();
//				System.out.println(articleNames.size()+ " articles are given below:");
//				System.out.println(articleNames);}
				
				List<WebElement> articles4 = browser.findElements(By.xpath("//tr[@class='athing']"));
				int lsz3=articles4.size();
				System.out.println(lsz);
				for(WebElement ar : articles4) {
					String page4=ar.getText();
					if(page4.contains("101.")) {
						break;
					}
					System.out.println(page4);
					
				}
	}
		
				
}
