package driver;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Html {
	public WebDriver driver1;
	public WebDriver driver2;
	public WebDriver driver3;
	
	@BeforeTest
	
	public void login() throws InterruptedException{
		WebDriverManager.chromedriver().setup();
	
		
		
		driver1=new ChromeDriver();
		
		
		driver1.get("https://www.github.com/");
		driver1.findElement(By.xpath("(//a[normalize-space()='Sign in'])[1]")).click();
		Thread.sleep(1500);
		driver1.findElement(By.xpath("(//input[@id='login_field'])[1]")).sendKeys("hamzahalhumsi@hotmail.com");
		driver1.findElement(By.xpath("(//input[@id='password'])[1]")).sendKeys("magneto5354623");
		driver1.findElement(By.xpath("(//input[@name='commit'])[1]")).click();
		
		
	}
	@Test()
public void Testtitle() {
		String Actaul=driver1.getTitle();
		String expeted="GitHub";
	     assertEquals(Actaul,expeted);
	}
	

}
