package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class MainPageTest extends AbstractPageTest {

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {MainPageTest.driver = driver;}

	  @Test
	  public void MainTest() {
			MainPage mainpage = new MainPage(getDriver());
			mainpage
				.clickinput()
				.create_entry()
				.clickopening_news_in_LJ_section_recommends()
				.clickSearch_blogs_and_articles()
				.clickOpening_post_in_Post_Rating_section()
				.clickopening_section_new_faces()
				.clickOpening_Media_section_in_LiveJournal()
				.clickJoining_the_authors_LiveJournal()
				.clickOpening_the_Travel_section();
			Assertions.assertEquals("3",getDriver().getCurrentUrl());
	  }
}