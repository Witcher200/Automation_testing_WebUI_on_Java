package lessons_5;


import java.util.Arrays;

public class AppData {
    private String[] header;
    private int[][] data;

    public AppData(String[] header) {
        this.header = header;
    }

    public void SaveData(int[][] data) {
        this.data = data;
    }

    public void Show() {
        System.out.println("Содержимое AppData:");
        System.out.println(Arrays.toString(header));
        for (int i = 0; i < data.length; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
        ;
    }

    public String getHeadstr() {
        String s = "";
        for (int i = 0; i < header.length; i++) {
            s = s + header[i];
            if (i < header.length - 1) s = s + ";";
  //          System.out.println(s);
        }
        return s+"\n";
    }

    public String getDatastr() {
        String x = "";
        for (int j = 0; j < data.length; j++) {

            for (int i = 0; i < data[j].length; i++) {
                x = x + data[j][i];
                if (i < data[j].length - 1) x = x + ";";
            }
            x=x+"\n";
   //         System.out.println(x);
        }
        return x;
    }
}

