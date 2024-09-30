package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingInteractionAutomation {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge Contacts')]")).click();
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		//parent and child window1
		Set <String> allWinAdd = driver.getWindowHandles();
		System.out.println("Windows Address of parent and child 1 " + allWinAdd);
		List<String> allWindows = new ArrayList<String>(allWinAdd);
		driver.switchTo().window(allWindows.get(1));
		driver.findElement(By.xpath("//a[@class = 'linktext']")).click();
		driver.switchTo().window(allWindows.get(0));
		driver.findElement(By.xpath("(//img[@src = '/images/fieldlookup.gif'])[2]")).click();
		//parent and child window2
		Set <String> allWinAdd1 = driver.getWindowHandles();
		System.out.println("Window address of parent and child 2 "+ allWinAdd1);
		List<String> allWindows1 = new ArrayList<String>(allWinAdd1);
		driver.switchTo().window(allWindows1.get(1));
		driver.findElement(By.xpath("(//a[@class = 'linktext'])[6]")).click();
		driver.switchTo().window(allWindows1.get(0));
		//click Merge button
		driver.findElement(By.xpath("//a[@class = 'buttonDangerous']")).click();
		//Alert Handling
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println("The tile of the page is : " +title);
		
		if(title.equals("Merge Contacts | opentaps CRM")) {
			System.out.println("Title of the page is verified is correct");
		}
		else {
			System.out.println("Title of the page verified is incorrect");
		}

		}

}
