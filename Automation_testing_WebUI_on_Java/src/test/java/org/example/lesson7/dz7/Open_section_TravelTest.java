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

class Open_section_TravelTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 5 Open_section_Travel")
	  @Description("Открытие секции Путешествие")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void Open_section_Travel() {
			//Открытие секции путешествия
			WebElement Go_to_Travel_page = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[1]/div/div/ul/li[3]/a"));
			Go_to_Travel_page.click();

			/***В этом же разделе, находятся подразделы***/

			/***Opening of subsection Architecture***/

			//Переход на страницу Архитектура
			WebElement Go_to_the_Architecture_page = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[3]/div/nav/a[1]"));
			Go_to_the_Architecture_page.click();

			/***Opening of the IT sub subsection***/

			//Переход на страницу IT
			WebElement Go_to_IT_page = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[3]/div/nav/a[1]"));
			Go_to_IT_page.click();

			/***Opening sub subsection Computers***/

			//Переход на подраздел Компьютеры
			WebElement Go_to_computers_page = getWebDriver().findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[4]/div[1]/div[3]/div/nav/a[4]"));
			Go_to_computers_page.click();

			//Возврат на главную страницу
			WebElement Return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			Return_to_mainPage.click();
	  }
}