package TestingProject;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AngularCalculator {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL = ("https://www.globalsqa.com/");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		
		//AngularJS Protractor Practice Site
				WebElement TesterHub = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/a"));
				Actions action = new Actions(driver);
				action.moveToElement(TesterHub).build().perform();
				WebElement APPS = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[2]/a/span"));
				action.moveToElement(APPS).build().perform();
				
				//Angular Consumption Calculator
				driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[2]/div/ul/li[7]/a/span")).click();
				List<WebElement> elements = driver.findElements(By.name("quantity"));
			// TO check cups of coffee
				driver.findElement(By.name("quantity")).sendKeys("4");	
				driver.findElement(By.name("perUnit")).click();	
				System.out.println(" the daily maximum intake of 400mg.");
			 
				// To Check cigarettes 		
				driver.findElement(By.xpath("/html/body/form[2]/p/input")).sendKeys("5");
				driver.findElement(By.name("perUnit")).click();
				System.out.println(" the daily maximum intake of 30mg.");
				JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,400)");
		        try {
					Thread.sleep(2000);
				} catch (InterruptedException e)
		        {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		       System.out.print(" Scroll Down");
				// driver.navigate().back();
			

	}

}
