package pack1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperlinkCount {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://flipkart.com");
		List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("no of Hyperlink:"+ele.size());
		for(WebElement e:ele)
			System.out.println("Hyperlink:"+e.getText());
		driver.close();
	}

}
