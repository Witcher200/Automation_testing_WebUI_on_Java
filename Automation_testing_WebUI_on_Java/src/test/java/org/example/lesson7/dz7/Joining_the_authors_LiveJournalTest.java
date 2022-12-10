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

public class Joining_the_authors_LiveJournalTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Test 3 Joining_the_authors_LiveJournal")
	  @Description("Присоединение к авторам Живого Журнала")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Joining_the_authors_LiveJournal() {
			//Открытие секции Это было осенью
			WebElement open_section_it_was_autumn = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li[3]/a"));
			open_section_it_was_autumn.click();

			//Клик на кнопку присоединиться
			WebElement click_to_join_btn = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div[3]/div/a"));
			click_to_join_btn.click();

			//Возврат на главную страницу
			WebElement return_to_main_page = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			return_to_main_page.click();
	  }
}
