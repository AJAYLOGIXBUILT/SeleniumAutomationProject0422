package PakagesC6pro;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login_C6
{
		public static void main(String[] args) throws InterruptedException, IOException	
		{
					
			System.setProperty("webdriver.chrome.driver", "E:\\A\\SOFTWARE\\ChromeDriver\\ChromeDriver101\\chromedriver.exe");
			//Create the Chrome driver object to 
			WebDriver avDriver = new ChromeDriver();
			
			//avDriver = WebDriverManager.chromedriver().create();
			
			
			//Maximize the screen 
			avDriver.manage().window().maximize();
			Thread.sleep(2000);
			
			//Launch the site in Chrome browsers.
			avDriver.get("https://c6-staging.fabheads.com/login");
			Thread.sleep(2000);
			
			String Name =avDriver.getTitle();
			System.out.println("PAGE TITLE : "+Name);
			
			//CLEAR FIELDS 
			WebElement myemail=avDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]"));
			myemail.clear();
			Thread.sleep(2000);
			
			
			WebElement mypsd=avDriver.findElement(By.xpath("//body[1]/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[2]/ion-input[1]/input[1]"));
			mypsd.clear();
			Thread.sleep(2000);
			
						
			try 
			{
				//CLick on SIGNIN
				//if(myemail.equals(mypsd))
				if(myemail.isDisplayed() && mypsd.isDisplayed())
				{						
					avDriver.findElement(By.xpath("//ion-button[@id='login-button']")).click();
					Thread.sleep(2000);
				}
				
			}
			catch(Exception e)
			{
				System.out.println("PLEASE ENTER USERNAME and  PASSWORD ");
			}
			
			

			WebElement myemaily=avDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]"));
			myemaily.sendKeys("vaibhavsharma3070@gmail.com");
			Thread.sleep(1000);
			
			WebElement mypsdy=avDriver.findElement(By.xpath("//body[1]/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[2]/ion-input[1]/input[1]"));
			mypsdy.sendKeys("Test@123");
			Thread.sleep(2000);
			
			//CLick on SIGNIN
			avDriver.findElement(By.xpath("//ion-button[@id='login-button']")).click();
			Thread.sleep(2000);
	
			System.out.println("FULL SUCCESS  ");
			//avDriver.close();
			}		
		}

