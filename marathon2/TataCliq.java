package marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions opt= new ChromeOptions();
        
        opt.addArguments("--disable-notifications");
        
        // Launch the browser
   		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("wzrk-cancel")).click();
    //mousehover brand
		Actions mouseHover = new Actions(driver);
		WebElement mouseHoverElement = driver.findElement(By.xpath("//div[text()='Brands']"));
		mouseHover.moveToElement(mouseHoverElement).perform();
    //mousehover Watches and Accesories		
		Actions mouseHover1 = new Actions(driver);
		WebElement mouseHoverElement1 = driver.findElement(By.xpath("//div[text() = 'Watches & Accessories']"));
		mouseHover1.moveToElement(mouseHoverElement1).perform();
	//click first option in Featured band	
		driver.findElement(By.xpath("//div[text() = 'Casio']")).click();
		
    //select new arrival in drop down
		WebElement dd1 = driver.findElement(By.xpath("//select[@class = 'SelectBoxDesktop__hideSelect']"));
		Select dropdown1 = new Select(dd1);
		dropdown1.selectByIndex(3);
		
	// choose men from category filter
		driver.findElement(By.xpath("//div[text() = 'Men']")).click();
		Thread.sleep(5000);
		
	// print all prices of watch
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		int priceOfWatches = price.size();
		for(int i=0;i<priceOfWatches;i++) {
			String priceWatches = price.get(i).getText();
			System.out.println("The price of watches :" + priceWatches);
		}
		
		//click on the first resulting watch
		
		//driver.findElement(By.xpath("//div[@class = 'ProductModule__dummyDiv']")).click();
		
		//compare two price are similar
		String text1 = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']")).getText();
		driver.findElement(By.xpath("//div[@class = 'ProductModule__dummyDiv']")).click();
		Set<String> allAddress = driver.getWindowHandles();
		System.out.println(allAddress);
		List<String> allWindows = new ArrayList<String>(allAddress);
		driver.switchTo().window(allWindows.get(1));
		String text2 = driver.findElement(By.xpath("//div[@class = 'ProductDetailsMainCard__price']")).getText();
		String[] half = text2.split("");
		String text3 = half[1].trim();
		if(text1.equals(text3)) {
			System.out.println("The price is similar");
		}
		else {
			System.out.println("The price is similar");
		}
		Thread.sleep(5000);
		//Add to cart
		driver.findElement(By.xpath("//span[text() = 'ADD TO BAG']")).click();
		//Show count of cart
		
	WebElement count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
	String countOfCart = count.getText();
	System.out.println("The items in cart :"+countOfCart);
	
	//Click on cart
	driver.findElement(By.xpath("//div[@class = 'DesktopHeader__myBagShow']")).click();
	Thread.sleep(5000);

	//snapshot of cart
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File("./screenshots/tatacliq.png");
	FileUtils.copyFile(source, destination);
	
	//close all windows
	 driver.quit();

		
	}

}
