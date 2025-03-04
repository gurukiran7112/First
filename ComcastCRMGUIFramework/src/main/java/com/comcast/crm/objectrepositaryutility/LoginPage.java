package com.comcast.crm.objectrepositaryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
/**
 * 
 * @author Siddesh
 * 
 * Contains Login page elements & business lib like login()
 */
public class LoginPage extends WebDriverUtility{                                              // Rule 1 : create a separate java class
							                                                        // Rule 2 : Object creation using @Findby annotation

	
	WebDriver driver;                                                                       // this is global variable
	public LoginPage(WebDriver driver) {                       	                                      // Rule 3: Object Initialization
		this.driver = driver;
		PageFactory.initElements(driver, this);                           //initElements method it will go and execute all the @ annotations and it will do lazy initialization
	}

	@FindBy(name = "user_name")
	private WebElement usernameEdit;

	@FindBy(name = "user_password")
	private WebElement passwordEdit;

	@FindBy(id = "submitButton")
	private WebElement loginBtn;

	// Rule 4 : Object encapsulation

	public WebElement getUsernameEdit() {
		return usernameEdit;
	}

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 *  login to application based on user name , password , url , arguments
	 * @param username
	 * @param password
	 */
	public void loginToApp(String username, String password) {
	
		usernameEdit.sendKeys(username);
		passwordEdit.sendKeys(password);
		loginBtn.click();
	}

}
