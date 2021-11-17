package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\User\\geckodriver-v0.30.0-win32\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4");
		//System.out.println("This Step opens the Firefox and launch the application");
	}
	
	@When("^Enter the Username and Password$")
	public void enter_the_Username_and_Password() throws Throwable
	{
		driver.findElement(By.name("uid")).sendKeys("username12");
		driver.findElement(By.name("password")).sendKeys("password12");
		//System.out.println("This step enter the Username and Password on the login page.");
	}
	
	@Then("^Reset the credentials$")
	public void Reset_the_credential() throws Throwable
	{
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.name("btnOk")).click();
		//System.out.println("This step click on the Reset button.");
	}
	
}
