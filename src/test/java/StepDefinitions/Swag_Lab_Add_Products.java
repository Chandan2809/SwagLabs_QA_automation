package StepDefinitions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

import configuration.Base;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.qameta.allure.Allure;
import utility.ExcelDataUtility;
import utility.TestUtil;

import java.io.ByteArrayInputStream;

public class Swag_Lab_Add_Products extends Base {
	
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	Swag_Lab_Login_StepDef  swag_Lab_Login_StepDef;

	@When("Click on Add to cart")
	public void click_on_add_to_cart() throws InterruptedException {
		
		swag_Lab_Login_StepDef=new Swag_Lab_Login_StepDef();
		swag_Lab_Login_StepDef.enter_the_user_and_password();
		swag_Lab_Login_StepDef.click_on_login_button();
		
		driver.findElement(By.xpath(prop.getProperty("AddProductSwagLab"))).click();
   	    logger.info("Click on Add to product");
   	    Thread.sleep(500);
	}

	@Then("Click on SwagLab Cart Icon")
	public void click_on_swag_lab_cart_icon() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("ClickOnCart"))).click();// comment
   	    logger.info("Click on Cart");
   	    Thread.sleep(500);
	
	}

	@Then("click on Checkout button")
	public void click_on_checkout_button() throws InterruptedException {
		
		driver.findElement(By.xpath(prop.getProperty("ClickOnCheckout"))).click();
   	    logger.info("Click on Cart");
   	    Thread.sleep(500);
	}

	@Then("Enter the User details")
	public void enter_the_user_details() throws Exception {
		
		
		String path = System.getProperty("user.dir") + prop.getProperty("ExcelfilePath");  // refer from global properties
		ArrayList<HashMap<String, String>> data = ExcelDataUtility.storeExcelDataToHashMap(path,prop.getProperty("SwagLab_User_Data"));  // refer from global properties
		Iterator<HashMap<String, String>> i = data.iterator();
		while (i.hasNext())
		
		{
			
			HashMap<String, String> dataset = i.next();
			
			if (dataset.get("Run_Status").equalsIgnoreCase("Yes")) 
			{	
				 Thread.sleep(500);
		driver.findElement(By.xpath(prop.getProperty("SwagLabCustomerFirstName"))).click();
		TestUtil.Entertext(driver.findElement(By.xpath(prop.getProperty("SwagLabCustomerFirstName"))), dataset.get("First_Name"));  //refer from global properties
		TestUtil.Entertext(driver.findElement(By.xpath(prop.getProperty("SwagLabCustomerLastName"))), dataset.get("Last_Name"));
		TestUtil.Entertext(driver.findElement(By.xpath(prop.getProperty("SwagLabCustomerZipCode"))), dataset.get("Zip_Code"));
   	    logger.info("Enter Customer Details");
   	    Thread.sleep(500);
   	    
		/*
		 * // driver.findElement(By.xpath(prop.getProperty("SwagLabCustomerLastName"))).
		 * sendKeys("INT"); logger.info("Enter Customer Last Name"); Thread.sleep(500);
		 * 
		 * driver.findElement(By.xpath(prop.getProperty("SwagLabCustomerZipCode"))).
		 * sendKeys("1245"); logger.info("Enter Customer Zip PinCode");
		 * Thread.sleep(500);
		 */
	}
			
		}
		
	}

	@Then("Click on Continue button")
	public void click_on_continue_button() throws InterruptedException {
		    driver.findElement(By.xpath(prop.getProperty("SwagLabContinueButton"))).click();
	   	    logger.info("Click on Continue Button");
	   	    Thread.sleep(500);
	}

	@Then("Click on Finish button")
	public void click_on_finish_button() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("SwagLabFinishButton"))).click();
   	    logger.info("Click on Finish Button");
   	    Thread.sleep(500);
	}

	@Then("Click on the Home button")
	public void click_on_the_home_button() throws InterruptedException {
		driver.findElement(By.xpath(prop.getProperty("SwagClickOnHomeButton"))).click();
   	    logger.info("Click on Home Button");
   	    Thread.sleep(500);
		//brakdown 
	}
    
	@After
	public void TearDown(Scenario scenario)
	{
	       if(scenario.isFailed())
	       {
	    	   byte[] Screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	    	   Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(Screenshot));
	       }

       //	driver.quit();
	}
	
}

