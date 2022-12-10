package org.example.lesson7.dz7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_blogs_and_article extends AbstractPage {

	  public static Search_blogs_and_article search_blogs_and_article;

	  public WebDriver driver;

	  public Search_blogs_and_article(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[4]/div/div/form/div/input")
	  private WebElement Entering_search_query;

	  @FindBy(xpath = "//div[@class=\"search__control-wrap\"]/button")
	  private WebElement Click_on_search;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement Return_to_mainPage;

	  public Search_blogs_and_article Entering_search_query() {
			Entering_search_query.sendKeys("Ремейк от Дисней - узаконенное зло, или ответ на запрос?");
			return this;
	  }

	  public Search_blogs_and_article Click_on_search() {
			Click_on_search.click();
			return this;
	  }

	  public Search_blogs_and_article Return_to_mainPage() {
			Return_to_mainPage.click();
			return this;
	  }
}
