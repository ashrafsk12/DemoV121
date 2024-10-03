package demotestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class DemoBaseClass {
	
	public WebDriver driver;
	public Properties p;
	public Logger loger;

	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException
	{
		FileReader file=new FileReader("./src//test//resources//config.properties");
		
		p=new Properties();
		
		p.load(file);
		
		loger=LogManager.getLogger(this.getClass());
		
		//browser
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		
		default:System.out.println("Invalid Browser");return;
		}
		
		driver.get(p.getProperty("appURL"));
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();	
	}

	@AfterClass
	public void tearDown() 
	{
		
		driver.close();
	}
	
	public String randomeString()
	{
		@SuppressWarnings("deprecation")
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
		
	}
	
	public String randomeNumer()
	{
		@SuppressWarnings("deprecation")
		String generatednumber=RandomStringUtils.randomNumeric(10);
		return generatednumber;
		
	}
	
	public String randomeAlphNumeric()
	{
		@SuppressWarnings("deprecation")
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		@SuppressWarnings("deprecation")
		String generatednumber=RandomStringUtils.randomNumeric(3);
		
		return(generatedstring+"*&^%"+generatednumber);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date()); //screenshot also we should capture with time timestamp

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;//TakesScreenshot is interface and we have assigned the driver to the screenshot 

		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);

		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		
		/*copy the source  file to Target file so here we have to copy sourcefile in the project location in the 
		screenshot folder and with the time stamp, so Tname ,underscore the time stamp + .png because it is screenshot we have to save in png format 
		*/
		
		File targetFile=new File(targetFilePath);

		sourceFile.renameTo(targetFile);   //copy the source file to Target file by using these command

		return targetFilePath;

	}
	
}
