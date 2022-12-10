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

public class Opening_news_in_LJ_recommendsTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 7 Opening_news_in_LJ_recommends")
	  @Description("Открытие новости в разделе ЖЖ рекомендует")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Opening_news_in_LJ_recommends() {
			//Клик на новость
			WebElement Click_on_new = getWebDriver().findElement(By.xpath("//div[@class=\"lj-card\"]/article/a"));
			Click_on_new.click();

			//Клик на кнопку подписаться
			WebElement Click_on_subscribe = getWebDriver().findElement(By.xpath("//div[@class=\"j-user-subscribe-btn\"]/a"));
			Click_on_subscribe.click();

			//Возврат на главную страницу
			WebElement Return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Return_to_mainPage.click();
	  }
}