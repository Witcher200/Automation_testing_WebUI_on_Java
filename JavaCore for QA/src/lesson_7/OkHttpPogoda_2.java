package lesson_7;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class OkHttpPogoda_2 {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=cToNEvvKd2ZHVy8GuTeOMbrWMZ1xdrV2&language=ru-ru&metric=true");
 //Подставляем в запрос URL API Key = cToNEvvKd2ZHVy8GuTeOMbrWMZ1xdrV2
 // и Location_Key = 295212 (Санкт Петербург)
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

        ObjectMapper objectMapper = new ObjectMapper();
        Weather objW = objectMapper.readValue(json, Weather.class);

        System.out.println("В Санкт Питербурге :");

    /*    for (int i = 0;i<objW.getDailyForecasts().size(); i++ ){
            DailyForecast df = objW.getDailyForecasts().get(i);
            System.out.println(df.getDate() + " " + df.getDay().getIconPhrase() + ", температура от " + df.getTemperature().getMinimum().getValue() + " до " +
                    df.getTemperature().getMaximum().getValue());
        }
      */
        for (DailyForecast df: objW.getDailyForecasts()){
            System.out.println("на дату " + df.getDate() + " ожидается " + df.getDay().getIconPhrase() + ", температура от " + df.getTemperature().getMinimum().getValue() + " до " +
                    df.getTemperature().getMaximum().getValue());
        }
    }
}

