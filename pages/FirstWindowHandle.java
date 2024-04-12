package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class FirstWindowHandle extends BaseClass {
	public Set<String> next;
	public List<String> head = new ArrayList<String>();
	public String leadID;
	public FirstWindowHandle(ChromeDriver driver) {
		this.driver=driver;
	}

	public FirstWindowHandle switchFirstWindow() {
		 next = driver.getWindowHandles();
		 head = new ArrayList<String>(next);
		driver.switchTo().window(head.get(1));
		return this;
	}
	
	public ToLead selectFirstLead() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(head.get(0));
		return new ToLead(driver);
	}
	
}
