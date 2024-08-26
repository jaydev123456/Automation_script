package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosearch {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.youtube.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("isro");
		//driver.findElement(By.xpath("//input[@id='search']")).click();
		//driver.close();
		WebElement searchboox = driver.findElement(By.xpath("//input[@type='text']"));
		searchboox.sendKeys("phone");
		searchboox.sendKeys(Keys.ENTER);
		driver.close();

		

	}

}
