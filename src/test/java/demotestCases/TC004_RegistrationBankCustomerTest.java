package demotestCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import demopageObjects.AddingBankPage;
import demopageObjects.DemoHomePage;
import demopageObjects.GtplPage;
import demopageObjects.Registraion_ForNewCustomerPage;
import demotestBase.DemoBaseClass;

public class TC004_RegistrationBankCustomerTest extends DemoBaseClass {
	@Test
	public void NewCustomerRegistration() 
	{
		try {
		loger.info("****Started TCC004_RegistrationBankCustomerTest****");
		loger.info("Open Demo99 URL");
		DemoHomePage dhp=new DemoHomePage(driver);
		loger.info("Clicking on BankProject");
		dhp.clickonBankProject();
		
		AddingBankPage abp=new AddingBankPage(driver);
		loger.info("Providing Login Credentials");
		abp.setUsername(p.getProperty("username1"));
		
		abp.setPassword(p.getProperty("password1"));
		
		abp.clickonLogin();
		
		GtplPage gp=new GtplPage(driver);
		gp.clickNewCustomer();
		
		Registraion_ForNewCustomerPage rnc=new Registraion_ForNewCustomerPage(driver);
		
		rnc.setCustomerName(randomeString().toUpperCase());
		rnc.setCustomerGender(p.getProperty("cgender"));
		rnc.setCustomerDOB(p.getProperty("cdd"), p.getProperty("cmm"), p.getProperty("cyyyy"));
		
		rnc.setCustomerAddress(p.getProperty("caddress"));
		rnc.setCustomerCity(p.getProperty("ccity"));
		rnc.setCustomerState(p.getProperty("state"));
		rnc.setCustomerPinNumber(p.getProperty("pinno"));
		rnc.setCustomerTelephoneNumber(randomeNumer());
		rnc.setCustomerEmailId(randomeString()+"@gmail.com");
		rnc.clickonSubmit();
		
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		
	}

}
