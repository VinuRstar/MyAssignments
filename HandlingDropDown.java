package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				
				driver.manage().window().maximize();
				
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
				
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		   
		        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		        
		        driver.findElement(By.xpath("//a[text()='Leads']")).click();
		        
		        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		        
		        driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']")).sendKeys("Testleaf");
		        
		        driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']")).sendKeys("Saranya");
		        
		        driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']")).sendKeys("Ragunanthan");
		
		         WebElement dd1 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
		        
		        Select dropdown1 = new Select(dd1);
		       
		        dropdown1.selectByIndex(4);
		        
		       WebElement dd2 =  driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		        
		        Select dropdown2 = new Select(dd2);
		        
		        dropdown2.selectByIndex(2);
		        
		        driver.findElement(By.xpath("//input[@name = 'submitButton']")).click();

		        
		        
	}

}
