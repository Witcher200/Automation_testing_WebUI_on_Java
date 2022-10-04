package Lessons_4;

import java.util.*;

import static java.util.Collections.sort;

public class Words {

    static ArrayList<String> arrstr = new ArrayList<>();
    static Set<String> uniq = new HashSet<>();
    static Map<String, Integer> mapstr = new HashMap();

    public static void main(String[] args) {
 //Задание 1. Создание массива с набором слов
     System.out.println("Ввод массива  из 20 слов");
    arrstr.add("Ноутбук");
    arrstr.add("Компьютер");
    arrstr.add("Телевизор");
    arrstr.add("Кошка");
    arrstr.add("Лис");
    arrstr.add("Лошадь");
    arrstr.add("Кот");
    arrstr.add("Телевизор");
    arrstr.add("Компьютер");
    arrstr.add("Ноутбук");
    arrstr.add("Лис");
    arrstr.add("Ворон");
    arrstr.add("Меч");
    arrstr.add("Ведьмак");
    arrstr.add("Чудовище");
    arrstr.add("Дракон");
    arrstr.add("Чудовище");
    arrstr.add("Ворон");
    arrstr.add("Меч");
    arrstr.add("Ведьмак");
    System.out.println(arrstr);

    System.out.println("  ");
    System.out.println("Вывод массива из уникальных слов");
 //Задание 1. Вывод уникальных слов
    sort(arrstr);
    //System.out.printf(String.valueOf(arrstr));

        //System.out.println("  ");
        for (String w: arrstr) {
          uniq.add(w);
        }
        System.out.println(uniq);


    System.out.println("Подсчет повторений слов");
 //Задание 1. Подсчет повторяющихся слов
    for (String w : arrstr) {
        Integer n = mapstr.get(w);
        n = (n == null) ? 1 : ++n;
    mapstr.put(w, n);
    }

    System.out.println(mapstr);
    }
}
