package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class DragDropPageObj extends Base {

	
	
	public DragDropPageObj() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using = "column-a")
	private WebElement sourceA; 
	
	@FindBy(how = How.ID, using = "column-b")
	private WebElement targetB; 
}
