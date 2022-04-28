package PakagesC6pro;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginNewProject {

	
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\A\\SOFTWARE\\ChromeDriver\\ChromeDriver99\\chromedriver.exe");
		
		//Create the Chrome driver object to 
		WebDriver proDriver = new ChromeDriver();
															
		//Maximize the screen 
		proDriver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Launch the site in Chrome browsers.
		proDriver.get("https://c6-staging.fabheads.com/login");
		Thread.sleep(2000);
		
		String Name =proDriver.getTitle();
		System.out.println("PAGE TITLE : "+Name);

	
			WebElement myemail=proDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]"));
			myemail.sendKeys("vaibhavsharma3070@gmail.com");
			Thread.sleep(1000);
			
			WebElement mypsd=proDriver.findElement(By.xpath("//body[1]/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-login[1]/ion-content[1]/div[1]/div[1]/div[4]/ion-list[1]/ion-item[2]/ion-input[1]/input[1]"));
			mypsd.sendKeys("Test@123");
			Thread.sleep(2000);
			
			//CLick on SIGNIN
			proDriver.findElement(By.xpath("//ion-button[@id='login-button']")).click();
			Thread.sleep(2000);
		
		
		proDriver.findElement(By.xpath("//ion-button[contains(text(),'New Project')]")).click();
		Thread.sleep(2000);
		
		WebElement proname=proDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-modal[1]/div[2]/app-new-project[1]/ion-content[1]/ion-list[1]/ion-item[1]/ion-input[1]/input[1]"));
		proname.sendKeys("19th APRIL AUTOMATION PROJECT ON STAGE");
		Thread.sleep(2000);
		
		WebElement prodesr=proDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-modal[1]/div[2]/app-new-project[1]/ion-content[1]/ion-list[1]/ion-item[2]/ion-textarea[1]/div[1]/textarea[1]"));
		prodesr.sendKeys("THIS IS DUMMY PROJECT CREATED");
		Thread.sleep(2000);
				
		proDriver.findElement(By.xpath("//ion-button[contains(text(),'Create')]")).click();
		Thread.sleep(3000);
				
		proDriver.findElement(By.xpath("//body/app-root[1]/ion-app[1]/ion-router-outlet[1]/app-jobs[1]/ion-content[1]/div[1]/div[1]/ion-grid[2]/ion-row[1]/ion-col[5]/ion-button[1]")).click();
		Thread.sleep(3000);
		
		proDriver.close();
				
	}
	
}


/*

// creating object of Robot class
Robot rb = new Robot();


KeyPress(): This method is called when we want to press any key.
Example: robot.keyPress(KeyEvent.VK_ENTER);
KeyRelease(): This method is used to release the pressed key.
Example: robot.keyRelease(KeyEvent.VK_ENTER);
MouseMove(): Used when there is a need of moving the mouse pointer over ‘X’ and ‘Y’ coordinates.
Example: robot.mouseMove(coordinates.get.X(), coordinates.get.Y());
MousePress(): This method is called when we want to press the left mouse button.
Example: robot.mousePress(InputEvent.BUTTON_MASK);
MouseRelease(): This method is used to release the pressed mouse button.
Example: robot.mouseRelease(InputEvent.BUTTON_DOWN_MASK)

*/
