package org.example.lesson7.dz7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opening_news_in_LJ_recommends extends AbstractPage {

	  public WebDriver driver;

	  public Opening_news_in_LJ_recommends(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//div[@class=\"lj-card\"]/article/a")
	  private WebElement Click_on_new;

	  @FindBy(xpath = "//div[@class=\"j-user-subscribe-btn\"]/a")
	  private WebElement Click_on_subscribe;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement Return_to_mainPage;

	  public Opening_news_in_LJ_recommends Click_on_new() {
			Click_on_new.click();
			return this;
	  }

	  public Opening_news_in_LJ_recommends Click_on_subscribe() {
			Click_on_subscribe.click();
			return this;
	  }

	  public void Return_to_main_page() {
			Return_to_mainPage.click();
	  }
}
