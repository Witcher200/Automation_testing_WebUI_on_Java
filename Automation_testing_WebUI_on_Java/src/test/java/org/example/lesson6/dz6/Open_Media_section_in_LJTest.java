package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Open_Media_section_in_LJTest extends AbstractPageTest {

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {Open_Media_section_in_LJTest.driver=driver;}

	@Test
	  public void Open_Media_section_LJTest() {
			Open_Media_section_in_LJ open_media = new Open_Media_section_in_LJ(getDriver());
			open_media
				.click_on_Media_section_LJ()
				.click_on_media()
				.click_on_subscribe()
				.click_on_subscribe()
				.Return_to_mainPage();
		  Assertions.assertEquals("17", getDriver().getCurrentUrl());
	}
}