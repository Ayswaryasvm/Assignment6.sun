package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class SecondWindowHandle extends BaseClass{
	public Set<String> next1;
	public List<String> head1 = new ArrayList<String>();
	public String leadID;
	public SecondWindowHandle(ChromeDriver driver) {
		this.driver=driver;
	}

	public SecondWindowHandle switchSecondWindow() {
		 next1 = driver.getWindowHandles();
		 head1 = new ArrayList<String>(next1);
		driver.switchTo().window(head1.get(1));
		return this;
	}
	
	public MergeLead selectSecondLead() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(head1.get(0));
		return new MergeLead(driver);
	}

}
