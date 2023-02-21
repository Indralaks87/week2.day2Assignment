package w2.d2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title1 = driver.getTitle();
		System.out.println("Click and cofirm title: "+title1);
		driver.navigate().back();
		boolean enabledButton = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		if(enabledButton==false) {
			System.out.println("Confirm if the button is enabled: yes");
			
		}
		else {
			System.out.println("Confirm if the button is enabled:No ");
			
		}	
			
	   Point locationButton = driver.findElement(By.xpath("//span[text()='Save']")).getLocation();
		System.out.println("Find the position of the submit button : "+locationButton);
	   String buttonColor= driver.findElement(By.xpath("//h5[text()='Find the Save button color']/following-sibling::button")).getCssValue("background-color");
	   System.out.println("Save the button color :"+buttonColor);
	   int buttonHeight = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getSize().getHeight();
	   System.out.println("The height of the button is :" +buttonHeight);
	   int buttonWidth = driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).getSize().getWidth();
	   System.out.println("The width of the button is : "+buttonWidth);
	   
	   
	   
		}
	}


