package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoHomePage extends DemoBasePage {
	
	public DemoHomePage(WebDriver driver)
	{
		super(driver);
	}

	@FindBy(xpath="//a[normalize-space()='New Tours']")
	WebElement newtours;
	
	@FindBy(xpath="//a[normalize-space()='Bank Project']")
	WebElement bank_Project;
	
	public void clickonNewTours()
	{
		newtours.click();
	}
	
	public void clickonBankProject()
	{
		bank_Project.click();;
	}
}
