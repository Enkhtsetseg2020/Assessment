package utilities;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import core.Base;

public class DriverUtility extends Base {

	public static void clickonElement(WebElement ele) {
		ele.click();
	}

	public static void enterText(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void verifyElementIsDisplayed(WebElement ele) {

		Assert.assertTrue(isElementDisplayed(ele));

	}

	public static boolean isElementDisplayed(WebElement ele) {
		if (ele.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}

//	public static void selectByVisibleText(WebElement ele, String text) {
//
//		Select select = new Select(ele);
//		select.selectByVisibleText(text);
//
//	}
//
//	public static void SelectByValue(WebElement ele, String value) {
//		Select select = new Select(ele);
//		select.selectByValue(value);
//
//	}
//
//	public static void SelectByIndex(WebElement ele, int index) {
//		Select select = new Select(ele);
//		select.selectByIndex(index);
//
//	}
//
//	public static void acceptAlert() {
//		driver.switchTo().alert().accept();
//	}
//
//	public static void waitforAlert() {
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.alertIsPresent());
//	}
//
//	public static void wait(int milliSeconds) {
//		try {
//			Thread.sleep(milliSeconds);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	public static boolean isElementEnabled(WebElement ele) {
//		if (ele.isEnabled()) {
//			return true;
//		} else {
//			return false;
//		}
//	}
//
//	public static void moveToElementAction(WebElement ele) {
//		Actions action = new Actions(driver);
//		action.moveToElement(ele).build().perform();
//
//	}
//
//	public static void scrollToElementAction(WebElement ele) {
//
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
//
//	}
//
//	public static void switchToWindow() {
//
//		Set<String> WindowsHandles = driver.getWindowHandles();
//		Iterator<String> it = WindowsHandles.iterator();
//
//		String window = it.next();
//		driver.switchTo().window(window);
//
//	}
//
//	public static void clearTextUsingSendKeys(WebElement ele) {
//		ele.sendKeys(Keys.CONTROL + "a");
//		ele.sendKeys(Keys.DELETE);
//
//	}
//
//	public static void clearText(WebElement ele) {
//		ele.clear();
//
//	}
//
//	public static void scrollPageDownWithJS() {
//
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//
//	}
//
//	// click on element using JSExeutor
//
//	public static void clickElementWithJS(WebElement element) {
//
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].click();", element);
//
//	}
//
//	// sendKeys using JSExecutor
//	// we can use SendKeys with JSExecutor if WebElement has either one of ID, Name,
//	// or Class attributes
//
//	public static void sendKeysWithJS(String element, String value) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("document.getElementById('" + element + "').value='" + value + "'");
//
//	}
//
//	// how to select calendar date using JS Executor
//
//	public static void selectCalendarDateWithJS(String date, WebElement element) {
//		JavascriptExecutor js = ((JavascriptExecutor) driver);
//		js.executeScript("arguments[0].setAttribute('value','" + date + "');", element);
//
//	}
//
//	public static String getText(WebElement ele) {
//		String ElementText = ele.getText();
//		return ElementText;
//	}
//
//	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
//		Actions action = new Actions(driver);
//		action.dragAndDrop(sourceElement, targetElement);
//
//	}

	
	

}
