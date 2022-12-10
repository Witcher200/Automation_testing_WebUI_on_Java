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

public class Opening_entry_in_Ranking_of_entriesTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 6 Opening_entry_in_Ranking_of_entries")
	  @Description("Открытие секции Путешествие")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Opening_entry_in_Ranking_of_entries() {
			//Клик на новость
			WebElement Click_on_entry = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/section[1]/div/div/div[1]/div[1]/div/div/article/a"));
			Click_on_entry.click();

			//Клик на кнопку подписаться
			WebElement Click_on_subscribe = getWebDriver().findElement(By.xpath("//*[@id=\"js\"]/body/div[3]/div[4]/div[1]/article/section[1]/div[1]/div[1]/header/div[3]/div/div[1]/div/a"));
			Click_on_subscribe.click();

			//Возврат на главную страницу
			WebElement Return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Return_to_mainPage.click();
	  }
}