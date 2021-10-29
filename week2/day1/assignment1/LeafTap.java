package week2.day1.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTap {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeafs");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sharath");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("kumar");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("muruga");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("yamaha");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02/16/95");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("60");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("6454654");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sara00651@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9638521470");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("ASK");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Yamaha");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No.8,address nagar");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("murugan streer");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600030");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("200045");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Babu");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		
		
		
		driver.findElement(By.name("submitButton")).click();
		
		
	}
	

}
