package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JS {
	
	// this is java script object class, will useful for element interaction using jQuery
	
    public static void scrollDown(WebDriver driver){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,500)");
    }
    

    public static void scrollToElementview(WebDriver driver,WebElement element){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();", element);
    }
   
    public static void clickElement(WebDriver driver,WebElement element){
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	System.out.println(driver.toString());
        jse.executeScript("arguments[0].click();", element);
    }
   
    public static void setValue(WebDriver driver,WebElement element, String v1){
       	JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value="+v1+";", element );
        
    }
    
    public static void scrollRight(WebDriver driver,String s1) {
    	
    	JavascriptExecutor jse = (JavascriptExecutor) driver;
    	jse.executeScript(
    		    "document.getElementById("+s1+").scrollRight += 250", "");
    }
}
