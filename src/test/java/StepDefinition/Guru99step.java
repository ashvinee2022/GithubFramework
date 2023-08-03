package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Guru99step {
public static WebDriver driver;
	@Given("User on Register Page")
	public void user_on_register_page() {
	 driver =new ChromeDriver();  
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	 driver.manage().deleteAllCookies();
	 driver.get("https:demo.guru99.com/test/newtours/register.php");
	 		
	}
	

	@When("User Enter All Contact Information")
	public void user_enter_all_contact_information() {
	  driver.findElement(By.name("firstName")).sendKeys("Ashvinee");
	  driver.findElement(By.name("lastName")).sendKeys("Jadhav");
	  driver.findElement(By.name("phone")).sendKeys("7263015432");
	  driver.findElement(By.name("userName")).sendKeys("ashvineejadhav@gmail.com");

	  
	}

	@When("User Enter All MAiling Information")
	public void user_enter_all_m_ailing_information() {
		driver.findElement(By.name("address")).sendKeys("pune");
		driver.findElement(By.name("city")).sendKeys("pune1");
		driver.findElement(By.name("state")).sendKeys("MAHARASTRA");
		driver.findElement(By.name("postalcode")).sendKeys("412387");
		WebElement wb=driver.findElement(By.name("country"));
		Select sel=new Select(wb);
		sel.selectByVisibleText("INDIA");
	}
	@When("User Enter All User Information")
	public void user_enter_all_user_information() {
		driver.findElement(By.name("email")).sendKeys("ashvinee123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ashvinee345");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("ashvinee345");
		
	}
	@Then("User Click on Submit Button")
	public void user_click_on_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	@When("Validate HomePage Title")
	public void validate_home_page_title() {
	   String actualTitle=driver.getTitle();
	   Assert.assertEquals(actualTitle.contains("Mercury"), true);
	}
	@Then("Click on Sign In")
	public void click_on_sign_in() {
	    driver.findElement(By.xpath("//a[text()='sign-in']")).click();
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password() {
		driver.findElement(By.name("userName")).sendKeys("ashvineejadhav345");
		driver.findElement(By.name("password")).sendKeys("ashvinee2@123");
	}
	@Then("Click on login button")
	public void click_on_login_button() {
	  driver.findElement(By.name("submit")).click(); 
	}

	@Then("User validate LoginPage url and LOginPage Title")
	public void user_validate_login_page_url_and_l_ogin_page_title() {
	   String actualUrl=driver.getCurrentUrl();
	   Assert.assertEquals(actualUrl.contains("guru"), true);
	}

	@Then("User Capture Physical text")
	public void user_capture_physical_text() {
	  WebElement wb=driver.findElement(By.xpath("//h3[text()='login successfully']"));
	  String physicalText=wb.getText();
	  Assert.assertEquals(physicalText, "login successfully");
	}
}
