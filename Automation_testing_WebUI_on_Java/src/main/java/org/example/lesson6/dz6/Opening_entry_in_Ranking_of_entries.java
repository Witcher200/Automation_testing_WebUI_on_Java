package org.example.lesson6.dz6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opening_entry_in_Ranking_of_entries extends AbstractPage {

	  public WebDriver driver;

	  public Opening_entry_in_Ranking_of_entries(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/section[1]/div/div/div[1]/div[1]/div/div/article/a")
	  private WebElement Click_on_entry;

	  @FindBy(xpath = "//*[@id=\"js\"]/body/div[3]/div[4]/div[1]/article/section[1]/div[1]/div[1]/header/div[3]/div/div[1]/div/a")
	  private WebElement Click_on_subscribe;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement Return_to_mainPage;

	  public Opening_entry_in_Ranking_of_entries Click_on_entry() {
			Click_on_entry.click();
			return this;
	  }

	 public void Click_on_subscribe() {
			Click_on_subscribe.click();
	 }

	  public Opening_entry_in_Ranking_of_entries Return_to_mainPage() {
			Return_to_mainPage.click();
			return this;
	  }
}
