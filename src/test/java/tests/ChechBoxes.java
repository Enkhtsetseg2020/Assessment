package tests;

import org.testng.annotations.BeforeMethod;

import core.Base;

public class ChechBoxes extends Base{
	
	@BeforeMethod

	public void beforeMethod() {
		Base.initializeDriver();
		driver.get("http://localhost:7080/checkboxes");
	}

}
