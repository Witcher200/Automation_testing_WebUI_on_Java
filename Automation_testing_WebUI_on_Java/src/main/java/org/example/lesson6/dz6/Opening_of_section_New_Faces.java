package org.example.lesson6.dz6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opening_of_section_New_Faces extends AbstractPage {

	  public static Opening_of_section_New_Faces opening_new_faces;

	  public WebDriver driver;

	  public Opening_of_section_New_Faces(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//html[@id=\"j s\"]/body/div[2]/div[3]/div/div/div/div/ul/li/a")
	  private WebElement Click_to_section_NewFaces;

	  @FindBy(xpath = " //*[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[1]/div/div[2]/div[16]/div/div/div/article/a")
	  private WebElement Click_on_news;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[2]/div/figure[2]/div/div/div/form/div/textarea")
	  private WebElement Writing_comments_on_a_post;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[2]/div/figure[2]/div/div/div/form/button")
	  private WebElement Click_to_btn_add;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement Return_to_mainPage;

	  public Opening_of_section_New_Faces Click_to_section_NewFaces() {
			Click_to_section_NewFaces.click();
			return this;
	  }

	  public Opening_of_section_New_Faces Click_on_news() {
			Click_on_news.click();
			return this;
	  }

	  public Opening_of_section_New_Faces Writing_comments_on_a_post() {
			Writing_comments_on_a_post.click();
			return this;
	  }

	  public Opening_of_section_New_Faces Click_to_btn_add() {
			Click_to_btn_add.click();
			return this;
	  }

	  public Opening_of_section_New_Faces Return_to_mainPage() {
			Return_to_mainPage.click();
			return this;
	  }
}
