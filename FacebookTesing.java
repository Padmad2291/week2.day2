package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookTesing {

	public static void main(String[] args) {
		
		// Step 1: Download and set the path
		WebDriverManager.chromedriver().setup();
		
		// Step 2: Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
				
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("padma");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("dhanapal");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("padmad2291@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("padmad2291@gmail.com");
		
		// Step 10: Enter the password
		driver.findElement(By.id("password_step_input")).sendKeys("Kavin@1522");
		
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select select=new Select(day);
		select.selectByVisibleText("2");
		
		WebElement month = driver.findElement(By.id("month"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Feb");
		
		WebElement year = driver.findElement(By.id("year"));
		Select select2=new Select(year);
		select2.selectByVisibleText("1991");
		
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		
		driver.findElement(By.name("websubmit")).click();
		

	}

}
