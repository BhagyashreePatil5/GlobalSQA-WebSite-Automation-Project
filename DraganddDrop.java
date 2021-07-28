package TestingProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DraganddDrop {

	public static void main(String[] args) 
	{
	
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
				
			
				//Drag And Drop
				
			    driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/div/ul/li[6]/a/span")).click();

			    WebElement iframe =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div[1]/p/iframe"));
				driver.switchTo().frame(iframe);
				
				System.out.println("*We are switch to the iframe");
			    
			    //find element which we want to drag
			     Actions act  = new Actions (driver);
				WebElement from= driver.findElement(By.xpath("/html/body/div[1]/ul/li[1]/img"));
				// find element which we  need to drop
				WebElement to= driver.findElement(By.xpath("/html/body/div[1]/div"));
			   // this will drag  element to  destination	 
				act.dragAndDrop(from, to).build().perform();
				System.out.println("Img drop to trash");
				 // go back to previous page.
			    // driver.navigate().back();
				
				
			}

		
	}
}

