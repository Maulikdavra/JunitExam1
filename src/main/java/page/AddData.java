package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddData extends BasePage{

	WebDriver driver;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/input[3]\r\n") WebElement TOGGLE_ALL_CHECKBOX_BUTTON;
	@FindBy(how=How.XPATH, using="//*[@id=\"todos-content\"]/form/ul/li/input\r\n") WebElement CHECKBOX_BUTTON;
	@FindBy(how=How.XPATH, using="/html/body/div[3]/input[1]\r\n") WebElement REMOVE_BUTTON;

	
	public void ToggleCheckboxButton() {
		TOGGLE_ALL_CHECKBOX_BUTTON.click();
	}
	
	public void CheckboxButton() {
		CHECKBOX_BUTTON.click();
	}
	
	public void RemoveButton() {
		REMOVE_BUTTON.click();
	}
}
