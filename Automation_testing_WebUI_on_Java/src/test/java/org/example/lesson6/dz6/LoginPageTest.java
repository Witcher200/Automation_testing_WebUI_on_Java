package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class LoginPageTest extends AbstractPageTest {

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {
			LoginPageTest.driver = driver;
	  }

	  @Test
	  public void LoginTest() {
			LoginPage loginpage = new LoginPage(getDriver());
			loginpage
				.Click_on_Login_button()
				.Click_name_input()
				.Click_password_input()
				.Click_input();
			Assertions.assertEquals("1", getDriver().getCurrentUrl());
	  }
}