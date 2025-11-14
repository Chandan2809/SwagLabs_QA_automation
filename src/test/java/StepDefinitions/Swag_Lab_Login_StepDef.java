package StepDefinitions;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;

public class Swag_Lab_Login_StepDef extends Base{
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	@Given("Enter the User and Password")
	public void enter_the_user_and_password() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("SwagLabUserID"))).sendKeys("standard_user");
   	    logger.info("Enter the User Name");
   	    Thread.sleep(500);
   	    
   	    driver.findElement(By.xpath(prop.getProperty("SwagLabUserPassword"))).sendKeys("secret_sauce");
	    logger.info("Enter the User Name");
	    Thread.sleep(500);
   	 
	}

	@Then("click on login button")
	public void click_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("SwagLabUserLoginButton"))).click();
	    logger.info("Enter the User Name");
	    Thread.sleep(500);
	    

	    
	}
	/*
	 * @After public void TearDown(Scenario scenario) { if(scenario.isFailed()) {
	 * byte[] Screenshot =
	 * ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	 * Allure.addAttachment("Failed Screenshot", new
	 * ByteArrayInputStream(Screenshot)); }
	 * 
	 * // driver.quit(); }
	 * 
	 */
}


