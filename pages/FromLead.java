package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FromLead extends BaseClass{
	public FromLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public FirstWindowHandle clicFromLead() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return new FirstWindowHandle(driver);
	}

}
