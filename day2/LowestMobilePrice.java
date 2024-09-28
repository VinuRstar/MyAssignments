package week3.day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LowestMobilePrice {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> allLinks = driver.findElements(By.className("a-price-whole"));
		
		int phonePrice = allLinks.size();
		System.out.println("No.of phones: "+ phonePrice );
		
		List <String> allPhonePrize = new ArrayList <String>();
		for(int i =0;i<phonePrice;i++) {
			String text = allLinks.get(i).getText();
			
			allLinks.get(i).getText();
			allPhonePrize.add(text);
		}
			System.out.println("The Phone price List : "+ allPhonePrize);
	}		
		
		
		
		


		
		

	

}
