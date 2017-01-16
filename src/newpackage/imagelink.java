package newpackage;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class imagelink {
	 public static void main(String[] args) {
	        String baseUrl = "https://www.facebook.com/login/identify?ctx=recover";
	        WebDriver driver = new FirefoxDriver();

	        driver.get(baseUrl);
	        //click on the "Facebook" logo on the upper left portion
	        driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]")).click();
	        //driver.findElement(By.className("fb_logo img sp_KN_GYdTFBXY sx_ef319a")).click();
	       
	        //verify that we are now back on Facebook's homepage
	        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) {
	            System.out.println("We are back at Facebook's homepage");
	        } else {
	            System.out.println("We are NOT in Facebook's homepage");
	            System.out.println(driver.getTitle().toString());
	        }
	        driver.quit();
	    }
}
