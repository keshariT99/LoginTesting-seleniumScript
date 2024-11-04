package loginScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BooksLkLoginProject {
	
	ChromeDriver driver = new ChromeDriver();
	String url = "https://books.lk/";
	
	public void InvokeBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ktenn\\eclipse-workspace\\TestAutomation\\drivers\\chromedriver.exe");
		
		driver.get(url);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class, 'store-selector__button') and contains(@class, 'worldwide__submit-button') and contains(@class, 'zds-button--secondary')]")).click();
		
		WebElement loginLink = driver.findElement(By.xpath("//a[@href='https://www.zara.com/ww/en/logon']"));
		loginLink.click();
		
		driver.findElement(By.xpath("//button[@data-qa-action='logon-view-alternate-button']")).click();

	}
	
	
	public void Login(String username, String password) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement usernameElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
        usernameElement.sendKeys(username);
		
        WebElement passwordElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("password")));
        passwordElement.sendKeys(password);;
		
		driver.findElement(By.name("login")).click();
	}
	
	public void Registration() {
		
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("testuser@gmail.com");
		
		WebElement passwordField = driver.findElement(By.name("password"));
		passwordField.sendKeys("Password123");
		
		WebElement firstNameField = driver.findElement(By.name("firstName"));
		firstNameField.sendKeys("Test");
		
		WebElement lastNameField = driver.findElement(By.name("lastName"));
		lastNameField.sendKeys("User");
		
		WebElement checkbox = driver.findElement(By.id("privacyCheck97"));
		
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		
		driver.findElement(By.xpath("//button[@class='zds-button zds-button--secondary']"));
	}
	
	
	public void SearchBook() {
		
		WebElement searchbox = driver.findElement(By.name("s"));
		searchbox.sendKeys("novel");
		searchbox.sendKeys(Keys.RETURN);
	}
	

}
