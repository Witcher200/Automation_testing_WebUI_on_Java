package org.example.lesson6.dz6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_Media_section_in_LJ extends AbstractPage{

	  public WebDriver driver;
	  public Open_Media_section_in_LJ(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//html/body/div[2]/div[3]/div/div/div/div/ul/li[2]/a")
	  private WebElement click_on_Media_section_LJ;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[3]/div/section/div/div[2]/div[16]/div/div/div/article/a")
	  private WebElement click_on_media;

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/header/div[1]/dl/dd/div/div/div/a")
	  private WebElement click_on_subscribe;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement Return_to_mainPage;

	  public Open_Media_section_in_LJ click_on_Media_section_LJ(){
			click_on_Media_section_LJ.click();
			return this;
	  }

	  public Open_Media_section_in_LJ click_on_media(){
			click_on_media.click();
			return this;
	  }

	  public Open_Media_section_in_LJ click_on_subscribe(){
			click_on_subscribe.click();
			return this;
	  }

	  public Open_Media_section_in_LJ Return_to_mainPage(){
			Return_to_mainPage.click();
			return this;
	  }
}
