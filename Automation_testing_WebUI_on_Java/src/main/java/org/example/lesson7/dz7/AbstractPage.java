package org.example.lesson7.dz7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AbstractPage {

private final WebDriver driver;

	  public AbstractPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
	  }

	  protected WebDriver getDriver() {
		return this.driver;
	}
}
