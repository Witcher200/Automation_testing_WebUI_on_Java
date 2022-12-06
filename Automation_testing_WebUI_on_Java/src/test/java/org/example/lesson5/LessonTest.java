package org.example.lesson5;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LessonTest extends AbstractTest{

	@Test
	void myActiontest() throws InterruptedException {
		new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.livejournal.com/"));
		//Assertions.assertTrue(getDriver().getTitle().contains("Войти"), "Страница не доступна");

		//Создание экземпляра класса Actions
		Actions to_come_in = new Actions(getDriver());

		to_come_in.click(getDriver().findElement(By.xpath("//nav[@class=\"s-nav-actions\"]/ul/li[2]/a")))
				.pause(1000L)
				.sendKeys(getDriver().findElement(By.xpath("//input[@id=\"user\"]")), "igor_t_2022", Keys.TAB)
				.pause(1000L)
				.sendKeys(getDriver().findElement(By.xpath("//input[@id=\"lj_loginwidget_password\"]")), "U,N8v`]7=#wTb{e", Keys.TAB)
				.pause(1000L)
				.click(getDriver().findElement(By.xpath("//button[contains(text(),'Войти')]")))
				.build()
				.perform();

		Thread.sleep(1000);
	}

	@Test
	void jsTest() throws InterruptedException {
		//Приводим Driver к интерфейсу Javascript
		JavascriptExecutor jsExecutor = (JavascriptExecutor) getDriver();
		long windowWidth = (long) jsExecutor.executeScript("return window.innerWidth");
		System.out.println("Размер окна " +windowWidth);
		jsExecutor.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1000);
		getDriver().findElement(By.xpath("//div[@class=\"lj-card\"]/article/a[1]")).click();
	}

	@Test
	void cookieTest(){
		getDriver().manage().addCookie(new Cookie("promo_code", "november2"));
		for(Cookie cookie: getDriver().manage().getCookies()){
			System.out.println(cookie.getName() + " " + cookie.getExpiry());
		}

		getDriver().manage().deleteCookie(new Cookie("promo_code", "november2"));
	}

	@Test
	@Disabled
	void voidTest(){
		WebElement voidElement = getDriver().findElement(By.xpath("//nav[@role=\\\"presentation\\\"]/ul/li[4]/a"));
		Actions actionsProvaderContext = new Actions(getDriver());
		//Выполнить клик по элементу
		actionsProvaderContext.contextClick(voidElement).build().perform();

		Actions actionsProvaderDouble = new Actions(getDriver());
		//Выполнить двойной клик по элементу
		actionsProvaderDouble.doubleClick(voidElement).build().perform();

		Actions actionsProvaderMove = new Actions(getDriver());
		//Выполнить переход к элементу
		actionsProvaderMove.moveToElement(voidElement).build().perform();

		Actions actionsProvaderOffset = new Actions(getDriver());
		//Переход мыши к указанной позиции
		actionsProvaderOffset.moveByOffset(1, 1).build().perform();

		Actions actionsProvader = new Actions(getDriver());
		//Перетащить элемент к другому элементу
		actionsProvader.dragAndDrop(voidElement, voidElement).build().perform();

		Actions actionsProvaderHold = new Actions(getDriver());
		//Нажать и удерживать
		actionsProvaderHold.clickAndHold(voidElement).moveToElement(voidElement).build().perform();
		//Выполняет выпуск события
		actionsProvaderHold.release().build().perform();
	}
}
