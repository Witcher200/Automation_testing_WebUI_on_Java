package org.example.lesson6.dz6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Joining_the_authors_LiveJournal extends AbstractPage{

	  public WebDriver driver;

	  public Joining_the_authors_LiveJournal(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li[3]/a")
	  private WebElement open_section_it_was_autumn;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div/div[3]/div/a")
	  private WebElement click_to_join_btn;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement return_to_main_page;

	  public Joining_the_authors_LiveJournal open_section_it_was_autumn() {
			open_section_it_was_autumn.click();
			return this;
	  }

	  public Joining_the_authors_LiveJournal click_to_join_btn() {
			click_to_join_btn.click();
			return this;
	  }

	  public Joining_the_authors_LiveJournal return_to_main_page() {
			return_to_main_page.click();
			return this;
	  }
}
