package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1200);
		System.out.println(driver.getWindowHandle());
		Thread.sleep(1200);
		System.out.println(driver.getTitle());
		Thread.sleep(1200);
		System.out.println(driver.hashCode());
		driver.close();

	}

}
