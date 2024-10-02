package demotestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import demopageObjects.DemoHomePage;
import demopageObjects.DemoLoginPage;
import demopageObjects.DemoMyAccount;
import demopageObjects.DemoToursPage;
import demotestBase.DemoBaseClass;

public class TC002_LoginTest extends DemoBaseClass {
	
	@Test
	public void verifyLogin()
	{
		try {
		loger.info("****Starting TC002_LoginTest****");
		loger.info("Opening HomePage");
		DemoHomePage dhp=new DemoHomePage(driver);
		
		dhp.clickonNewTours();
		loger.info("clicking on New Tours");
		DemoToursPage dtp=new DemoToursPage(driver);
		dtp.clickonSign_in();
		loger.info("clicking on SignOn");
		DemoLoginPage dlp=new DemoLoginPage(driver);
		
		loger.info("Providing login Credentials");
		
		dlp.enterUserName(p.getProperty("username"));
		dlp.enterPassword(p.getProperty("password"));
		dlp.clickOnSubmit();
		loger.info("Account login is Successful");
		DemoMyAccount dma= new DemoMyAccount(driver);
		boolean targetpage=dma.isMyAccountExist();
		loger.info("Validating login is Successful or Page is exist or not");
		loger.info("Page is exist");
		Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			loger.info("Page Doesnt Exist");
			Assert.fail();
		}
		loger.info("****Finished TC002_LoginTest****");
	}

}
