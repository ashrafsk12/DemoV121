package demopageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registraion_ForNewCustomerPage extends DemoHomePage {
	
	public Registraion_ForNewCustomerPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@name='name']")
	WebElement txt_Customername;
	
	@FindBy(xpath="//tbody/tr[5]/td[2]/input[1]")
	WebElement rbtn_CGender;
	
	@FindBy(xpath="//input[@id='dob']")
	WebElement txt_Cdob;
	
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement txt_cAddress;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement txt_Ccity;
	
	@FindBy(xpath="//input[@name='state']")
	WebElement txt_Cstate;
	
	@FindBy(xpath="//input[@name='pinno']")
	WebElement txt_Cpinno;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement txt_Ctelephoneno;
	
	@FindBy(xpath="//input[@name='emailid']")
	WebElement txt_cemailid;
	
	@FindBy(xpath="//input[@name='sub']")
	WebElement btn_submit;
	
	public void setCustomerName(String cname)
	{
		txt_Customername.sendKeys(cname);
	}
	
	public void setCustomerGender(String cgender)
	{
		rbtn_CGender.sendKeys(cgender);
	}
	
	public void setCustomerDOB(String dd,String mm,String yyyy)
	{
		txt_Cdob.sendKeys(dd);
		txt_Cdob.sendKeys(mm);
		txt_Cdob.sendKeys(yyyy);
	}
	
	public void setCustomerAddress(String caddress)
	{
		txt_cAddress.sendKeys(caddress);
	}
	
	public void setCustomerCity(String ccity)
	{
		txt_Ccity.sendKeys(ccity);
	}
	
	public void setCustomerState(String cstate)
	{
		txt_Cstate.sendKeys(cstate);
	}
	
	public void setCustomerPinNumber(String cpinno)
	{
		txt_Cpinno.sendKeys(cpinno);
	}
	
	public void setCustomerTelephoneNumber(String ctelno)
	{
		txt_Ctelephoneno.sendKeys(ctelno);
	}
	
	public void setCustomerEmailId(String cemailid)
	{
		txt_cemailid.sendKeys(cemailid);
	}
	
	public void clickonSubmit()
	{
		btn_submit.click();
	}
	
	
	
	
	
	
}
