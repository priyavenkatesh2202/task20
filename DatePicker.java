package task20;

import java.awt.desktop.QuitEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// open the browser
		WebDriver driver = new ChromeDriver();
		
		// launch URL
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		// switch the frame 
		driver.switchTo().frame(0);
		
		
		//to select the date click on date picker field
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// to click on next arrow to change to next month
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		// to click on the required date
		driver.findElement(By.xpath("(//td[@data-event='click'])[22]")).click();
		
		
		
		// to print the date selected
		String date = driver.findElement(By.xpath("(//td[@data-event='click'])[22]")).getText();
		
		
		System.out.println("The date is "  +date);
	    
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		}

}
