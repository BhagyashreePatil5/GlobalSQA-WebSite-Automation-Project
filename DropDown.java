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
		public class DropDown {

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
		
				
			    //DropDown Menu
			    driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[3]/div/ul/li[4]/div/ul/li[1]/div/ul/li[8]/a/span")).click();
			    WebElement iframe =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/ul/li"));
				System.out.println("*We are switch to the iframe");
			    Select drplist = new Select(driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select")));
			    drplist.selectByVisibleText("Angola");
		        drplist.selectByIndex(6);
			    drplist.selectByValue("Angola");
			    // driver.navigate().back();
			  

	}

}
