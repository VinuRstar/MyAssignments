package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IneractionWithCheckbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		String textOfAjaxstatus = driver.findElement(By.xpath ("//span[@class = 'ui-growl-title']")).getText();
		System.out.println("The Check box status is : " +textOfAjaxstatus);
		driver.findElement(By.xpath("//div[@class= 'ui-chkbox-box ui-widget ui-corner-all ui-state-default']")).click();
		driver.findElement(By.xpath("(//div[@class = 'ui-chkbox-box ui-widget ui-corner-all ui-state-default'])[5]")).click();
		String textOfTriState = driver.findElement(By.xpath ("//span[contains(text(),'State has been changed.')]")).getText();
		System.out.println("The Check box status is : " +textOfTriState);
		driver.findElement(By.xpath ("//div[@class = 'ui-toggleswitch ui-widget']")).click();
		String textOfToggleSwitch = driver.findElement(By.xpath ("//span[@class = 'ui-growl-title']")).getText();
		System.out.println("The status of Toggleswitch is: "+textOfToggleSwitch);
		WebElement checkbox = driver.findElement(By.xpath("(//div[@class = 'ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
		boolean isSelected = checkbox.isSelected();
        if (isSelected) {
		    System.out.println("Checkbox is active");
		} else {
		    System.out.println("Checkbox is disabled");
		}

		driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-triangle-1-s']")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Paris')])[2]")).click();
		driver.findElement(By.xpath("(//label[contains(text(),'Istanbul')])[2]")).click();
        Thread.sleep(700);
		driver.close();




	}

}
