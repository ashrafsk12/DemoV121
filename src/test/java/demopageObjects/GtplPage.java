package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GtplPage extends DemoBasePage {
	
	public GtplPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='New Customer']")
	WebElement link_NewCustomer;
	
	public void clickNewCustomer()
	{
		link_NewCustomer.click();
	}
	

}
