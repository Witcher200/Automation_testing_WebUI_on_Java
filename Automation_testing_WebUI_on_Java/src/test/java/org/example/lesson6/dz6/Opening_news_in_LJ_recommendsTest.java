package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Opening_news_in_LJ_recommendsTest extends AbstractPageTest {

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {
			Opening_news_in_LJ_recommendsTest.driver = driver;
	  }

	  @Test
	  public void Opening_entry_in_Ranking_of_entriesTes() {
			Opening_news_in_LJ_recommends opening_news_in_lj_recommends = new Opening_news_in_LJ_recommends(getDriver());
			opening_news_in_lj_recommends
				.Click_on_new()
				.Click_on_subscribe()
				.Return_to_main_page();
			Assertions.assertEquals("16", getDriver().getCurrentUrl());
	  }
}