package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoRegistraionPage extends DemoBasePage {

	
	public DemoRegistraionPage(WebDriver driver) {
		
		super(driver);
		
	}
	@FindBy(xpath="//input[@name='firstName']")
	WebElement txt_firstname;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement txt_lastname;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement txt_phonenumber;
	
	@FindBy(xpath="//input[@id='userName']")
	WebElement txt_email;
	
	@FindBy(xpath="//input[@name='address1']")
	WebElement txt_address;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement txt_city;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement txtstate;
	
	@FindBy(xpath="//input[@name='postalCode']")
	WebElement txt_postalcode;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement btn_country;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@name='confirmPassword']")
	WebElement txtconfirmpassword;
	
	
	@FindBy(xpath="//input[@name='submit']")
	WebElement btn_submit;
	
	@FindBy(xpath="//font[contains(text(),'Thank you for registering.')]")
	WebElement msgconfirmation;
	
	public void setFirstname(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	
	public void setLastname(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	
	public void setPhoneNumber(String phno)
	{
		txt_phonenumber.sendKeys(phno);
	}
	
	public void setEmail(String email)
	{
		txt_email.sendKeys(email);
	}
	

	public void setAddress(String address)
	{
		txt_address.sendKeys(address);
	}
	
	public void setCity(String city)
	{
		txt_city.sendKeys(city);
	}
	public void setState(String state)
	{
		txtstate.sendKeys(state);
	}
	
	
	public void setPostalCode(String pcode)
	{
		txt_postalcode.sendKeys(pcode);
	}
	
	public void setCountry(String country)
	{
		btn_country.sendKeys(country);
	}
	
	public void setUsername(String uname)
	{
		txt_username.sendKeys(uname);
	}
	
	public void setPassword(String pwd)
	{
		txtpassword.sendKeys(pwd);
	}
	
	public void setConfirmPassword(String pwd)
	{
		txtconfirmpassword.sendKeys(pwd);
	}
	
	public void clickonSubmit()
	{
		btn_submit.click();
	}
	
	public String getConfirmationmsg()
	
	{
		try {
		String cnfrmtnmsg=msgconfirmation.getText();
		return cnfrmtnmsg;
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}
	
	
	
	
	
	
	
}
