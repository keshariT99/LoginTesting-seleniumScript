package guru99Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Guru99Project {
	
	ChromeDriver driver;
	
	String url = "https://demo.guru99.com/v4/";
	
	public void invokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ktenn\\eclipse-workspace\\TestAutomation\\drivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Users\\ktenn\\Downloads\\Compressed\\chrome-win64\\chrome.exe");
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get(url);
		
	}
	
	public void login(String username, String passsword) {
		
		WebElement usernameElement = driver.findElement(By.name("uid"));
		
		usernameElement.sendKeys(username);
		
		driver.findElement(By.name("password")).sendKeys(passsword);
		
		driver.findElement(By.name("btnLogin")).click();
	}
	
	

}
