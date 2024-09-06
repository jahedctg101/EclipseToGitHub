package Interview_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test02 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://news.ycombinator.com");

		ArrayList<String> articleNames = new ArrayList<String>();
		while (articleNames.size() < 100) {
			List<WebElement> articles;
			articles = driver.findElements(By.xpath("//tr[@class='athing']"));
			for (WebElement a : articles) {
				articleNames.add(a.findElement(By.xpath(".//td[@class='title']/span/a")).getText());
				if (articleNames.size() == 100)
					break;
			}
 
			driver.findElement(By.xpath("//a[@class='morelink']")).click();
		}
		int i=0;
		System.out.println(articleNames.size() + " articles are given below:");
		for (String a : articleNames) {
			i=i+1;
			System.out.println(i+ " " + a);
		}
		
	}

}
