package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonTestCase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 
		 //Launch the browser
		 driver.get("http://leafground.com/pages/Button.html");
		 
		 //click button to travel homepage
		 driver.findElement(By.xpath("//button[text()='Go to Home Page']")).click();
		 
		 driver.navigate().back();
		 
		 //Find position of button(x,y)
		 WebElement pos=driver.findElement(By.id("position"));
			
			int xvalue=pos.getLocation().getX();
			
			int yvalue=pos.getLocation().getY();
			
			System.out.println("(xValue,yValue)="+"("+xvalue+","+yvalue+")");
		 

	}

}
