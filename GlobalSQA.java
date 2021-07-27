package TestingProject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GlobalSQA
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Seleniumwebdriver\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String baseURL = ("https://www.globalsqa.com/");
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
	/*
	// Contact US Form
		driver.findElement(By.xpath("//*[@id=\"menu-item-1561\"]/a")).click();
		driver.findElement(By.name("comment_name")).sendKeys("Bhagyashree");
		driver.findElement(By.name("email")).sendKeys("bhagyashreepatil@gmail.com");
		driver.findElement(By.name("subject")).sendKeys("Testing ");
		driver.findElement(By.name("comment")).sendKeys("nice");
		driver.findElement(By.id("recaptcha-anchor-label")).click();
		driver.findElement(By.id("submit")).click();
	
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
		
	
	 //Tester's Hub
		WebElement TesterHub = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(TesterHub).build().perform();
		WebElement DemoTsting = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/a/span/span"));
		action.moveToElement(DemoTsting).build().perform();
		
	/*
	//Progress Bar
		
		driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/div/ul/li[5]/a/span")).click();
		
		WebElement iframe =driver.findElement(By.xpath("//body/div[@id='wrapper']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]/iframe[1]"));
		driver.switchTo().frame(iframe);
		
		System.out.println("*We are switch to the iframe");
		driver.findElement(By.id("downloadButton")).click();
		System.out.println(" Start download ");
		
	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button")).click();
		System.out.println(" Close Button Click ");
	
    
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
	
		
	    //DropDown Menu
	    driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/div/ul/li[8]/a/span")).click();
	    WebElement iframe =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/ul/li"));
		System.out.println("*We are switch to the iframe");
	    Select drplist = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
	    drplist.selectByVisibleText("Angola");
        drplist.selectByIndex(6);
	    drplist.selectByValue("Angola");
	  
	   
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
		
	
		//Flash Website
		WebElement TesterHub = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(TesterHub).build().perform();
		WebElement Fw = driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[4]/a/span"));
		Fw.click();
		driver.findElement(By.xpath("/html/body/div/object/object/a/img")).click();
		System.out.println(" Open the adobe.com site");
	*/
	 // go back to previous page.
	  driver.navigate().back();
	 
	 //Close the WEb page 
		driver.close();
	
	}

}
