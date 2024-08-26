package pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body[@class='desktop in']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//div[@class='calc60'])[4]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("(//p[@class='font12 greyText appendBottom3'])[1]")).click();
	}

}
