package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class myform {
	 public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
     String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
     
     // launch Firefox and direct it to the Base URL
     
     driver.get(baseUrl);
	
     //textbox
     driver.findElement(By.name("userName")).sendKeys("tutorials");
     driver.findElement(By.name("userName")).clear();
     
     //radio button not in the form
     //driver.findElement(By.cssSelector("input[value='Business']")).click();
     
     //Links
     driver.findElement(By.linkText("REGISTER")).click();
     //driver.findElement(By.partialLinkText("here")).click();
     
     Select drpcountry = new Select(driver.findElement(By.name("country")));
     drpcountry.selectByVisibleText("ANTARCTICA");
     
     //try submit, id for User Name is "email"
     driver.findElement(By.name("email")).sendKeys("tutorials");
     driver.findElement(By.name("password")).sendKeys("tutorials");
     driver.findElement(By.name("password")).submit();
     
     //close Firefox
     driver.close();
    
     // exit the program explicitly
     System.exit(0);
	//
}
}