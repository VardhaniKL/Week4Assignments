package Week4Day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TataCliq 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
	//Open the site
		driver.get("https://www.tatacliq.com/");
	//Wait implicitly
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
	//Ask me Later button click
		driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();
	//Input search option and click enter
		driver.findElement(By.id("search-text-input")).sendKeys("Watch for Women" + Keys.ENTER);
	//Print the info
		Thread.sleep(1000);
		WebElement info=driver.findElement(By.className("Plp__headerText"));
		String text=info.getText();
		System.out.println(text);
	//Sort by New Arrivals
		WebElement dd1=driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select s=new Select(dd1);
		s.selectByValue("isProductNew");
	//Select Women
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']")).click();
	//Print prices of watches
		
		List<WebElement> price=driver.findElements(By.tagName("h3"));
		
		for(WebElement all : price)
		{
			String value=all.getText();
			System.out.println(value);
		}
	//Print URL
		String url=driver.getCurrentUrl();
		System.out.println("The url is " + url);
		
	//Close the site
		driver.close();
	
	}

}
