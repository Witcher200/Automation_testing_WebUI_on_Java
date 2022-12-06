package org.example.lesson6.dz6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class Opening_of_section_New_FacesTest extends AbstractPage {

	  public static WebDriver driver;

	  public Opening_of_section_New_FacesTest(WebDriver driver) {
			super(driver);
	  }

	  public static void setDriver(WebDriver driver) {
			Opening_of_section_New_FacesTest.driver = driver;
	  }

	  @Test
	  public void Opening_section_New_FacesTest() {
			Opening_of_section_New_Faces opening_of_section_new_faces = new Opening_of_section_New_Faces(getDriver());
			opening_of_section_new_faces
				.Click_to_section_NewFaces()
				.Click_on_news()
				.Writing_comments_on_a_post()
				.Click_to_btn_add()
				.Return_to_mainPage();
			Assertions.assertEquals("17",getDriver().getCurrentUrl());
	  }
}