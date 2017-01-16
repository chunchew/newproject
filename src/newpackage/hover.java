package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.TakesScreenshot;

public class hover {
	public static void main(String[] args) throws IOException {
		String baseUrl = "http://newtours.demoaut.com/";
		        WebDriver driver = new FirefoxDriver();

		        driver.get(baseUrl);           
		        WebElement link_Home = driver.findElement(By.linkText("Home"));
		        WebElement td_Home = driver
		                .findElement(By
		                .xpath("//html/body/div"
		                + "/table/tbody/tr/td"
		                + "/table/tbody/tr/td"
		                + "/table/tbody/tr/td"
		                + "/table/tbody/tr"));    
		        
		        Actions builder = new Actions(driver);
		        Action mouseOverHome = builder
		                .moveToElement(link_Home)
		                .build();
		      
		        
		        String bgColor = td_Home.getCssValue("background-color");
		        System.out.println("Before hover: " + bgColor);        
		        mouseOverHome.perform();        
		        bgColor = td_Home.getCssValue("background-color");
		        System.out.println("After hover: " + bgColor);
		        
		        //series of actions
		        WebElement txtUserName = driver.findElement(By.name("userName"));
		        //Actions builder = new Actions(driver);
		        Action seriesOfActions = builder
		        		.moveToElement(txtUserName)
		        		.click()
		        		.keyDown(txtUserName, Keys.SHIFT)
		        		.sendKeys(txtUserName, "hello")
		        		.keyUp(txtUserName, Keys.SHIFT)
		        		.doubleClick(txtUserName)
		        		.contextClick()
		        		.build();
		        seriesOfActions.perform();
		        
		  
		        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     // Now you can do whatever you need to do with it, for example copy somewhere
		     FileUtils.copyFile(scrFile, new File("/Users/chunchew/Documents/workspace/test.png"));
		  
		        		
		        driver.quit();
		}
}
