package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FrameHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='moneyiframe']")));
		              //Another way
		//driver.switchTo().frame("moneyiframe");
		String Bse = driver.findElement(By.xpath("//span[@id='bseindex']")).getText();
		System.out.println(Bse);
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("CRICKET")).click();
		driver.quit();
	
		
	}

}
