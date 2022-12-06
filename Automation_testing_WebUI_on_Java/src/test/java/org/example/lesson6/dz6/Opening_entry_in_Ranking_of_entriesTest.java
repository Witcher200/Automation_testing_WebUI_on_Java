package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Opening_entry_in_Ranking_of_entriesTest extends AbstractPageTest {

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {Opening_entry_in_Ranking_of_entriesTest.driver = driver;}

	  @Test
	  public void Opening_entry_Ranking_of_entriesTes() {
			Opening_entry_in_Ranking_of_entries opening_entry_in_ranking_of_entries = new Opening_entry_in_Ranking_of_entries(getDriver());
			opening_entry_in_ranking_of_entries
				.Click_on_entry()
				.Click_on_subscribe();
			Assertions.assertEquals("15",getDriver().getCurrentUrl());
	  }


}