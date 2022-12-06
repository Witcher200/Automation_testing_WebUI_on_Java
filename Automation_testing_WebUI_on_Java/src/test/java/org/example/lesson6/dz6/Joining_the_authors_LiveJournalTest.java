package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class Joining_the_authors_LiveJournalTest extends AbstractPageTest{

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {Joining_the_authors_LiveJournalTest.driver=driver;}

	  @Test
	  public void Joining_authors_LiveJournalTest() {
			Joining_the_authors_LiveJournal join_the_authors = new Joining_the_authors_LiveJournal(getDriver());
			join_the_authors
				.open_section_it_was_autumn()
				.click_to_join_btn()
				.return_to_main_page();
			Assertions.assertEquals("18", getDriver().getCurrentUrl());
	  }
}