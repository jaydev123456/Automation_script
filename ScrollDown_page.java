package pack2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown_page {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("Window.scroll,(0,1000)");
		driver.close();
	}
}
