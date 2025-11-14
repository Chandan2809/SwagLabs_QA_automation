package testRunner;

import org.junit.jupiter.api.Disabled;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.platform.engine.Constants;

import static io.cucumber.junit.platform.engine.Constants.*;


@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "StepDefinitions")
@IncludeTags("AddProductSwagLab")
//@IncludeTags("AddProductSwagLab|LiskartRegistration|LiskartLogin|LiskartSellerRegistration|LiskartSellerLogin")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber-reports/cucumber.json,html:target/HTMLReport,com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html,io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm")

@Disabled

public class TestRun {
    // Empty class
 
}


/*

@RunWith(Cucumber.class)
@CucumberOptions
      (
    	features="./Feature/Login.feature",
    	glue="stepDefinitions",
    	dryRun=false,
    	plugin= {"pretty","html:test-output"}
    		  
         )




public class TestRun {

}



import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import io.cucumber.junit.platform.engine.Constants;

import static io.cucumber.junit.platform.engine.Constants.*;



@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("feature")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "stepDefinations")
//@IncludeTags("AddCorporateClient | AddPrivateClient | AddOfficeAddress | DeleteClient | Create_Quote | Create_Policy")
@IncludeTags("NB_Adjustments")
//@IncludeTags("AddCorporateClient | AddOfficeAddress | DeleteClient | Create_Quote | BTIS_Webform_Create_Quote | Check_JacketPolicy_Sequence | Check_JacketPolicy_Sequence_For_BTIS | Create_Policy | BTIS_Create_Policy | Create_Zip_For_All_JacketPolicy_Screenshots_Of_All_Products | NBAdjustment | Perform_MTA_And_MTA_Reversal | PolicyCancellation | Referral-NB_Adjustment | Perform_BTIS_Product_MTA_And_MTA_Reversal | Referral-Cancellation | PolicyRenew | VRI")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, json:target/cucumber-reports/cucumber.json,html:target/HTMLReport,com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/cucumber-reports/report.html")



public class TestRunner {
    // Empty class
 
}

*/
