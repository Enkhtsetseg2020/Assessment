package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class CheckBoxesPageObj extends Base{
	
	public CheckBoxesPageObj() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"checkboxes\"]/input[1]")
	private WebElement checkBox1; 
	@FindBy(how = How.XPATH, using = "//*[@id=\"checkboxes\"]/input[2]")
	private WebElement checkBox2; 
	
	

	

}
