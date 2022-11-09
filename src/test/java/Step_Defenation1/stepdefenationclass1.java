package Step_Defenation1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefenationclass1 {
	WebDriver driver;
	@Given("User navigates to learningm upskills page")
	public void user_navigates_to_learningm_upskills_page() {
		System.out.println("user is navigating to the learningm upskills page");
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\0040AE744\\Downloads\\chromedriver_win32 (5)\\chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://elearningm1.upskills.in/index.php");
	}
	@Given("user click on sign up")
	public void user_click_on_sign_up() {
	    driver.findElement(By.xpath("//a[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).click();
	}

	@When("user enter  {string} firstname and {string} lastname")
	public void user_enter_firstname_and_lastname(String firstname1, String lastname1) {
		driver.findElement(By.name("firstname")).sendKeys(firstname1);
		driver.findElement(By.name("lastname")).sendKeys(lastname1);
	}
	@When("user enter {string} email id")
	public void user_enter_email_id(String emailid) {
		driver.findElement(By.name("email")).sendKeys(emailid);
	    
	}
	
	@When("user enter{string} username")
	public void user_enter_username(String username) {
	    driver.findElement(By.name("username")).sendKeys(username);
	}
	@When("user enter{string} password")
	public void user_enter_password(String password) {
		driver.findElement(By.name("pass1")).sendKeys(password);
		
	    }
	@When("user enter{string} confirm password")
	public void user_enter_confirm_password(String confrmpass) {
		driver.findElement(By.name("pass2")).sendKeys(confrmpass);
	    
	}
	@When("user click on Register button")
	public void user_click_on_Register_button() {
	    driver.findElement(By.name("submit")).click();
	}
	@Then("user register successfully")
	public void user_register_successfully() {
		driver.findElement(By.name("next")).click();
	    
	}
	@Then("user logout")
	public void user_logout() {
	    driver.findElement(By.id("logout_button")).click();
	}
	@When("user enter  {string} username and {string} password")
	public void user_enter_username_and_password(String username, String password) {
	    driver.findElement(By.id("login")).sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.name("submitAuth")).click();
	}
	@When("user click on inbox")
	public void user_click_on_inbox() {
	    driver.findElement(By.xpath("//a[text()='Inbox ']")).click();
	}

	@When("user click on compose message")
	public void user_click_on_compose_message() {
	    driver.findElement(By.xpath("//img[@title='Compose message']")).click();
	}

	@When("user enter subject")
	public void user_enter_subject() {
	    driver.findElement(By.name("title")).sendKeys("sending email");
	}

	@When("user click on send message")
	public void user_click_on_send_message() {
		Actions a1= new Actions(driver);
		a1.moveToElement(driver.findElement(By.name("compose")));
	    driver.findElement(By.name("compose")).click();
	}
}
