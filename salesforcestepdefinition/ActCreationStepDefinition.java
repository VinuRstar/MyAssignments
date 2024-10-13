package salesforcestepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActCreationStepDefinition {
	
	//declaring driver globally
		public ChromeDriver driver;
		
		
	@Given("Launch Browser and load Url")
	public void launch_browser_and_load_url() {
	    driver = new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@Given("Log into salesforceapp with valid credentials")
	public void log_into_salesforceapp_with_valid_credentials() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("August@2024");
		
	}

	@When("Click login button")
	public void click_login_button() throws InterruptedException {
		driver.findElement(By.id("Login")).click();
		Thread.sleep(5000);
	}

	@When("Navigate to Salesforce app.")
	public void navigate_to_salesforce_app() {
	   System.out.println("Salesforce app navigation successfull");
	}

	@When("Click on the toggle button at left top corner")
	public void click_on_the_toggle_button_at_left_top_corner() {
		driver.findElement(By.xpath("//div[@class = 'slds-icon-waffle']")).click();
	}

	@When("Click on ViewAll in the menu")
	public void click_on_view_all_in_the_menu() {
		driver.findElement(By.xpath("//button[contains(text() ,'View All')]")).click();
	}

	@When("Click on the Sales in the App launcher")
	public void click_on_the_sales_in_the_app_launcher() {
		driver.findElement(By.xpath("(//p[@class='slds-truncate'])[6]")).click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[5]")).click();
	}

	@When("Click on New Button")
	public void click_on_new_button() throws InterruptedException {
		//driver.findElement(By.xpath("//span[text()='New Account']")).click();
				Thread.sleep(5000);
	}

	@When("Enter the Account name as TestActName")
	public void enter_the_account_name_as_testactname() {
		driver.findElement(By.xpath("(//input[@class = 'slds-input'])[4]")).sendKeys("TestActName");

	}

	@When("Select the ownership as Public")
	public void select_the_ownership_as_public() {
		Actions clk = new Actions(driver);
        WebElement movEl = driver.findElement(By.xpath("//label[text()='Ownership']"));
		clk.moveToElement(movEl).perform();
		movEl.click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("Click Save button")
	public void click_save_button() {
		driver.findElement(By.xpath("(//button[text() = 'Save'])[2]")).click();
	}

	@Then("Account Creation should be successful and verify the account name")
	public void account_creation_should_be_successful_and_verify_the_account_name() {

		String actName = driver.findElement(By.xpath("//slot[@name='primaryField']//lightning-formatted-text")).getText();
		System.out.println("Created Act Name is:" +actName);
		
		if(actName.equalsIgnoreCase("TestActName")) {
			System.out.println("Account is successfully created");
		}
		else {
			System.out.println("Account is not creataed");
		}
	}

}
