package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectOne {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/cartlow-qa-akmal/Selenium Jars/chromedriver_linux64/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("https://web.cartlow.net/uae/en");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a")).click();
 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//span[text()='Sign Up']/following::input")));
	     //enter username and password
		driver.findElement(By.xpath("//span[text()='Sign Up']/following::input")).sendKeys("xyz");
		
		driver.findElement(By.xpath("//div[1]/input[@name='password']")).sendKeys("123");
		driver.findElement(By.id("sign-in")).click();
        // Click on sign in page 
		driver.findElement(By.xpath("//a[@title='Sign In with Google']")).click();
	}  

}
