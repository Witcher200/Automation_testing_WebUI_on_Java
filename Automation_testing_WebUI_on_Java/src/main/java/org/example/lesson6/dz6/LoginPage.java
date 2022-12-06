package org.example.lesson6.dz6;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

	  public WebDriver driver;
	  public LoginPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//nav[@class=\"s-nav-actions\"]/ul/li[2]/a[1]")
	  private WebElement Click_on_the_Login_button;

	  @FindBy(xpath = "//input[@id=\"user\"]")
	  private WebElement name_input;

	  @FindBy(xpath = "//input[@id=\"lj_loginwidget_password\"]")
	  private WebElement password_input;

	  @FindBy(xpath = "//button[@class=\"b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center\"]")
	  private WebElement Click_input;

	  public LoginPage Click_on_Login_button() {
			Click_on_the_Login_button.click();
			return this;
	  }

	  public LoginPage Click_name_input() {
			name_input.sendKeys("igor_t_2022", Keys.TAB);
	  		return this;
	  }

	  public LoginPage Click_password_input() {
			password_input.sendKeys("U,N8v`]7=#wTb{e", Keys.TAB);
			return this;
	  }

	  public LoginPage Click_input() {
			Click_input.submit();
			return this;
	  }





}
