package qsp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pathology_lab {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedrivernew.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://gor-pathology.web.app/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@kennect.io");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Qwerty@1234");
	    Thread.sleep(2000);
	    driver.findElement(By.className("MuiButton-label")).click();
	    
	  }

}
