import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class windowpopuplinkusrnamepwd {

	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "/Users/archana/Documents/chromedriver_mac64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        //driver.get("https://the-internet.herokuapp.com/");
        // http://username:pwd@link
        driver.get("http://admin:admin@the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Basic Auth")).click()  ;
        //driver.close();
        
        
	}
}