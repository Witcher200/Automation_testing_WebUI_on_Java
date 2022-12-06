package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Search_blogs_and_articleTest extends AbstractPage {

	  public static WebDriver driver;

	  public Search_blogs_and_articleTest(WebDriver driver) {
			super(driver);
	  }

	  public static void setDriver(WebDriver driver) {
			Search_blogs_and_articleTest.driver = driver;
	  }

	  @Test
	  public void Search_blogs_article() {
			Search_blogs_and_article blogs_and_article = new Search_blogs_and_article(getDriver());
			blogs_and_article
				.Entering_search_query()
				.Click_on_search()
				.Return_to_mainPage();
			Assertions.assertEquals("18",getDriver().getCurrentUrl());
	  }

}