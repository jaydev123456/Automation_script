package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.ebay.com/");
		WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Motors')])[1]"));
		Actions actn = new Actions(driver);
		Thread.sleep(2000);
		actn.moveToElement(element).perform();


	}

}
