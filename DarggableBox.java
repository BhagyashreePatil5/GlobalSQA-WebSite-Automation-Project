package TestingProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DarggableBox {

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
				
		
				
				//Draggable Boxes
				
				driver.findElement(By.xpath("//span[contains(text(),'Draggable Boxes')]")).click();	
			
				WebElement iframe =driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
				
				driver.switchTo().frame(iframe);
				System.out.println("Switch to frame");
				
				//get the location of dragable box
				Point myPoint = driver.findElement(By.id("draggable")).getLocation();
				System.out.println("location of dragable box :"+myPoint.x+ "  "+myPoint.y);
				
				WebElement drag =driver.findElement(By.id("draggable"));	
				new Actions(driver).dragAndDropBy(drag, myPoint.x + 90, myPoint.y + 80).build().perform();
			    // go back to previous page.
			    // driver.navigate().back();
			
	}

}
