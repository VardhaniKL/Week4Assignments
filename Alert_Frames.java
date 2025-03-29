package Week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert_Frames 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(02));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
	
		//switchtoFrame
		driver.switchTo().frame("iframeResult");
		//Click button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Click Alert
		driver.switchTo().alert().accept();
		WebElement display=driver.findElement(By.xpath("//p[@id='demo']"));
	
		System.out.println(display.getText());
		

	}

}
