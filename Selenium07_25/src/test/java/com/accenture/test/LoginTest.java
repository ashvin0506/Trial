package com.accenture.test;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class LoginTest {
  @Test
  public void f() {
	  System.out.println("This is executed");
	  Assert.assertEquals("Ashvin", "Ash","Failed");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("done.");
  }

}
