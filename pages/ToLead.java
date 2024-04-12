package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ToLead extends BaseClass {
	
	public ToLead(ChromeDriver driver) {
		this.driver=driver;
	}

	public SecondWindowHandle clickToLead(){
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return new SecondWindowHandle(driver);
	}

}
