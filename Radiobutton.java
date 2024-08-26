package pack1;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Radiobutton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.get("https://www.calculator.net/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='scirdsettingd']")).click();
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		                   //another way
		WebElement radiobutton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected()); // for radio button is present or not
		// for radio button is present or not
		System.out.println("radio button is present:"+ radiobutton.isSelected());
		//how many no radio button is present
		System.out.println(driver.findElements(By.xpath("//input[@type='radio']")).size());
		                 //another way
		System.out.println("radio button size:"+radiobutton.getSize()); //size of radio button
		
		driver.close();
		
		

	}

}
