package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFrameAndAlert {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Alert alertMsg = driver.switchTo().alert();
		alertMsg.accept();
		String textMsg = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		if(textMsg.equals("You pressed OK!")) {
			
			System.out.println("You have pressed right option" + textMsg);
		}
		else {
			System.out.println("You have not pressed right option" + textMsg);
		}
		
		

	}

}
