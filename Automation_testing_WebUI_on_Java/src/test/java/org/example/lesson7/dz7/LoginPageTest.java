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

public class LoginPageTest extends AbstractPageTest{

	  @Test
	  @DisplayName("Test 1 LoginPage")
	  @Description("Выполнение входа")
	  @Link("http://gooogle.com")
	  @TmsLink("https://www.livejournal.com/")
	  @Severity(SeverityLevel.BLOCKER)
	  void LoginPage() {
			//Клик на кнопку Войти
			WebElement Click_on_Login_button = getWebDriver().findElement(By.xpath("//nav[@class=\"s-nav-actions\"]/ul/li[2]/a[1]"));
			Click_on_Login_button.click();

			//Ввод имени в поле имя
			WebElement name_input = getWebDriver().findElement(By.xpath("//input[@id=\"user\"]"));
			name_input.sendKeys("igor_t_2022", Keys.TAB);

			//Ввод пароля в поле пароль
			WebElement password_input = getWebDriver().findElement(By.xpath("password_input.sendKeys(\"U,N8v`]7=#wTb{e\", Keys.TAB);"));
			password_input.sendKeys("U,N8v`]7=#wTb{e", Keys.TAB);

			//Клик на кнопку Войти
			WebElement Click_input = getWebDriver().findElement(By.xpath("//button[@class=\"b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center\"]"));
			Click_input.submit();
	  }
}
