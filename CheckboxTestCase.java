package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckboxTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch the browser
		 driver.get("http://leafground.com/pages/checkbox.html");
		 
		 //Select the languages that you know
		 driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[1]")).click();
		 driver.findElement(By.xpath("//label[text()='Select the languages that you know?']/following-sibling::input[3]")).click();
		 
		 //Confirm Selenium is checked
		 WebElement selected=driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following-sibling::input"));
		 Boolean value=selected.isSelected();
		 
		 if(value==true)
			{
				System.out.println("Checkbox is selected");
			}else
			{
				System.out.println("Checkbox is not selected");
			}
		 
		 //DeSelect only checked
		 WebElement checked=driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following-sibling::input[2]"));
		 Boolean check=checked.isSelected();
		 
		 if(check==true)
			{
				checked.click();
				System.out.println("Deselected");
			}
		 
		 //Select all below checkboxes
		 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[1]")).click();
		 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[2]")).click();
		 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[3]")).click();
		 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[4]")).click();
		 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[5]")).click();
		 driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input[6]")).click();
		 

	}

}
