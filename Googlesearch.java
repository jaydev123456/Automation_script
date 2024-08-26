package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		WebElement searchbox = driver.findElement(By.xpath("//textarea[@name='q']"));
		searchbox.sendKeys("DRDO");
		searchbox.sendKeys(Keys.ENTER);
		                     //another way
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("ISRO",Keys.ENTER);
		driver.close();

	}

}
