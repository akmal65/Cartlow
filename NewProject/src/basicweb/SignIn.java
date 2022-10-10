package basicweb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
		/* 
		 * WebElement b=driver.findElement(By.
		 * xpath("//div[contains(@class,'navbar navbar-expand-lg')]"));
		 * System.out.println(b.getText()); // String Expected = url; WebElement
		 * c=driver.findElement(By.xpath("Headphones & wireless audio"));
		 * System.out.println(c.getText()); if(c.getText().equals(b.getText())){
		 * System.out.println("Pass"); } else { System.out.println("Fail");
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "(//div[@class='invalid-feedback'])[1]"))); WebElement p =
		 * driver.findElement(By.xpath("(//div[@class='invalid-feedback'])[1]"));
		 * System.out.println(p.getText()); }
		 */
	}
}   
 