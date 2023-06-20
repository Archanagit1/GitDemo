import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fileuploadAutoIT {

public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("Webdriver.chrome.driver", "/Users/archana/Documents/chromedriver_mac64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("pdftojpgconevrterurl");
        driver.findElement(By.cssSelector("locatorofopenfile")); //opens windows pop up
        Thread.sleep(3000);
        Runtime.getRuntime().exec("filepathofexecutableAUTOIT"); 
        // in Auto IT we need to write a script in scite.exe editor to 
           //Au3info-record window components objects
           //build script-scite.exe 
           //1. shift control to file upload windows popup
        	//2. then set  to give the path in the corresponding file name textbox
        	//3. then control click on open button
           //save it - .au3 extension
           // convert to .exe file by compiling the .au3 file
           //call .exe file with runtime class in java in your code 
        /*
         	ControlFocus("Open","","Edit1")

			ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")

			ControlClick("Open","","Button1")
         */
     
        
	}

}
