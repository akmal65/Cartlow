package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignInWithGoogle extends ProjectOne{ 
	void googlesignin() { 
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a")).click();
	
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Sign In with Google']")));
		driver.findElement(By.xpath("//a[@title='Sign In with Google']")).click();

		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("muhammad.akmal@cartlow.com");

		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	}
}
 