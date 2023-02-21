package w2.d2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
    ChromeDriver driver=new ChromeDriver();
	driver.get(" https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    driver.findElement(By.name("firstname")).sendKeys("Indira");
    driver.findElement(By.name("lastname")).sendKeys("Saravanakumar");
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("indralaks87@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("indralaks87@gmail.com");
    driver.findElement(By.id("password_step_input")).sendKeys("vimalindu");
    WebElement dateDD = driver.findElement(By.name("birthday_day"));
    Select dod = new Select(dateDD);
    dod.selectByIndex(12);
    WebElement monthDD = driver.findElement(By.id("month"));
    Select mdd = new Select(monthDD);
    mdd.selectByVisibleText("Nov");
    WebElement yearDD = driver.findElement(By.id("year"));
    Select ydd = new Select(yearDD);
     ydd.selectByVisibleText("1987");
    driver.findElement(By.xpath("//label[text()='Female']")).click();
    
    
    
   
    
	
	
		
	}

}