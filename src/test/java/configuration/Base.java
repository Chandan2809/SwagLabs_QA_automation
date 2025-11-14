package configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	public static Logger logger;
	
	public static WebDriver getDriver() throws IOException
	{
		logger= LogManager.getLogger(Base.class);
		logger= LogManager.getLogger("getDriver");
		logger= LogManager.getLogger();
		
		prop = new Properties();
		File f = new File(System.getProperty("user.dir")+"/src/test/java/configuration/global.properties");
		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);
		
	
		// 1. Create a Map to hold the preferences
        Map<String, Object> prefs = new HashMap<>();
        
        // Disable "Save password" prompt
        prefs.put("credentials_enable_service", false);
        
        // Disable the general password manager UI
        prefs.put("profile.password_manager_enabled", false);
        
        // Disable the "Change your password" / "password found in data breach" warning
        prefs.put("profile.password_manager_leak_detection", false);

        // 2. Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();

        // Add the preferences to the ChromeOptions
        options.setExperimentalOption("prefs", prefs);
        
        // Optional: Add an argument to run Chrome in guest mode, which also disables password features
        // options.addArguments("--guest");

        // 3. Initialize the WebDriver with the configured options
       // driver = new ChromeDriver(options);

        // Your test automation code goes here
       // driver.get("https://www.saucedemo.com/inventory.html");
        
        // Example: driver.quit();
        
    	driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
		
	}
	

}
