package PakagesC6pro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestngScriptMAVEN 
{
	
	public String baseUrl = "https://c6-staging.fabheads.com/login";
    String driverPath = "E:\\A\\SOFTWARE\\ChromeDriver\\ChromeDriver99\\chromedriver.exe";
    public WebDriver proDriver ; 
	
	  @Test
	  public void firstMavenTestng() throws InterruptedException 
	  {
		  
		  System.out.println("launching Chrome browser"); 
	      System.setProperty("webdriver.chrome.driver", driverPath);
	      proDriver = new ChromeDriver();
	      proDriver.get(baseUrl);
																
	      //Maximize the screen 
			proDriver.manage().window().maximize();
			Thread.sleep(2000);
			
			//Launch the site in Chrome browsers.
			proDriver.get("https://c6-staging.fabheads.com/login");
			Thread.sleep(2000);
			
			String Name =proDriver.getTitle();
			System.out.println("PAGE TITLE : "+Name);
	  }
  
	  @BeforeClass
	  public void beforeClass() throws InterruptedException 
	  {
		  System.out.println("TESTNG WITH MAVEN  " ); 	  
	  }

	  @AfterClass
	  public void afterClass() throws InterruptedException
	  {
		  	WebElement myemail=proDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]"));
			myemail.sendKeys("vaibhavsharma3070@gmail.com");
			Thread.sleep(1000);
			
			WebElement mypsd=proDriver.findElement(By.xpath("//body[1]/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[2]/ion-input[1]/input[1]"));
			mypsd.sendKeys("Test@123");
			Thread.sleep(2000);
			
			//CLick on SIGNIN
			proDriver.findElement(By.xpath("//ion-button[@id='login-button']")).click();
			Thread.sleep(2000);
			
			System.out.println("USER LOGIN SUCCESSFULLY"); 	
			
			proDriver.close();
	  }
	}
