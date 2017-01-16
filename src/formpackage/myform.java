package formpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class myform {
	 public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
     String baseUrl = "http://newtours.demoaut.com/mercuryregister.php";
     
     // launch Firefox and direct it to the Base URL
     
     driver.get(baseUrl);
	
     //close Firefox
     driver.close();
    
     // exit the program explicitly
     System.exit(0);
	//
}
}