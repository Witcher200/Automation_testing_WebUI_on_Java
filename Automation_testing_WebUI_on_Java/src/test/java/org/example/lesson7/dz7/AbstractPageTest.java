package org.example.lesson7.dz7;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class  AbstractPageTest {

	   static EventFiringWebDriver eventDriver;

	   @BeforeAll
	  static void setDriver(){
			 ChromeOptions options = new ChromeOptions();
			 /*options.addArguments("--incognito");
			 options.addArguments("--headless");*/
			 options.addArguments("start=maximized");
			options.setPageLoadTimeout(Duration.ofSeconds(10));

			 eventDriver = new EventFiringWebDriver(new ChromeDriver(options));
			 eventDriver.manage().window().maximize();

			 eventDriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	   }

	  @BeforeEach
	  void initMainPage(){
			Assertions.assertDoesNotThrow( ()-> eventDriver.navigate().to("https://www.livejournal.com/"),
				"Страница недоступна");
			Assertions.assertTrue(true);
	  }

	  @AfterAll
	  public static void exit(){
			 if(eventDriver !=null) eventDriver.quit();
	  }

	  @AfterEach
	  public void checkBrowser(){
			List<LogEntry> allLogRows = eventDriver.manage().logs().get(LogType.BROWSER).getAll();
			if(!allLogRows.isEmpty()){

				  if(allLogRows.size() > 10){
						allLogRows.forEach(logEntry -> {
							  System.out.println(logEntry.getMessage());
						});
				  }
			}
	  }

	  public WebDriver getWebDriver(){
			return eventDriver;
	  }
}