package pack2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.get("https://google.com");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("automation");
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//div[@class='wM6W7d'])[7]")).click();
		
		/*List<WebElement> ele = driver.findElements(By.tagName("a"));
		System.out.println("no of element:"+ ele.size());
		for(WebElement el:ele) {
			System.out.println(el.getText());
		}*/
		driver.close();
	}

}
