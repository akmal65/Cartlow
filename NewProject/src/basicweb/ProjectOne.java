package basicweb;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProjectOne { 
	static WebDriver driver;
	static String url = "https://web.cartlow.net/uae/en";
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"/home/cartlow-qa-akmal/Selenium Jars/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);

		// Calling SignUp
		
	//	 SignUp a = new SignUp(); 
	//	 a.signup(); 
		 

		// Sign In with facebook
		/*
		 * SignInWithFaceBook f= new SignInWithFaceBook(); f.facebook();
		 */

		// SignIn with Google
		/*
		 * SignInWithGoogle g= new SignInWithGoogle(); g.googlesignin();
		 */
 
		// Calling SignIN
	
		 SignIn b = new SignIn(); 
		 b.signin();
		 
		// using search page going to PLP
		PLPage pl = new PLPage();
		pl.plp();

	}
}
