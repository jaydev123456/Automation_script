package pack1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.linkText("HOTELS")).click();
		Set<String>it=driver.getWindowHandles();
	    Iterator<String>window=it.iterator();
	    String parentid=window.next();
	    String childid=window.next();
	    driver.switchTo().window(childid);
		driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
		/*Set<String>Handle = driver.getWindowHandles();
		Iterator<String>it=Handle.iterator();
		String parentid = it.next();
		String childid = it.next();*/
		//driver.switchTo().window(childid);
		//driver.quit();
	}

}
