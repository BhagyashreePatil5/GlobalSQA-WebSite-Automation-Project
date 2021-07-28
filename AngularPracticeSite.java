package TestingProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AngularPracticeSite{

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
	}

}
