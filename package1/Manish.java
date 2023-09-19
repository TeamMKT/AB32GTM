package package1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.Assertion;

public class Manish {

	public static void main(String[] args) throws InterruptedException 
	{
		
				WebDriver driver=new FirefoxDriver();
				
				driver.get("https://grotechminds.com/registration/");
				driver.manage().window().maximize();
				Assertion hardAssert = new Assertion();
				hardAssert.assertEquals(true, false);
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='h5p-iframe-1']")));
				Thread.sleep(2000);
				WebElement from = driver.findElement(By.xpath("//span[.='Grabbable 8 of 32.']"));
				WebElement to = driver.findElement(By.xpath("//span[.='Dropzone 1 of 32.']"));	 
				//Perform drag and drop
				Actions builder = new Actions(driver);
				builder.dragAndDrop(from, to).perform();
				driver.findElement(By.xpath("//button[@title='Check']")).click();
				driver.switchTo().defaultContent();
				System.out.println("1");
	}

}
