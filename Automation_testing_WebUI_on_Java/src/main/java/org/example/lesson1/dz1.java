package org.example.lesson1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dz1 {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("https://www.cossa.ru/");
            Thread.sleep(10);

        //При повторной регистрации, мне сообщили что аккаунт уже зарегистрирован, я пологаю так и должно было быть, поэтому я сделаю просто вход.

        /*Кейс №1 Регистрайия
            WebElement registration = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div/div/noindex/div/div/div[3]/a"));
            registration.click();
            Thread.sleep(180);

            WebElement  login = driver.findElement(By.xpath("//div[@id=\"content\"]/div/form/div[1]/input"));
            login.sendKeys("Ig0rHook");
            Thread.sleep(200);

            WebElement password = driver.findElement(By.xpath("//div[@id=\"content\"]/div/form/div[2]/input"));
            password.sendKeys("RX1wyDBycnDSTKlOSM%fH1tN8z7AekR", Keys.TAB);
            Thread.sleep(200);

            WebElement repeat_password = driver.findElement(By.xpath("//div[@id=\"content\"]/div/form/div[3]/input"));
            repeat_password.sendKeys("RX1wyDBycnDSTKlOSM%fH1tN8z7AekR", Keys.TAB);
            Thread.sleep(200);

            WebElement e_mail = driver.findElement(By.xpath("//div[@id=\"content\"]/div/form/div[4]/input"));
            e_mail.sendKeys("igor.h8k@gmail.com", Keys.TAB);
            Thread.sleep(200);

            WebElement Checkbox = driver.findElement(By.xpath("//label[@class=\"checkbox\"]/input"));
            Checkbox.click();
            Thread.sleep(180);

            WebElement register = driver.findElement(By.xpath("//div[@class=\"button\"]/input"));
            register.click();
            Thread.sleep(180);*/


        //Указываю свои данные

        //Кейс №1 Вход

            WebElement input = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div/div/noindex/div/div/div[2]/a"));
            input.click();
            Thread.sleep(100);

            WebElement login2 = driver.findElement(By.xpath("//div[@id=\"login_popup\"]/div[2]/div[2]/div/form/div/input"));
            login2.sendKeys("Ig0rHook", Keys.TAB);
            Thread.sleep(100);

            WebElement password2 = driver.findElement(By.xpath("//div[@id=\"login_popup\"]/div[2]/div[2]/div/form/div[2]/input"));
            password2.sendKeys("RX1wyDBycnDSTKlOSM%fH1tN8z7AekR");
            Thread.sleep(130);

            WebElement button = driver.findElement(By.xpath("//div[@id=\"login_popup\"]/div[2]/div[2]/div/form/div[3]/input"));
            button.click();
            Thread.sleep(130);


        //Кейс №2 Создание события
//Работает

            WebElement button_add1 = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div/div/div/div/div/div[4]/a"));
            button_add1.click();
            Thread.sleep(130);

            WebElement developments = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div/div/div/div/div/div[4]/div/ul/li/a"));
            developments.click();
            Thread.sleep(130);

            WebElement header = driver.findElement(By.xpath("//*[@id=\"form_section\"]/form/div[1]/input"));
            header.sendKeys("Мое первое событие тест");
            Thread.sleep(130);

            WebElement linkin_to_section = driver.findElement(By.xpath("//*[@id=\"form_section\"]/form/div[2]/select"));
            linkin_to_section.click();
            Thread.sleep(130);

            Select beginning_day = new Select(driver.findElement(By.xpath("//div[@class=\"form_field date_field\"]/span/select[@name=\"beginning_day\"]")));
            beginning_day.selectByIndex(0);

            Thread.sleep(130);
            Select ending_day = new Select(driver.findElement(By.xpath("//div[@class=\"form_field date_field\"]/span/select[@name=\"ending_day\"]")));
            ending_day.selectByIndex(0);
            Thread.sleep(130);

            WebElement address = driver.findElement(By.xpath("//div[@class=\"form_field\"]/input[@name=\"PROPERTY[88][0]\"]"));
            address.sendKeys("ул.Красноармейская, д.10, кв.211", Keys.TAB);
            Thread.sleep(130);

            WebElement city = driver.findElement(By.xpath("//div[@class=\"two\"]/div/input"));
            city.sendKeys("г.Раменское", Keys.TAB);
            Thread.sleep(130);

            WebElement place = driver.findElement(By.xpath("//div[@class=\"two\"]/div[2]/input"));
            place.sendKeys("ул.Красноармейская, д.10, кв.211", Keys.TAB);
            Thread.sleep(130);

            WebElement website = driver.findElement(By.xpath("//div[@class=\"two\"][2]/div/input"));
            website.sendKeys("https://tester.ru", Keys.TAB);
            Thread.sleep(130);

            WebElement phone = driver.findElement(By.xpath("//div[@class=\"two\"][2]/div[2]/input"));
            phone.sendKeys("+7 9687554607", Keys.TAB);
            Thread.sleep(130);

            WebElement organizer = driver.findElement(By.xpath("//div[@class=\"form_field\"][3]/input"));
            organizer.sendKeys("Михалыч", Keys.TAB);
            Thread.sleep(130);

            WebElement from = driver.findElement(By.xpath("//div[@class=\"form_field price\"]/input"));
            from.sendKeys("0", Keys.TAB);
            Thread.sleep(130);

            WebElement before = driver.findElement(By.xpath("//div[@class=\"form_field price\"]/input[2]"));
            before.sendKeys("0", Keys.TAB);
            Thread.sleep(130);

            WebElement description = driver.findElement(By.xpath("//div[@class=\"form_field entry\"]/textarea"));
            description.sendKeys("Это мой первый авто тест. Мне очень нравится писать авто тесты, это очень интересно." +
                    "  Я учусь создавать авто тесты", Keys.TAB);
            Thread.sleep(130);

            WebElement publish = driver.findElement(By.xpath("//div[@class=\"buttons\"]/div[@class=\"submit\"]/input"));
            publish.click();
            Thread.sleep(130);


            //Кейс №3 Создание вакансии
//Работает
            WebElement button_add2 = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div/div/div/div/div/div[4]/a"));
            button_add2.click();
            Thread.sleep(130);

            WebElement vacancies = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div/div/div/div/div/div[4]/div/ul/li[2]/a"));
            vacancies.click();
            Thread.sleep(130);

            WebElement name_vacancies = driver.findElement(By.xpath("//div[@class=\"content_pad\"]/div/form/div/input"));
            name_vacancies.sendKeys("Тестировщик", Keys.TAB);

            WebElement company = driver.findElement(By.xpath("//div[@class=\"two\"]/div/input"));
            company.sendKeys("QA-engineer", Keys.TAB);

            WebElement website2 = driver.findElement(By.xpath("//div[@class=\"two\"]/div[2]/input"));
            website2.sendKeys("website2", Keys.TAB);

            WebElement city2 = driver.findElement(By.xpath("//div[@class=\"two\"][2]/div/input"));
            city2.sendKeys("Раменское", Keys.TAB);

            WebElement from2 = driver.findElement(By.xpath("//div[@id=\"form_section\"]/form/div[4]/input"));
            from2.sendKeys("20 000", Keys.TAB);

            WebElement before2 = driver.findElement(By.xpath("//div[@id=\"form_section\"]/form/div[4]/input[2]"));
            before2.sendKeys("80 000", Keys.TAB);

            Select remoteness = new Select(driver.findElement(By.xpath("//select[@name=\"PROPERTY[116]\"]")));
            remoteness.selectByIndex(1);

            WebElement description2 = driver.findElement(By.xpath("//textarea[@name=\"PROPERTY[688][0]\"]"));
            description2.sendKeys("Опять текстовое поле", Keys.TAB);

            WebElement responsibilities = driver.findElement(By.xpath("//textarea[@name=\"PROPERTY[118][0]\"]"));
            responsibilities.sendKeys("Тестировщик, Маг", Keys.TAB);

            WebElement requirements = driver.findElement(By.xpath("//textarea[@name=\"PROPERTY[119][0]\"]"));
            requirements.sendKeys("Опыт, 99 Уровень");

            WebElement term = driver.findElement(By.xpath("//textarea[@name=\"PROPERTY[120][0]\"]"));
            term.sendKeys("Ноутбук, Волшелбный посох");

            WebElement contact_for_feedback = driver.findElement(By.xpath("//textarea[@id=\"editor_textarea_4\"]"));
            contact_for_feedback.sendKeys("Номер телефона: +7 968 755 46 07, Сова");

            WebElement e_mail = driver.findElement(By.xpath("//input[@name=\"PROPERTY[986][0]\"]"));
            e_mail.sendKeys("igor.h8k@gmail.com");

            WebElement publish2 = driver.findElement(By.xpath("//div[@class=\"submit\"]/input"));
            publish2.click();
            Thread.sleep(130);


            /*WebElement events = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div[2]/div/div/div[3]/a[2]"));
            events.click();
            Thread.sleep(5000);

            WebElement event = driver.findElement(By.xpath("//div[@class=\"article__content\"]/div[2]/a[1]"));
            event.click();
            Thread.sleep(130);*/

//Кейс №4 избранное
//Работает
            WebElement favorites2 = driver.findElement(By.xpath("//*[@id=\"user_menu\"]/div/div[1]/div[3]/a[2]"));
            favorites2.click();
            Thread.sleep(130);

            WebElement main_page =driver.findElement(By.xpath("//div[@id=\"logo\"]/a/img"));
            main_page.click();
            Thread.sleep(130);


        //Кейс №7 Выполнения поиска

//Работает
            WebElement  search1 = driver.findElement(By.xpath("//input[@id=\"title-search-input\"]"));
            search1.sendKeys("«Лайфхакер» представил результаты ежегодного исследования нативной рекламы", Keys.ENTER);


        //Кейс №5 Открытие спецпроекты в разделе "Спецпроекты"

//Работает
          WebElement special_project = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div[2]/div/div/div[3]/a[5]"));
          special_project.click();
          Thread.sleep(130);

          WebElement project = driver.findElement(By.xpath("//div[@class=\"Triangle-wrapper\"]/div[5]/div[5]/a[3]"));
          project.click();
          Thread.sleep(130);





        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
