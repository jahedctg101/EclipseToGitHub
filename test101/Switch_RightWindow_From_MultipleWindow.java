package Interview_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Switch_RightWindow_From_MultipleWindow {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// Switch to specific window out of 4 or more multiple  window
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		driver.get("https://www.geeksforgeeks.org/"); // parentwindow Id
		String parentWindow_Id=driver.getWindowHandle();
//		Thread.sleep(6000);
		WebElement FB=driver.findElement(By.cssSelector("div.facebook"));//Facebook
		jse.executeScript("arguments[0].scrollIntoView(true)", FB);
		Thread.sleep(2000);
		FB.click();
		
		Thread.sleep(4000);
		WebElement IG=driver.findElement(By.cssSelector("div.instagram"));//Istagram
		IG.click();
		
		Thread.sleep(4000);
		WebElement LD=driver.findElement(By.cssSelector("div.linkedin"));//Linkedin
		LD.click();
		
		Thread.sleep(4000);
		WebElement TWT=driver.findElement(By.cssSelector("div.twitter"));// Twitter
		TWT.click();
		
		Set<String> handls=driver.getWindowHandles();
		List<String> hlist = new ArrayList<>(handls);

		if(rightWindow("Facebook", hlist))
		{
			System.out.println(driver.getCurrentUrl() + " : " + driver.getTitle());
		}
		
		Thread.sleep(4000);
		closeAllChildWindow(hlist, parentWindow_Id);
		//Parent Window
		switchToparentWindow(parentWindow_Id);
			System.out.println("Parent Window Details : " + driver.getCurrentUrl() + " : " + driver.getTitle());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("span.close")).click();
		

	}//main
	public static void closeAllChildWindow(List<String>hList,String parentWindow_Id) {
		for(String e : hList) {
			if(!e.equals(parentWindow_Id)) {
				driver.switchTo().window(e).close();
			}
		}
	}
	
	public static void switchToparentWindow(String parentWindow_Id) {
		driver.switchTo().window(parentWindow_Id);
	}
	
	public static boolean rightWindow(String windowTitle,List<String>hList) {
		for(String e:hList) {
			String title=driver.switchTo().window(e).getTitle();
			if(title.contains(windowTitle)) {
				System.out.println("We are in Specific Window");
				return true;
			}//if
		}// for
		return false;
		
	} //rightWindow()

}//class


