package task20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class guviLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//open the browser
		
			WebDriver driver = new ChromeDriver();
				
				//launch the URL
				
				driver.get("https://www.guvi.in/register");
				
				
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				
			
					// to enter the name	
				
				driver.findElement(By.id("name")).sendKeys("Priya Venkatesh");
				
					// to enter the email ID
				driver.findElement(By.id("email")).sendKeys("bhau65@gmail.com");
				
					// to enter the password
				driver.findElement(By.id("password")).sendKeys("space12");
				
					// to enter the mobile number
				driver.findElement(By.id("mobileNumber")).sendKeys("9566700270");
				
					// to click on sign in button
				driver.findElement(By.xpath("//a[@id='signup-btn']")).click();
				
				
					// to select the profile 
				Select fil = new Select (driver.findElement(By.id("profileDrpDwn")));
				fil.selectByVisibleText("Looking for a career");
				
					// to select the degree
				Select file = new Select (driver.findElement(By.id("degreeDrpDwn")));
				file.selectByVisibleText("B.E. / B.Tech. EEE");
				
					// to enter the year 
				driver.findElement(By.id("year")).click();
				
				Thread.sleep(15000);
				
				
					// to click submit button
				driver.findElement(By.id("details-btn")).click();
				
					// to get the text after the page got signed in
				
				String ele = driver.findElement(By.xpath("//p[@class='mr-2']")).getText();
				
				System.out.println(ele);
				
				// to close the browser
				driver.close();
				
				
				// open new browser
				WebDriver drive = new ChromeDriver();
				
					//launch the URL
				drive.get("https://www.guvi.in/sign-in/");
				
				drive.manage().window().maximize();
				
				drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
						// enter the mail id to login
				
				drive.findElement(By.xpath("//input[@type='email']")).sendKeys("priyavenkatesh022@gmail.com");
				
					// enter the password
				drive.findElement(By.xpath("//input[@type='password']")).sendKeys("Priya@123");
				
				
					// to click on login button
				drive.findElement(By.xpath("//a[@id='login-btn']")).click();				
				
				
				Thread.sleep(2000);		
				
				
				// to check whether the page is logged in
    String log =   drive.findElement(By.xpath("//a[@id='home-tab']")).getText();
				
    System.out.println(log);
    
    
				
				
				
	}

}
