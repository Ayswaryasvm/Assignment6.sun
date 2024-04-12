package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewExistingLeadsPage extends BaseClass {
	
	public ViewExistingLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public EditLeadsPage viewDisplayedLead() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new EditLeadsPage(driver);
	}
	public DeleteLeadPage viewDisplayedLeadDel() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new DeleteLeadPage(driver);
	}

}
