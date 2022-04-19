package PakagesC6pro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Register_C6 {

		public static void main(String[] args) throws InterruptedException, IOException	
		{
					
			System.setProperty("webdriver.chrome.driver", "E:\\A\\SOFTWARE\\ChromeDriver\\ChromeDriver99\\chromedriver.exe");
					
			//Create the Chrome driver object to 
			WebDriver avDriver = new ChromeDriver();
																
			//Maximize the screen 
			avDriver.manage().window().maximize();
			Thread.sleep(3000);
			
			//Launch the site in Chrome browsers.
			avDriver.get("https://c6-staging.fabheads.com/login");
			Thread.sleep(2000);
			
			String Name =avDriver.getTitle();
			System.out.println("PAGE TITLE IS : "+Name);
			
			//Click on Register account link
			avDriver.findElement(By.xpath("//div[contains(text(),'Register for a new account')]")).click();
			Thread.sleep(3000);		

			
			//Fill Email 
			WebElement myemail=avDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-register[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]"));
			myemail.sendKeys("vaibhavsharma3070@gmail.com");
			//myemail.sendKeys("vaibhavvalidation@tempmail.win");
			//myemail.sendKeys("vaibhavsharmaautomation@tempmail.win");
				
			//Filled Password 
			WebElement mypsd=avDriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-register[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[2]/ion-input[1]/input[1]"));
			mypsd.sendKeys("Test@123");
			Thread.sleep(1000);
			
			//Filled CONFIRM Password 
			WebElement cnfmypsd=avDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-register[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[3]/ion-input[1]/input[1]"));
			cnfmypsd.sendKeys("Test@123");
			Thread.sleep(1000);
			
			//CLick on SIGNIN
			avDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-register[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-button[1]")).click();
			Thread.sleep(3000);
								
			String myerror=avDriver.findElement(By.xpath("//p[contains(text(),'A user is already registered with this e-mail addr')]")).getText();
			System.out.println("Validation Message is : " +myerror);
			String erromesage ="A user is already registered with this e-mail address.";
					
			if(myerror.equals(erromesage))
			{
				System.out.println("USER EMAIL IS ALREADY EXISTS, Try with new email ");	
			}
			else		
			{			
				System.out.println("REGISTER SUCCESSFULLY");	
			}
				
			//avDriver.close();
		}
}

