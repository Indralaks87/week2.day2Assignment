package w2.d2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement((By.className("decorativeSubmit"))).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Nandhanaa");
		driver.findElement(By.id("lastNameField")).sendKeys("Saravanakumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nandhu");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sarva");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Developing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Writing codes");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("j.saravanakumar@yahoo.com");
		WebElement stateDD = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select sd = new Select(stateDD);
		sd.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        driver.findElement(By.linkText("Edit")).click();
        WebElement descriptionName = driver.findElement(By.id("updateContactForm_description"));
		descriptionName.clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Automobile Insurance");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Contact")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is wrong");
		}
		//driver.close();
		
		
		
		
		
		
		
		
		
			
	}

}
