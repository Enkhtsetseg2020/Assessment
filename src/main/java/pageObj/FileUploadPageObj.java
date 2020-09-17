package pageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class FileUploadPageObj extends Base{
	
	public FileUploadPageObj() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "file-upload")
	private WebElement ChooseFile;
	
	@FindBy(how = How.ID, using = "file-submit")
	private WebElement FileUpload;
	
	
    String filePath= "/Users/enkhtsetseg/Desktop/Emma Test Automation.docx"; 
    
    
    //upload the file
    
    
    
}
