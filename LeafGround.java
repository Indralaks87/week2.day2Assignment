package w2.d2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {


	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
		driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Indira Balachandran");
		driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("India,chennai");
		
		WebElement verify = driver.findElement(By.xpath("//input[@placeholder='Disabled']"));
		boolean displaying = verify.isDisplayed();
		System.out.println("Is text box disabled "+displaying);
		
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		WebElement retrieve = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']"));
		String text = retrieve.getAttribute("value");
		System.out.println("Retrieve typed text" +text);
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("indralaks87@gmail.com");
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Sample text about myself");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Sample text for text editor");
		driver.findElement(By.xpath("(//div[@class='grid formgrid']//input)[9]")).sendKeys("Enter");
		
		WebElement label1 = driver.findElement(By.xpath("//label[text()='Username']"));
		Point before = label1.getLocation();
		System.out.println("Label position click: "+before);
		driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
		Point after = label1.getLocation();
		System.out.println("Label position click :"+after);
		if(before==after) {
			System.out.println("Username label positions are equal");
		}
		else {
			System.out.println("Username label positions are not equal");
		}
		driver.findElement(By.xpath("(//li[@class='ui-autocomplete-input-token']/input)")).sendKeys("IndiraBalachandran");
	    driver.findElement(By.xpath("//li[@data-item-label='IndiraBalachandran2']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("11/13/1987");
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt118_input']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-k')]")).click();
		driver.findElement(By.xpath("//div[@class='ql-editor ql-blank' ]")).sendKeys("LeafGround");
		driver.close();
		
		
		
		
		
		
	
		
		
	}

	

}
