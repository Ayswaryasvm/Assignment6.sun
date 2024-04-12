package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class EditLeadsPage extends BaseClass{
	
	public EditLeadsPage(ChromeDriver driver) {
		this.driver=driver;
	}
	public EditLeadsPage clickEdit(){
		driver.findElement(By.linkText("Edit")).click();
		return this;
	}
	public EditLeadsPage editCompanyName(){
		WebElement companyName = driver.findElement(By.id("updateLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		return this;
	}
	public EditLeadsPage clickSubmit(){
		driver.findElement(By.name("submitButton")).click();
		return this;
	}
	public EditLeadsPage verifyEditLead(){
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("TCS")) {
			System.out.println("Lead is editted successfully");
		}
		else {
			System.out.println("Lead is not editted");
		}
		return this;
	}

}
