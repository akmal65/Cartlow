package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProjectOne {
	static WebDriver driver;
	static String url = "https://web.cartlow.net/uae/en";
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/cartlow-qa-akmal/Selenium Jars/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		 
//		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a")).click();
		
		// Calling SignUp 
		 SignUp a = new SignUp(); 
		 a.signup();
		  
		// Calling SignIN
//		SignIn b = new SignIn();
//		b.signin();
	}
}
