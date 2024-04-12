package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass {
	public ViewLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public ViewLeadsPage viewLead() {
		driver.findElement(By.id("viewLead_companyName_sp")).click();
		return this;
	}
	public ViewLeadsPage verifyLeadCreated() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
			
		}
		return this;
	}

}
