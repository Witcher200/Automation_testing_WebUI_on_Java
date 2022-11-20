package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class lesson3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\ChromeDriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		try {
			driver.get("https://www.livejournal.com/");
			Thread.sleep(1000);

							/***Вход***/
/***Кейс №1 Выполнение входа***/
		//Клик на кнопку "Вход"
			driver.findElement(By.xpath("//nav[@class=\"s-nav-actions\"]/ul/li[2]/a[1]")).click();
			Thread.sleep(150);

		//Ввод имени в поле "Имя"
			driver.findElement(By.xpath("//input[@id=\"user\"]")).sendKeys("igor_t_2022", Keys.TAB);
			Thread.sleep(150);

		//Ввод пароля в поле "Пароль"
			driver.findElement(By.xpath("//input[@id=\"lj_loginwidget_password\"]")).sendKeys("U,N8v`]7=#wTb{e", Keys.TAB);
			Thread.sleep(150);

		//Клик на кнопку "Войти"
			driver.findElement(By.xpath("//button[@class=\"b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center\"]")).click();
			Thread.sleep(150);


/***Кейс №2 Создание записи***/
//работает
		/*//Клик на кнопку "Создание записи"
			driver.findElement(By.xpath("//nav[@role=\"presentation\"]/ul/li[4]/a")).click();
			Thread.sleep(150);

		//Создание заголовка записи
			driver.findElement(By.xpath("//div[@class=\"root-0-2-135\"]/div[2]/textarea")).sendKeys("Тест заголовок", Keys.TAB);
			Thread.sleep(150);

		//Создание текста записи
			driver.findElement(By.xpath("//div[@class=\"public-DraftStyleDefault-block public-DraftStyleDefault-ltr\"]")).sendKeys("Тест запись, просто запись");
			Thread.sleep(150);

		//Создание тега
			driver.findElement(By.xpath("//div[@class=\"tags-0-2-140 alignment-0-2-136\"]/div/span/span/input")).sendKeys("@Test");
			Thread.sleep(150);

		//Клик на кнопку "Настроить и опубликовать"
			driver.findElement(By.xpath("/html/body/div[6]/footer/div/div/div[2]/div[2]/button")).click();
			Thread.sleep(150);

		//Клик на кнопку Опубликовать
			driver.findElement(By.xpath("//span[text() = 'Опубликовать']")).click();
			Thread.sleep(150);
			//System.out.println(button.getTagName());

		//Возврат на главную страницу
			driver.findElement(By.xpath("//div[@class=\"s-logo\"]/a/span")).click();
			Thread.sleep(150);*/


/***Кейс №3  Открытие новости, подписка в разделе "ЖЖ Рекомендует"***/
//работает
		//Клик на новость
	/*		driver.findElement(By.xpath("//div[@class=\"lj-card\"]/article/a")).click();
			Thread.sleep(150);

		//Клик на кнопку подписка
			driver.findElement(By.xpath("//div[@class=\"j-user-subscribe-btn\"]/a")).click();
			Thread.sleep(150);

		//Возврат на главную страницу
			driver.findElement(By.xpath("//div[@class=\"s-logo\"]/a")).click();
			Thread.sleep(150);*/


/***Кейс №4 Поиск блогов и статей***/
//работает
		/*//Ввод поискового запроса в поле "Поиска"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[4]/div/div/form/div/input"))
			.sendKeys("Ремейк от Дисней - узаконенное зло, или ответ на запрос?");
			Thread.sleep(150);

		//Клик на кнопку "Поиска"
			driver.findElement(By.xpath("//div[@class=\"search__control-wrap\"]/button")).click();
			Thread.sleep(150);

		//Возврат на главную страницу
			driver.findElement(By.xpath("//div[@class=\"s-logo\"]/a")).click();
			Thread.sleep(150);*/


/***Кейс №5 Открытие записи в "Рейтинг записей"***/
//Работает
	/*	//Клик на запись
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[2]/div/div/div[1]/div[1]/div/div/article/a")).click();
			Thread.sleep(150);

		//Клик на кнопку "Подписаться"
			driver.findElement(By.xpath("//div[@class=\"aentry-head__wrapper\"]/div/a")).click();
			Thread.sleep(150);

		//Возврат на главную страницу
			driver.findElement(By.xpath("//div[@class=\"s-logo\"]/a")).click();
			Thread.sleep(150);*/


/***Кейс №6 Открытие раздела "Новые Лица" и оставления коментария к картинке***/
//Работает
	/*	//Клик на раздел "Новые Лица"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li/a")).click();
			Thread.sleep(150);

		//Клик на новость
			driver.findElement(By.xpath("//*[@id=\"js\"]/body/div[2]/div[3]/div[1]/section[1]/div/div[2]/div[16]/div/div/div/article/a")).click();
			Thread.sleep(150);

		//Написание коментария к фотографии
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[2]/div/figure[2]/div/div/div/form/div/textarea"))
			.sendKeys("Красивая резьба по дереву");
			Thread.sleep(150);

		//Клик на кнопку отправить
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/div[2]/div/figure[2]/div/div/div/form/button")).click();
			Thread.sleep(150);

		//Возврат на главную страницу
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/header/div/div/a")).click();
			Thread.sleep(150);*/


/***Кейс №7 Открытие раздела "Медиа в ЖЖ" ***/
//Работает
		//Клик на раздел "Медиа в ЖЖ"
	/*		driver.findElement(By.xpath("//html/body/div[2]/div[3]/div/div/div/div/ul/li[2]/a")).click();
			Thread.sleep(150);

		//Клик на медиа
		    driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/section/div/div[2]/div[16]/div/div/div/article/a")).click();
			Thread.sleep(150);

		//Клик на кнопку подписаться
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/div[3]/div[1]/article/section[1]/div[1]/div[1]/header/div[1]/dl/dd/div/div/div/a")).click();
			Thread.sleep(180);

		//Возврат на главную страницу
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[3]/header/div[1]/div/a[1]/span")).click();
			Thread.sleep(150);*/


/***Кейс №7 Присоединение к авторам Живого Журнала***/
//Работает
		//Открытия раздела горячее
			/*driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li[3]/a")).click();
			Thread.sleep(150);

		//Клик на кнопку "Присоеденится"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div[3]/div/a")).click();
			Thread.sleep(150);

		//Клик на кнопку "Присоеденится"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div/form/footer/input")).click();
			Thread.sleep(150);

		//Возврат на главную страницу
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/header/div/div/a[1]/span")).click();
			Thread.sleep(150);*/


/***Кейс №8 Открытие раздела "Путишествия"***/
//
		//Переход на страницу Путишествия
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div/div/div/ul/li[4]/a")).click();
			Thread.sleep(150);

/***Кейс №9 Открытие подраздела "Архитектура"***/
		//Клик на кнопку "Архитектура"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div[3]/div//a")).click();
			Thread.sleep(150);

							/***Открытие подраздела "It"***/
		//Клик на кнопку "It"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div[3]/div//a")).click();
			Thread.sleep(150);

							/***Открытие под подраздела "Компьютеры"***/
		//Клик на кнопку "Компьютеры"
			driver.findElement(By.xpath("//html[@id=\"js\"]/body/div[2]/div[3]/div/div[3]/div//a[4]")).click();
			Thread.sleep(150);

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
