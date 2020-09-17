package tests;

import org.testng.annotations.BeforeMethod;

import core.Base;
import pageObj.FileUploadPageObj;

public class FileUploadTest extends Base{
FileUploadPageObj FileUploadObj; 
	
	@BeforeMethod

	public void beforeMethod() {
		Base.initializeDriver();
		driver.get("http://localhost:7080/upload");
	}

}
