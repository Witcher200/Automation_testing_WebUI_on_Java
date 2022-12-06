package org.example.lesson6.dz6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;

public class  AbstractPageTest {

	  private static WebDriver driver;

	  private static final Long time = 5L;

	  @BeforeAll
	  static void init(){
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start=maximized");

			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }

	  public static void setDriver(WebDriver driver) {
			AbstractPageTest.driver = driver;
	  }

	  @BeforeEach
	  void goTo(){
			Assertions.assertDoesNotThrow( ()-> driver.navigate().to("https://www.livejournal.com/"),
				"Страница недоступна");
	  }

	  @AfterAll
	  static void close(){
			//driver.quit();
	  }

	  public static WebDriver getDriver(){return driver;}
}