package lessons_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.util.ArrayList;

public class RunClass {

    public static void main(String[] args) throws IOException {
        AppData appDT = ReadCSV("test1.csv");
        appDT.Show();
        System.out.println(" ");
        AppData appDT1 = ReadCSV("test2.csv");
        appDT1.Show();
        WriteCSV(appDT1, "write2.csv");
        //appDT1.Show();
    }

    public static AppData ReadCSV(String filecsv) throws IOException {

        ArrayList<String> arr = new ArrayList<>();

        try (BufferedReader r = new BufferedReader(new FileReader(filecsv))) {
          //  String str;
            String str = r.readLine();
            System.out.println(str);
            AppData apObj = new AppData(str.split(";"));
            while ((str = r.readLine()) != null) {
                arr.add(str);
            }
            System.out.println(arr.toString());
            System.out.println("Прочитано строк данных " + arr.size());

            int col = arr.get(0).split(";").length;
            String[] datastr = new String[col];
            int[][] data = new int[arr.size()][col];
            for (int s=0;s<arr.size();s++) {
            //    System.out.println(arr.get(s));
                datastr=arr.get(s).split(";");
                for (int c = 0; c < col; c++) {
                    data[s][c] = Integer.valueOf(datastr[c]);
                }
            }
            apObj.SaveData(data);
        return apObj;
        }
    }

    public static void WriteCSV(AppData appDT, String filecsv)  throws IOException  {
        System.out.println("Запись в файл " + filecsv);
        System.out.println(" ");
        appDT.Show();
        System.out.println(" ");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filecsv))) {
            writer.write(appDT.getHeadstr());
            writer.write(appDT.getDatastr());
            //  System.out.println(appDT.getHead());
            // System.out.println(appDT.getData());
 }
    }
}

