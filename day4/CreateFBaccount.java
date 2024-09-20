package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFBaccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Sign up for Facebook")).click();
		driver.findElement(By.name("firstname")).sendKeys("Vinu");
		driver.findElement(By.name("lastname")).sendKeys("Raja");
		driver.findElement(By.name("reg_email__")).sendKeys("0123456789");
		driver.findElement(By.id("password_step_input")).sendKeys("Tets@123");
		WebElement dob = driver.findElement(By.id("day"));
		WebElement dob1 = driver.findElement(By.id("month"));
		WebElement dob2 = driver.findElement(By.id("year"));
		Select day = new Select(dob);
		Select month = new Select(dob1);
		Select year = new Select(dob2);
		day.selectByIndex(7);
		month.selectByIndex(10);
		year.selectByValue("1987");
		driver.findElement(By.xpath("//label [contains(text(),'Female')]")).click();
		

	}

}
