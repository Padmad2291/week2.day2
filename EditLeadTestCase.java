package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadTestCase {

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
		 driver.findElement(By.linkText("Leads")).click();
		 
		 //Click Find leads
		 driver.findElement(By.linkText("Find Leads")).click();
		 
		 //Enter first name
		 driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("padma");
		 
		 //Click Find leads button
		 driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		 
		 //Click on first resulting lead
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//a[text()='padma'])[1]")).click();
		 
		 //Verify title of the page
		 String title=driver.getTitle();
		 if(title.equals("View Lead | Opentaps CRM")) {
			 System.out.println(title);
		 }
		 
		 //To get the title
		 //System.out.println(driver.getTitle());
		 
		 //Click Edit
		 driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		 
		 //Change the company name
		 driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		 driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("IBM");
		 
		 //Click update
		 driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		 
		 //Confirm the changed name appears
		 WebElement companyName=driver.findElement(By.id("viewLead_companyName_sp"));
		 String newCompanyName=companyName.getText();
		 
		 if(newCompanyName.contains("IBM")) {
			 System.out.println("Name changed");
		 }
		 //.equals is not working
		 //Close the browser
		 driver.close();
	}

}
