package PakagesC6pro;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import com.sun.glass.events.KeyEvent;
 
 
public class FileUpload_Robo
{
 
    private static final String KeyEvent = null;

	public static void main(String[] args) throws InterruptedException, AWTException
    {
	  
	    System.setProperty("webdriver.chrome.driver", "E:\\A\\SOFTWARE\\ChromeDriver\\ChromeDriver99\\chromedriver.exe");
			
		//Create the Chrome driver object to 
		WebDriver drv = new ChromeDriver();
		
		drv.manage().window().maximize();
		Thread.sleep(2000);
	    
		drv.get("https://www.grammarly.com/plagiarism-checker");//open testing website
		Thread.sleep(2000);
	 
	    JavascriptExecutor js = (JavascriptExecutor)drv; // Scroll operation using Js Executor
	    js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	     WebElement browse = drv.findElement(By.linkText("Upload a file"));
	     // using linkText, to click on browse element 
	    browse.click(); // Click on browse option on the webpage
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	    // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	    StringSelection str = new StringSelection("E:\\A\\SRS_v4.docx");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     //rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
   }
 
}