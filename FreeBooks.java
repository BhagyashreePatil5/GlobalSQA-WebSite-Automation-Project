package TestingProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FreeBooks
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL = ("https://www.globalsqa.com/");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	
	  // FreeBooks
		Actions actions = new Actions(driver);
		WebElement FreeBooks = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[3]/a"));
		actions.moveToElement(FreeBooks);
	    WebElement subMenu = driver.findElement(By.cssSelector("#menu-item-7132 > a > span"));
	    actions.moveToElement(subMenu);
		actions.doubleClick(subMenu).perform();
		System.out.println(" Free machine Learning EBooks Open ");
		// Check the Categories List 
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/ul/li[1]/a/span[2]")).click();
	    System.out.println(" Android Studio Categories Open ");
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
		// go back to previous page.
	   // driver.navigate().back();

	}

}
