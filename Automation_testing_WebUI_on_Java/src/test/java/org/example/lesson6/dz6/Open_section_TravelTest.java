package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Open_section_TravelTest extends AbstractPageTest {

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {
			Open_section_Travel.driver=driver;
	  }

	  @Test
	  public void Open_TravelTest() {
			Open_section_Travel open_section_travel = new Open_section_Travel(getDriver());
			open_section_travel
				.Go_to_Travel_page()
				.Go_to_the_Architecture_page()
				.Go_to_IT_page()
				.Go_to_computers_page();
			Assertions.assertEquals("4",getDriver().getCurrentUrl());
	  }
}