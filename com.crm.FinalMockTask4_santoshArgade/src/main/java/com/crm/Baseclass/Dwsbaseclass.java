package com.crm.Baseclass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.crm.pom.Dwsloginout;
import com.crm.utility.Readproperties;


public class Dwsbaseclass {
	public static WebDriver driver;
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("From beforeSuite");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("from beforetest");
	}
	
	@BeforeClass
	public void precondition() throws IOException
	{
		String browser = Readproperties.property("browser");
		String url = Readproperties.property("url");
		String user = Readproperties.property("user");
		String password = Readproperties.property("password");
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver  = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else {
			  driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws InterruptedException, IOException
	{
		String expec_url = "https://demowebshop.tricentis.com/";
		String actual_url = driver.getCurrentUrl();
		if(expec_url.equals(actual_url))
		{
		Dwsloginout vt= new Dwsloginout(driver);
		vt.signin("pnu@gmail.com" , "pnu123");
		}
		
	}
	@AfterMethod
	public void logout()
	{
		Dwsloginout vt= new Dwsloginout(driver);
		vt.signout();
	}
	@AfterClass
	public void postCondition()
	{
		driver.quit();
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("from aftertest");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite()
	{
		System.out.println("From afterSuite");
	}
}
