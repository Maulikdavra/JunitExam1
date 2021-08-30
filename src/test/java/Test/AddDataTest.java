package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddData;
import util.BrowserFactory;

public class AddDataTest {
	WebDriver driver;
	
	@Test
	public void ValidUserShouldAbleToAddTestData() throws InterruptedException {

		driver = BrowserFactory.init();
		AddData Adddata = PageFactory.initElements(driver, AddData.class);

		Adddata.ToggleCheckboxButton();
		Thread.sleep(5000);
		
		Adddata.ToggleCheckboxButton();

		Adddata.CheckboxButton();
		Thread.sleep(5000);
		Adddata.RemoveButton();



	}
}