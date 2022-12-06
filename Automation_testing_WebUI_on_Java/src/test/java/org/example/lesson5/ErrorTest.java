package org.example.lesson5;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.function.Function;

public class ErrorTest extends AbstractTest{

	@Test
	void test() throws InterruptedException {
		getDriver().get("https://www.livejournal.com/");
		WebElement element = getDriver().findElement(By.xpath("//ul[@class=\"categories__list js--limited-list\"]/li[5]/a"));
		element.click();

		Wait<WebDriver> wait = new FluentWait<>(getDriver())
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		Thread.sleep(10000);

		WebElement element2 = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath("//input[@class=\"search__control\"]"));
			}
		});
		//element2.click();
		element2.sendKeys("Кто_то");
		element2.submit();
	}
}
