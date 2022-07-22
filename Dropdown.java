package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch the browser
		 driver.get("http://leafground.com/pages/Dropdown.html");
		 
		 //Select training program using Index
		 WebElement index=driver.findElement(By.id("dropdown1"));
		 Select drop1=new Select(index);
		 drop1.selectByIndex(1);
		 
		//Select training program using Text
		 WebElement text=driver.findElement(By.name("dropdown2"));
		 Select drop2=new Select(text);
		 drop2.selectByVisibleText("Selenium");
		 
		//Select training program using Value
		 WebElement value=driver.findElement(By.id("dropdown3"));
		 Select drop3=new Select(value);
		 drop3.selectByValue("3");
		 
		//Get the number of dropdown options
		 Select options=new Select(driver.findElement(By.xpath("//select[@class='dropdown']")));
		 List option=options.getOptions();
		 int size=option.size();
		 System.out.println(size);
		 
		//You can also use sendkeys to select
		 driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("A");
		 
		//Select your programs 

	}

}
