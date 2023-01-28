package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

@FindBy(xpath="//a[.='Logout']") private WebElement LogOutLink;
@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
@FindBy(xpath="//div[.='Users']") private WebElement users;
@FindBy(name="usersSelector.selectedUser") private WebElement enterTimeTrackDropdown;

// intialization

public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

// utilization

public WebElement getLogOutLink() {
	return LogOutLink;
}

public WebElement getSaveLeaveTimeButton() {
	return saveLeaveTimeButton;
}

public WebElement getUsers() {
	return users;
}

public WebElement getEnterTimeTrackDropdown() {
	return enterTimeTrackDropdown;
}

// Operational Method
public void LogOut()
{
	LogOutLink.click();
}

public void clickOnuser()
{
	users.click();
}

public void ClickOnSaveLeaveTime()
{
	saveLeaveTimeButton.click();
}

public void selectuser(int index)
{
	Select sel = new Select(enterTimeTrackDropdown);
	sel.selectByIndex(index);
}

}
