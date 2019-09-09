package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginTEST {
    WebDriver driver;
    
  @Given("i am on login page")
  public void i_am_on_login_page() {
	  
	 System.setProperty("webdriver.chrome.driver", "C:\\HandsOn\\Workspace\\SeleniumWebDriver\\drivers\\chromedriver_win32 (1)\\chromedriver.exe") ;
	 driver = new ChromeDriver();
	 driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	 
	 
	  
  }
  
     

  @Given("I enter username as {string}")
  public void i_enter_username_as(String string) {
	  driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(string);
	 
  }

  @When("I enter password as {string}")
  public void i_enter_password_as(String string){
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys(string);
  }
  
  @When("i click on login")
  public void i_click_on_login() {
	  driver.findElement(By.xpath("//input[@value='Login']")).click();   
}
}