package Lessons_4;

import java.util.HashMap;
import java.util.Map;

public class phonebook {
    private HashMap<String, String> pb = new HashMap<>();

    public phonebook() {
    }

    public void add(String second_name, String phone) {
        this.pb.put(second_name, phone);
    }

    public void get(String second_name) {
        System.out.println("поиск по фамилии: " + second_name);
        if (pb.containsValue(second_name)) {
        for (Map.Entry<String, String> i : pb.entrySet()) {
            if (second_name == i.getValue()){
                System.out.println(i.getKey());
            }
           // System.out.println(i.getValue() + ": " + i.getKey());
        }}
        else
          System.out.println("не найден в справочнике");

    }
}
