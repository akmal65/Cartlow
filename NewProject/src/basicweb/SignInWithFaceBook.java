package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
 
public class SignInWithFaceBook extends ProjectOne{ 
		void facebook() {
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/div/div/ul/li[4]/a")).click();

			wait.until( 
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='socialLogin']/a[@class='fb_login ']")));
			driver.findElement(By.xpath("//div[@class='socialLogin']/a[@class='fb_login ']")).click();
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@xyz");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123123123");
			driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		}
}
                                   