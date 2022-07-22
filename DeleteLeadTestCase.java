package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadTestCase {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch the browser
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //Enter the username
		 driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		 
		 //Enter the password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 //Click Login
		 driver.findElement(By.className("decorativeSubmit")).click();
		 
		 //Click crm/sfa link
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //Click Leads link
		 driver.findElement(By.xpath("//a[text()='Leads']")).click();
		 
		 //Click Find leads
		 driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		 
		 //Click on Phone
		 driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		 
		 //Enter phone number
		 driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9047254384");
		 
		 //Click find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 //Capture lead ID of the first resulting lead
		 //14766
		 
		 //Click First Resulting lead
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//a[text()='14766']")).click();
		 
		 //Click Delete
		 driver.findElement(By.xpath("//a[text()='Delete']")).click();
		 
		 //Click Find Leads
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 //Verify message "No records to display" in the lead list.This message confirms the successful deletion
		 WebElement displaypage=driver.findElement(By.xpath("//div[text()='No records to display']"));

		 String content=displaypage.getText();

		 System.out.println(content);

			if(content.equals("No records to display"))
			{
				System.out.println("The first displayed lead is successfully deleted");
			}
		 
		 //Close the browser(Do not log out)
			Browser.close();

	}

}
