package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUp extends ProjectOne {
	void signup() { 
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Sign Up']")));
		driver.findElement(By.xpath("//span[text()='Sign Up']")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("333@lutota.com");
		driver.findElement(By.xpath("(//input[@name='password'])[2]")).sendKeys("123123123");
		driver.findElement(By.xpath("//input[@placeholder='Full name']")).sendKeys("Tester tester");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

		String Actual = driver.getCurrentUrl();
		String Expected = url;
		if (Actual.equalsIgnoreCase(Expected)) {
			System.out.println("Pass");
		} else { 
			System.out.println("Fail"); 
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='su-email-error']")));
			WebElement p = driver.findElement(By.xpath("//div[@id='su-email-error']"));
			System.out.println(p.getText());

		}
	}

}
