package lessons_6;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class OkHttpPogoda {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=cToNEvvKd2ZHVy8GuTeOMbrWMZ1xdrV2&language=ru-ru&metric=true");
        //Подставляем в запрос URL API Key = cToNEvvKd2ZHVy8GuTeOMbrWMZ1xdrV2
        // и Location_Key = 295212 (Санкт пПетербург)
        HttpURLConnection hpCon =
                (HttpURLConnection) url.openConnection();
// Получение информации о запросе
        System.out.println("Метод запроса:" + hpCon.getRequestMethod());
        System.out.println("Код ответа:" + hpCon.getResponseCode());
        System.out.println("Ответное сообщение:" + hpCon.getResponseMessage());
// Получение заголовков
        Map<String, List<String>> headers = hpCon.getHeaderFields();
        for (String k: headers.keySet()) {
            System.out.printf("Ключ: %s, значение: %s \n", k, headers.get(k));
        }
        System.out.println(hpCon.getContentType());
        //hpCon.getContent(); //Нужно получить контент JSON
        BufferedReader reader = new BufferedReader(
                new InputStreamReader((InputStream) hpCon.getContent(), StandardCharsets.UTF_8));
        String json = reader.readLine(); //Считываем строку из BufferedReade

        System.out.println("JSON строка:");
        System.out.println(json); //Выводим считанную строку на экран

        String[] str = json.split("},"); //Разбиваем строку на части, для удобства чтения
        System.out.println("Вывод на экран:");
        for (int i=0;i< str.length;i++) {
            System.out.println(str[i]);  //Выводим строковый массив на экран
        }
    }
}


