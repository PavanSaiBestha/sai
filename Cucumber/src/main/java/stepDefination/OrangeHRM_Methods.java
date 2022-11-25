package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_Methods
{
	WebDriver driver;
	@Given("^User should launch the Chrome Browser$")
	public void user_should_launch_the_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Downloads\\Srini Softwares\\DriverFiles\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	@When("^user enters OrangeHRM Application URL Address$")
	public void user_enters_OrangeHRM_Application_URL_Address()   {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard");
	    
	}

	@Then("^User Should be at the LogIn Page$")
	public void user_Should_be_at_the_LogIn_Page()  {
		
	WebElement OHRMLogo=driver.findElement(By.xpath(
			"/html/body/div[1]/div/div[2]/div/img"));
	if(OHRMLogo.isDisplayed())
	{
		System.out.println("The OHRMLogo is Displayed Successfully found");
	}
	else
	{
		System.out.println("The OHRMLogo is not Displayed");
	}
		
	    
	}

	@Then("^User Should Close the Application$")
	public void user_Should_Close_the_Application()  {
		driver.close();
	    
	}
	
	
	@When("^User enters Username and Password and Click on Log in button$")
	public void user_enters_Username_and_Password_and_Click_on_Log_in_button() throws InterruptedException  {
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.clear();
		userName.sendKeys("pavansai");
		
		WebElement password=driver.findElement(By.name("txtPassword"));
		password.clear();
		password.sendKeys("Pavansai@1234$");
		
		WebElement logInButton=driver.findElement(By.className("button"));
		logInButton.click();
		
		System.out.println("LogIn page Successfully");
		Thread.sleep(3000);
	    
	}

     @Then("^User Should be navigated to HomePage of OrangeHRM Application$")
     public void user_Should_be_navigated_to_HomePage_of_OrangeHRM_Application() throws InterruptedException  {
    	 
    	 System.out.println("My name is Pavansai");
    	 Thread.sleep(3000);
    	 
    	 
    	 
}

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\" and Click on Log in button$")
    public void user_enters_and_and_Click_on_Log_in_button(String Username, String Password)   {
    	
    	WebElement userName=driver.findElement(By.id("txtUsername"));
    	userName.clear();
    	userName.sendKeys(Username);

    	//System.out.println(" Entered UserName Successfully ");
    	//log.info("Entered UserName Successfully");

    	WebElement password=driver.findElement(By.name("txtPassword"));
    	password.clear();
    	password.sendKeys(Password);

    	//System.out.println(" Entered Password Successfully ");
    	//log.info("Entered Password Successfully");

    	WebElement logInButton=driver.findElement(By.className("button"));
    	logInButton.click();

    	
    	
    	System.out.println("LogIN Successfully");
   
}



}

