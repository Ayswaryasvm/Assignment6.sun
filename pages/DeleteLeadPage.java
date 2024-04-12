package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class DeleteLeadPage extends BaseClass{
	public DeleteLeadPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public VerifyLead clickDelete() {
		driver.findElement(By.linkText("Delete")).click();
		return new VerifyLead(driver);
	}

}
