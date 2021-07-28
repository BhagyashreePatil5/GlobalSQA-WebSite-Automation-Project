package TestingProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgressBar {

	public static void main(String[] args)
	{
				System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				String baseURL = ("https://www.globalsqa.com/");
				driver.get(baseURL);
				driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
				driver.manage().window().maximize();
			
			 //Tester's Hub
				WebElement TesterHub = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/a"));
				Actions action = new Actions(driver);
				action.moveToElement(TesterHub).build().perform();
				WebElement DemoTsting = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/a/span/span"));
				action.moveToElement(DemoTsting).build().perform();
				
			
			 
			//Progress Bar
				
				driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/div/ul/li[5]/a/span")).click();
				
				WebElement iframe =driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
				driver.switchTo().frame(iframe);
				
				System.out.println("*We are switch to the iframe");
				driver.findElement(By.id("downloadButton")).click();
				System.out.println(" Start download ");
				
			    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")).click();
				System.out.println(" Close Button Click ");
			    // go back to previous page.
			    // driver.navigate().back();


	}

}
