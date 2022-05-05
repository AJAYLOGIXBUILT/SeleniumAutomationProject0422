package PakagesC6pro;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
 
	public class CaptureScreenShots
	{
	 public static void main(String[] args) throws IOException, InterruptedException 
	 {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", "E:\\A\\SOFTWARE\\ChromeDriver\\ChromeDriver99\\chromedriver.exe");
		
		//Create the Chrome driver object to 
		WebDriver driver = new ChromeDriver();
															
		//Maximize the screen 
		driver.manage().window().maximize();
		Thread.sleep(2000);
				
		driver.get("https://www.guru99.com/");
		Thread.sleep(2000);
		
		//Taking FULL webpage SS after after scrolling on every 1 ms 
		Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			
		ImageIO.write(Screenshot.getImage(), "jpg", new File("E:\\A\\Dummy_Images\\screenshot\\fullimage.jpg"));
		
		driver.quit();
	 
	 }

}
		
		
		/*
		File Shreenshotfile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Shreenshotfile1, new File("SS\\SS1.jpg"));
		Thread.sleep(2000);
				
		driver.findElement(By.linkText("➤ Software Testing")).click();
		Thread.sleep(2000);
		
		File Shreenshotfile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Shreenshotfile2, new File("SS\\SS2.jpg"));
		Thread.sleep(2000);
		*/
	//			driver.quit();	

