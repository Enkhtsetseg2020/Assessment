package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.Base;
import pageObj.DragDropPageObj;

public class DragDrop extends Base{

	DragDropPageObj DragAndDropObj; 
	
	@BeforeMethod

	public void beforeMethod() {
		Base.initializeDriver();
		driver.get("http://localhost:7080/drag_and_drop");
	}

	@Test 
	
	public void DragAndDrop() {
		
		
	}
	
	
	
	
	
}
