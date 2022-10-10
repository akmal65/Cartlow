package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PLPage extends ProjectOne{  
	void plp() throws InterruptedException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='search']")));
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("August Steiner Mens");
		driver.findElement(By.xpath("(//span[@class='input-group-text'])[3]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("August Steiner Men's Casual Multifunction")));
		driver.findElement(By.partialLinkText("August Steiner Men's Casual Multifunction")).click();
		    
	} 
}
