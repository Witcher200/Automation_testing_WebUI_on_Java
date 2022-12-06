package org.example.lesson6.dz6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

	  public WebDriver driver;
	  public MainPage(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//nav[@class=\"s-nav-actions\"]/ul/li[2]/a[1]")
	  private WebElement clickinput;

	  @FindBy(xpath = "//nav[@role=\"presentation\"]/ul/li[4]/a")
	  private WebElement create_entry;

	  @FindBy(xpath = "//div[@class=\"lj-card\"]/article/a")
	  private WebElement opening_news_in_LJ_section_recommends;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[4]/div/div/form/div/input")
	  private WebElement Search_blogs_and_articles;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[2]/div/div/div[1]/div[1]/div/div/article/a")
	  private WebElement Opening_post_in_Post_Rating_section;

	  @FindBy(xpath = "//html[@id=\"j s\"]/body/div[2]/div[3]/div/div/div/div/ul/li/a")
	  private WebElement opening_section_new_faces;

	  @FindBy(xpath = "//html/body/div[2]/div[3]/div/div/div/div/ul/li[2]/a")
	  private WebElement Opening_Media_section_in_LiveJournal;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li[3]/a")
	  private WebElement Joining_the_authors_LiveJournal;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li[4]/a")
	  private WebElement Opening_the_Travel_section;

	  public MainPage clickinput() {
			clickinput.click();
			return this;
	  }

	  public MainPage create_entry() {
			create_entry.click();
			return this;
	  }

	  public MainPage clickopening_news_in_LJ_section_recommends() {
			opening_news_in_LJ_section_recommends.click();
			return this;
	  }

	  public MainPage clickSearch_blogs_and_articles() {
			Search_blogs_and_articles.click();
			return this;
	  }

	  public MainPage clickOpening_post_in_Post_Rating_section() {
			Opening_post_in_Post_Rating_section.click();
			return this;
	  }

	  public MainPage clickopening_section_new_faces() {
			opening_section_new_faces.click();
			return this;
	  }

	  public MainPage clickOpening_Media_section_in_LiveJournal() {
			Opening_Media_section_in_LiveJournal.click();
			return this;
	  }

	  public MainPage clickJoining_the_authors_LiveJournal() {
			Joining_the_authors_LiveJournal.click();
			return this;
	  }

	  public MainPage clickOpening_the_Travel_section() {
			Opening_the_Travel_section.click();
			return this;
	  }
}



