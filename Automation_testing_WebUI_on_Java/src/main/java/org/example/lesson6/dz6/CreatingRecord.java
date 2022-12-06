package org.example.lesson6.dz6;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingRecord extends AbstractPage {

	  public WebDriver driver;

	  public CreatingRecord(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = " //nav[@role=\"presentation\"]/ul/li[4]/a")
	  private static WebElement click_on_create_post;

	  @FindBy(xpath = "//div[@class=\"root-0-2-135\"]/div[2]/textarea")
	  private WebElement creating_post_title;

	  @FindBy(xpath = "//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"]")
	  private WebElement creating_post_text;

	  @FindBy(xpath = "//div[@class=\"tags-0-2-140 alignment-0-2-136\"]/div/span/span/input")
	  private static WebElement creating_post_tag;

	  @FindBy(xpath = "/html/body/div[6]/footer/div/div/div[2]/div[2]/button")
	  private WebElement Click_to_setup_and_publish;

	  @FindBy(xpath = "//span[text() = 'Опубликовать']")
	  private WebElement click_on_publish;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement return_to_mainPage;


	  public CreatingRecord click_on_create_post() {
			click_on_create_post.click();
			return this;
	  }

	  public CreatingRecord click_creating_post_title() {
			creating_post_title.sendKeys("Мой заголовок", Keys.TAB);
			return null;
	  }

	  public CreatingRecord click_creating_post_text() {
			creating_post_text.sendKeys("Мой текст", Keys.TAB);
			return this;
	  }

	  public CreatingRecord click_creating_post_tag() {
			creating_post_tag.sendKeys("TEST", Keys.TAB);
			return this;
	  }

	  public CreatingRecord click_Click_to_setup_and_publish() {
			Click_to_setup_and_publish.click();
			return this;
	  }

	  public CreatingRecord click_click_on_publish() {
			click_on_publish.click();
			return this;
	  }

	  public CreatingRecord click_return_to_main_page() {
			return_to_mainPage.click();
			return this;
	  }
}