package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSite {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for boys");
        driver.findElement(By.xpath("//input[@id = 'nav-search-submit-button']")).click();
        String resultscount = driver.findElement(By.xpath("(//span[contains(text(),'of over ')])")).getText();
        System.out.println(resultscount + " bag for boys");
        driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[11]")).click();
	    driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[12]")).click();
	    driver.findElement(By.id("a-autoid-0")).click();
	    driver.findElement(By.linkText("Newest Arrivals")).click();
	    String newArrival=driver.findElement(By.xpath("//span[contains(text(),'Mega 12 Casual Backpack')]")).getText();
	    System.out.println(newArrival);
        driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']/img")).click();
	    System.out.println(driver.getTitle());
	    driver.close();
	    

	    
	    
		
		


	}

}
