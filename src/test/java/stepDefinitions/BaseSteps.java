package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.PageObjManager;

import java.util.concurrent.TimeUnit;

public class BaseSteps {

	

     static WebDriver driver;
     PageObjManager pageObjectManager;
     static int i; 

    public BaseSteps(){
    	i++;
    	if(i==1){
    		// creating driver instance
    		
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Mehme\\eclipse-workspace\\MyStudy\\driver\\new\\chromedriver.exe");
            driver= new ChromeDriver();
            
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    	 
    	 // creating page object manager instance, only it not created
        if(pageObjectManager==null){
        	
           pageObjectManager = new PageObjManager(driver);
        }
    }

}
