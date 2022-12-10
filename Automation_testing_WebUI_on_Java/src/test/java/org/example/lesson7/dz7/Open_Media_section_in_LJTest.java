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

class Open_Media_section_in_LJTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Test 4 Open_Media_section_in_LJ")
	  @Description("Открытие медиа в секции ЖЖ")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Open_Media_section_in_LJ() {
			//Открытие секции Медиа
			WebElement click_on_Media_section_LJ = getWebDriver().findElement(By.xpath("//html/body/div[2]/div[3]/div/div/div/div/ul/li[2]/a"));
			click_on_Media_section_LJ.click();

			//Клик на медиа
			WebElement click_on_media = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/section/div/div[2]/div[16]/div/div/div/article/a"));
			click_on_media.click();

			//Клик на кнопку подписаться
			WebElement click_on_subscribe = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/header/div[1]/dl/dd/div/div/div/a"));
			click_on_subscribe.click();

			//Возврат на главную страницу
			WebElement Return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Return_to_mainPage.click();
	  }
}