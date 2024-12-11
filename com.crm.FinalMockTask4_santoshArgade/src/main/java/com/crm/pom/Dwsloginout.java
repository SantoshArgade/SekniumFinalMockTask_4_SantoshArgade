package com.crm.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dwsloginout {
	
	 public Dwsloginout (WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(className = "ico-login")
		 private WebElement login;
		
		@FindBy(id = "Email")
		 private WebElement email;
		
		@FindBy(id = "Password")
		 private WebElement password;
		
		@FindBy(css = "input[value='Log in']")
		 private WebElement login_btn;
		
		@FindBy(className = "ico-logout")
		private WebElement logout_btn;
		
		
		public void signin(String email1 , String pass)
		{
			login.click();
			email.sendKeys(email1);
			password.sendKeys(pass);
			login_btn.click();
			
		}
		public void signout()
		{
			logout_btn.click();
		}
		
		@FindBy(linkText = "Twitter")
		private WebElement twitter;
		
		@FindBy(xpath = "//span[text()='Create account']")
		private WebElement createAcc;
		
		@FindBy(xpath = "//input[@name='name']")
		private WebElement name;
		
		@FindBy(xpath = "//input[@name='email']")
		private WebElement twitemail;
    
		@FindBy(id = "SELECTOR_1")
		private WebElement month;
		
		@FindBy(id = "SELECTOR_2")
		private WebElement day;
		
		@FindBy(id = "SELECTOR_3")
		private WebElement year;
		
		@FindBy(xpath = "//span[text()='Next']")
		private WebElement next;
		
		public void twitter()
		{
			twitter.click();;
		}
		public void createAccount()
		{
			createAcc.click();
		}
		public void name(String data)
		{
			name.sendKeys(data);
		}
		public void mail(String data)
		{
			twitemail.sendKeys(data);
		}
		public void dateOfBirth()
		{
			Select sel1=new Select(month);
			sel1.selectByIndex(5);
			
			Select sel2=new Select(day);
			sel2.selectByValue("4");
			
			Select sel3=new Select(year);
			sel3.selectByValue("2002");
			
		}
		public void next()
		{
			next.click();
		}
}
