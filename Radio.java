package w2.d2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.findElement(By.xpath("//label[text()='Chrome']")).click();
        driver.findElement(By.xpath("//label[text()='Hyderabad']")).click();
        WebElement radioButton = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
        System.out.println("The default selected button is: "+radioButton);
        WebElement ageButton = driver.findElement(By.xpath("//label[text()='21-40 Years']"));
        System.out.println("The default selected age group is : "+ageButton);
        driver.close();
   }
	
}
