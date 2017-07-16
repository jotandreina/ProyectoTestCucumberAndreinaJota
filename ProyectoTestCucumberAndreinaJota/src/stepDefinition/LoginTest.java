package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	
	WebDriver driver;
	
	@Given("^Open chrome and start the linkedin home page$")
	public void Open_chrome_and_start_the_linkedin_home_page() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Andreina Jota\\workspace\\ProyectoTestCucumberAndreinaJota\\Selenium\\Chrome Driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.linkedin.com");
		
	   
	}

	@When("^I enter an unregistered username and an unregistered password$")
	public void I_enter_an_unregistered_username_and_an_unregistered_password() throws Throwable {
		
		driver.findElement(By.id("login-email")).sendKeys("testlogincucumber@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("123456");
		
	    
	    
	}

	@Then("^User can not successfully login$")
	public void User_can_not_successfully_login() throws Throwable {
		
		driver.findElement(By.id("login-submit")).click();	
	    
	}
	
	@When("^I enter an valid username and valid password$")
	public void I_enter_an_valid_username_and_valid_password() throws Throwable {
		
		driver.findElement(By.id("login-email")).sendKeys("andreina.jota@yahoo.com");
		driver.findElement(By.id("login-password")).sendKeys("prueba123");
	    
	}

	@Then("^User should be able to login successfully login$")
	public void User_should_be_able_to_login_successfully_login() throws Throwable {
		
		driver.findElement(By.id("login-submit")).click();
	   
	}

	@Then("^and search for a contact$")
	public void and_search_for_a_contact() throws Throwable {
		
		driver.findElement(By.xpath("//input")).sendKeys("andreina");
	    driver.findElement(By.xpath("//form/div[2]/button")).click();
	    driver.findElement(By.xpath("//h3/span/span")).click();
	    
	    
	    
	}




	

}
