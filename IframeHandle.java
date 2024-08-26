package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		driver.switchTo().frame(ele);
		driver.findElement(By.xpath("//span[@id='nseindex']")).click();
		driver.close();
	}

}
