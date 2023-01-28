package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="username") private WebElement UsernameTB;
@FindBy(name="pwd") private WebElement PasswordTB;
@FindBy(id="loginButton") private WebElement LoginButton;
@FindBy(id="keepLoggedInCheckBox") private WebElement LoggedInCheckBox;
@FindBy(xpath="//a[.='Actimind Inc.']") private WebElement ActiMindLink;
@FindBy(id="licenseLink") private WebElement LicenseLink;

public LoginPage(WebDriver driver)
  {
	PageFactory.initElements(driver,this);
}


// Operational MethodS
public WebElement getUsernameTB() {
	return UsernameTB;
}
public WebElement getPasswordTB() {
	return PasswordTB;
}
public WebElement getLoginButton() {
	return LoginButton;
}



public void actiTimeValidLogin (String validusername,String validpassword) throws InterruptedException {
	UsernameTB.sendKeys(validusername);
	Thread.sleep(2000);
	PasswordTB.sendKeys(validpassword);
	Thread.sleep(2000);
	LoginButton.click();
}


public void actiTimeInvalidLogin (String invalidusername,String invalidpassword) throws InterruptedException {
	UsernameTB.sendKeys(invalidusername);
	Thread.sleep(2000);
	PasswordTB.sendKeys(invalidpassword);
	Thread.sleep(2000);
	LoginButton.click();
	Thread.sleep(2000);
	UsernameTB.clear();
}

}
