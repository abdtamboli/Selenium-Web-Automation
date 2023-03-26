package testpackage;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class FormRegistration {
	
	@Test
	public void  FormRegistration() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://wallethub.com/join/light");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.name("em"));
		email.sendKeys("abhitamboli222@gmail.com");
		
		WebElement password = driver.findElement(By.name("pw1"));
		password.sendKeys("xxxxx");
		
		WebElement Confirmpassword = driver.findElement(By.name("pw2"));
		Confirmpassword.sendKeys("xxxxx");
		
		WebElement uncheck = driver.findElement(By.xpath("//*[@id='join-light']/form/div/div[4]/label/span"));
		uncheck.click();
		
		WebElement Joinbtn = driver.findElement(By.xpath("//*[@id='join-light']/form/div/div[6]/button/span/span"));
		Joinbtn.click(); 
		
		Thread.sleep(2000);
		
		System.out.println("Registration Successfully in Wallethub");
		
		Thread.sleep(2000);
		
		System.out.println("Please enter the email and password to login wallethub: ");
	
		driver.get("https://wallethub.com/login");
		
		WebElement Loginemail = driver.findElement(By.name("em"));
		Loginemail.sendKeys("abhitamboli@gmail.com");
		
		WebElement Loginpassword = driver.findElement(By.name("pw"));
		Loginpassword.sendKeys("xxx");
		
		WebElement Loginnbtn = driver.findElement(By.xpath("//*['@id=join-login']/form/div[4]/button[2]/span"));
		Loginnbtn.click(); 
		
		System.out.println("Invalid Email Id or Password ");
	}

}
