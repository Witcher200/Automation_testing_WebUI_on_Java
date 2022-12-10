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

public class Search_blogs_and_articleTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Test 8 Search_blogs_and_article")
	  @Description("Поиск блогов и статей")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Search_blogs_and_article() {

			//Ввод поискового запроса
			WebElement Entering_search_query = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Entering_search_query.sendKeys("Ремейк от Дисней - узаконенное зло, или ответ на запрос?");

			//Клик на кнопку поиск
			WebElement Click_on_search = getWebDriver().findElement(By.xpath("//div[@class=\"search__control-wrap\"]/button"));
			Click_on_search.sendKeys("Test");

			//Возврат на главную страницу
			WebElement Return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Return_to_mainPage.click();
	  }
}