package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignIn extends ProjectOne {
	void signin() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign Up']/following::input")));
		// enter email and password
		driver.findElement(By.xpath("//span[text()='Sign Up']/following::input")).sendKeys("mibote4355@migonom.com");

		driver.findElement(By.xpath("//div[1]/input[@name='password']")).sendKeys("123123123");
		driver.findElement(By.id("sign-in")).click();
		// Click on Google sign in 
//		driver.findElement(By.xpath("//a[@title='Sign In with Google']")).click();

	//	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("mibote4355@migonom.com");

	//	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	}
}
