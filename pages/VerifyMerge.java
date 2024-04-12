package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClass;

public class VerifyMerge extends BaseClass {
	public VerifyMerge(ChromeDriver driver) {
		this.driver=driver;
	}

	public VerifyMerge verifyMerge(){
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("View Contact"))
		{
			System.out.println("Successfully Merged");
		}
		return this;
		
	}

}
