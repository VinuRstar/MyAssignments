package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAlertInteractions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alertPrompt = driver.switchTo().alert();
		String msg = alertPrompt.getText();
		System.out.println("The msg is : " + msg);
		alertPrompt.dismiss();
		
		if(msg.equalsIgnoreCase("Type your name and click OK")) {
			System.out.println("Matching");
		}
		else
		{
			System.out.println("Not Matching");
		}
		


	}

}
