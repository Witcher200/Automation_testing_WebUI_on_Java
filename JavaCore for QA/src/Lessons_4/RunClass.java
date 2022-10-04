package Lessons_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RunClass {

    static phonebook phb  = new phonebook();

    public static void main(String[] args) {
//Создание имени человека
        phb.add("7 958 847-54-54", "Афанасьев");
        phb.add("8 432 694-64-23", "Дмитров");
        phb.add("7 835 932-43-12", "Иванов");
        phb.add("7 123 635-63-34", "Иванов");

//        System.out.println(.toString());
        phb.get("Дмитров");
        System.out.println(" ");
        phb.get("Иванов");
        System.out.println(" ");
        phb.get("Иванов2");
        }
    }
