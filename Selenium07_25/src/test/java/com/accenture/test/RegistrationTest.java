package com.accenture.test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.accenture.pages.HomePage;
import com.accenture.pages.Registration;
import com.accenture.utilities.ExcelUtilities;

public class RegistrationTest {
	WebDriver d;
	HomePage h;
	Registration r;
	ExcelUtilities e;
	
  @Test
  public void f() throws IOException {
	  h.clickRegistration();
	  e.getTestData();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","C:\\VANDANA\\chromedriver.exe");
	  d = new ChromeDriver();
	  d.manage().window().maximize();
	  d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  d.get("http://demowebshop.tricentis.com/");
	  h = PageFactory.initElements(d, HomePage.class);
	  r=PageFactory.initElements(d, Registration.class);
	  e = new ExcelUtilities();
	  
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(5000);
	  d.close();
  }
}