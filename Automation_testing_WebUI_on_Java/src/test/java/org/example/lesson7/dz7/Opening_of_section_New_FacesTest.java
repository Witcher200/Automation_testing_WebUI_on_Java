package org.example.lesson7.dz7;

import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Opening_of_section_New_FacesTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 8 Opening_of_section_New_Faces")
	  @Description("Открытие раздела Новые Лица")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Opening_of_section_New_Faces() {
			//Клик на секцию Новые Лица
			WebElement Click_to_section_NewFaces = getWebDriver().findElement(By.xpath("//html[@id=\"j s\"]/body/div[2]/div[3]/div/div/div/div/ul/li/a"));
			Click_to_section_NewFaces.click();

			//Клик на новость
			WebElement click_on_news = getWebDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[1]/div/div[2]/div[16]/div/div/div/article/a"));
			click_on_news.click();

			//Написание комментария к записи
			WebElement Writing_comments_on_a_post = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Writing_comments_on_a_post.sendKeys("Test");

			//Написание комментария к записи
			WebElement Click_to_btn_add = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[2]/div/figure[2]/div/div/div/form/button"));
			Click_to_btn_add.sendKeys("Test");

			//Возврат на главную страницу
			WebElement Return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Return_to_mainPage.click();
	  }
}