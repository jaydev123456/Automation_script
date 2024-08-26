package pack2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropdown {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("laptop");
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'lrtEPN')]"));
        for(WebElement e:ele) {
        	System.out.println(e.getText());
	}
	}
}
