package org.example.lesson7.dz7;

import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class CreatingRecordTest extends AbstractPageTest {

	  @Test
	  @DisplayName("Test 2 CreatingRecord")
	  @Description("Создание записи")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void CreatingRecord() {
			//Клик на кнопку Создать запись
			WebElement click_on_create_post = getWebDriver().findElement(By.xpath("//nav[@role=\"presentation\"]/ul/li[4]/a"));
			click_on_create_post.click();

			//Создание заголовка записи
			WebElement creating_post_title = getWebDriver().findElement(By.xpath("//div[@class=\"root-0-2-135\"]/div[2]/textarea"));
			creating_post_title.sendKeys("Мой заголовок", Keys.TAB);

			//Создание текста записи
			WebElement creating_post_text = getWebDriver().findElement(By.xpath("//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"]"));
			creating_post_text.sendKeys("Мой текст", Keys.TAB);

			//Создание тега записи
			WebElement creating_post_tag = getWebDriver().findElement(By.xpath("//div[@class=\"tags-0-2-140 alignment-0-2-136\"]/div/span/span/input"));
			creating_post_tag.sendKeys("TEST", Keys.TAB);

			//Клик на кнопку настроить и опубликовать
			WebElement Click_to_setup_and_publish = getWebDriver().findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/button"));
			Click_to_setup_and_publish.click();

			//Клик на кнопку опубликовать
			WebElement click_on_publish = getWebDriver().findElement(By.xpath("//span[text() = 'Опубликовать']"));
			click_on_publish.click();

			//Возврат на главную страницу
			WebElement return_to_mainPage = getWebDriver().findElement(By.xpath("//div[@class=\"s-logo\"]/a/span"));
			return_to_mainPage.click();
	  }
}
