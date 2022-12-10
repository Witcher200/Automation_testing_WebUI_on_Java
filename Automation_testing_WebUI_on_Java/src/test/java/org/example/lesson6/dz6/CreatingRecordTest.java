package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class CreatingRecordTest extends AbstractPageTest{

	  public static WebDriver driver;

	  public static void setDriver(WebDriver driver) {CreatingRecordTest.driver=driver;}

	  @Test
	  public void CreatingRecordTest() {
			CreatingRecord creatingRecord = new CreatingRecord(getDriver());
			creatingRecord
				.click_on_create_post()
				.click_creating_post_title()
				.click_creating_post_text()
				.click_creating_post_tag()
				.click_Click_to_setup_and_publish()
				.click_return_to_main_page();
			Assertions.assertEquals("18", getDriver().getCurrentUrl());
	  }
}