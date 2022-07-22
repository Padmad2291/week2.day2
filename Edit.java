package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		// Step 1: Launch the browser
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Step 2: Enter your email address
		driver.findElement(By.id("email")).sendKeys("padmad2291@gmail.com");
		
		//Step 3: Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("padma");
		
		//Step 4: Get default text entered
		WebElement defaulttext=driver.findElement(By.xpath("//input[@value='TestLeaf']"));
		String text=defaulttext.getAttribute("value");
		System.out.println("Default text is "+text);		
		
		//Step 5: Clear the text
		driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
		
		//Step 6: Confirm that edit field is disabled
		WebElement diselement=driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input"));
		boolean disabled=diselement.isEnabled();
		
		if(disabled==true) {
			System.out.println("Enabled");}
		
		else
		{
			System.out.println("Disabled");
		}
		

	}

}
