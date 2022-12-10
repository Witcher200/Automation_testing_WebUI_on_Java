package org.example.lesson7.dz7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_section_Travel extends AbstractPage {

	  public static WebDriver driver;

	  public Open_section_Travel(WebDriver driver) {
			super(driver);
			PageFactory.initElements(driver, this);
			this.driver = driver;
	  }

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[3]/a")
	  private WebElement Go_to_Travel_page;

	  /***В этом же разделе, находятся подразделы***/

	  /***Opening of subsection Architecture***/

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[3]/div/nav/a[1]")
	  private WebElement Go_to_the_Architecture_page;


	  /***Opening of the IT sub subsection***/

	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[3]/div/nav/a[1]")
	  private WebElement Go_to_IT_page;


	  /***Opening sub subsection Computers***/
	  @FindBy(xpath = "//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[3]/div/nav/a[4]")
	  private WebElement Go_to_computers_page;

	  @FindBy(xpath = "//div[@class=\"s-logo\"]/a/span")
	  private WebElement Return_to_mainPage;

	  public Open_section_Travel Go_to_Travel_page() {
			Go_to_Travel_page.click();
			return this;
	  }

	  public Open_section_Travel Go_to_the_Architecture_page() {
			Go_to_the_Architecture_page.click();
			return this;
	  }

	  public Open_section_Travel Go_to_IT_page() {
			Go_to_IT_page.click();
			return this;
	  }

	  public Open_section_Travel Go_to_computers_page() {
			Go_to_computers_page.click();
			return this;
	  }

	  public Open_section_Travel Return_to_mainPage() {
			Return_to_mainPage.click();
			return this;
	  }
}
