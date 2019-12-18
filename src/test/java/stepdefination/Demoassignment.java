package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Demoassignment {
	WebDriver driver;

	@Given("DemoWebShop website is launched")
	public void demowebshop_website_is_launched() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver_win32-78\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@Given("user clicks on register button")
	public void user_clicks_on_register_button() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	}

	@When("user provides proper data")
	public void user_provides_proper_data() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("jennifer");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("anistor");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("j.anistor4@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("jennyanny");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("jennyanny");
	}

	@Then("clicks on register button for registration")
	public void clicks_on_register_button_for_registration() {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();  //submission
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();  //logout
		driver.close();
	}

	@Given("application launched")
	public void application_launched() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
//		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
//		System.out.println("duplicate");
		System.setProperty("webdriver.chrome.driver","resources\\chromedriver_win32-78\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	}

	@When("user enters registered valid username {string}")
	public void user_enters_registered_valid_username(String string_a) {
		// Write code here that turns the phrase above into concrete actions
		// throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(string_a);
	}

	@When("valid password in respective field {string}")
	public void valid_password_in_respective_field(String string_b) {
		// Write code here that turns the phrase above into concrete actions
		//   throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(string_b);
	}

	@Then("user clicks on login button for login validation")
	public void user_clicks_on_login_button_for_login_validation() {
		// Write code here that turns the phrase above into concrete actions
		//  throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    driver.close();
	}



}
