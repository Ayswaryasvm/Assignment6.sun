package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class AcceptAlert extends BaseClass{
	public AcceptAlert(ChromeDriver driver) {
		this.driver=driver;
	}

	public VerifyMerge acceptAlert() {
		driver.switchTo().alert().accept();
		return new VerifyMerge(driver);
	}
}
