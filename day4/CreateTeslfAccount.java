package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateTeslfAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
        driver.findElement(By.id("accountName")).sendKeys("Saranya");
        driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
        WebElement Ind = driver.findElement(By.name("industryEnumId"));
        Select Industrydd = new Select(Ind);
        Industrydd.selectByIndex(3);
        WebElement OwnID =  driver.findElement(By.name("ownershipEnumId"));
        Select Ownershipdd = new Select(OwnID);
        Ownershipdd.selectByVisibleText("S-Corporation");
        WebElement Source = driver.findElement(By.id("dataSourceId"));
        Select sourcedd = new Select(Source);
        sourcedd.selectByValue("LEAD_EMPLOYEE");
        WebElement MarkCam = driver.findElement(By.id("marketingCampaignId"));
        Select MarkCamdd =new Select(MarkCam);
        MarkCamdd.selectByIndex(6);
        WebElement StatePro = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select StateProdd = new Select(StatePro);
        StateProdd.selectByValue("TX");
        
        
        
        
        

	}

}
