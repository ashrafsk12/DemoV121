package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddingBankPage extends DemoBasePage {

	public AddingBankPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@name='uid']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement btn_login;
	
	@FindBy(xpath="//h2[normalize-space()='Gtpl Bank']")
	WebElement link_header;
	
	public void setUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void setPassword(String pwd)
	{
		txt_password.sendKeys(pwd);
	}
	
	public void clickonLogin()
	{
		btn_login.click();
	}
	
	public String headerisDisplayed()
	{
		try {
		return(link_header.getText());
		}
		catch(Exception e)
		{
			return (e.getMessage());
		}
	}

}
