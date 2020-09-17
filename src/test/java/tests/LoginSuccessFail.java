package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.Base;
import pageObj.LoginPageObj;

public class LoginSuccessFail extends Base {
	LoginPageObj LogSuccessPageObj;

	@BeforeMethod

	public void beforeMethod() {
		Base.initializeDriver();
		driver.get("http://localhost:7080/login");
	}

	@Test
	public void loginWithSuccess() {
		LogSuccessPageObj = new LoginPageObj();
		LogSuccessPageObj.enterUserName(getUserName());
		LogSuccessPageObj.enterPassword(getPassword());
		LogSuccessPageObj.clickonLoginButton();
	}
	
	@Test
	public void loginWithFail() {
		LogSuccessPageObj = new LoginPageObj();
		
	}

	@AfterMethod

	public void aftermethod() {

	}
}
