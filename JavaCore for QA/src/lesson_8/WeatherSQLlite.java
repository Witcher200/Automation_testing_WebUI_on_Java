package lesson_8;

import java.sql.*;
import java.util.ArrayList;

public class WeatherSQLlite {

    // Показать singleton DriveManager-a
    public static void main(String[] args) throws SQLException {

        // load JDBC driver
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try ( Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8db.db");
              Statement statement = connection.createStatement()){

            // Пример очистки при запуске
            performDropTable(statement);

            // Пример создания БД
            performCreateDB(statement);

            // Пример обновления записей
            performUpdateDb(statement);
            InsertData(connection,"Санкт Петербкрг", "19-10-20222","ясно", 17.5);
            InsertData(connection, "Москва", "20-10-2022", "облочно преймущейственно ясно", 18.6);
            InsertData(connection, "Новосибирск", "18-10-2022", "облочно", 15.2);
            InsertData(connection, "Омск", "20-10-2022", "облочно преймущейственно ясно", 16.6);
            InsertData(connection, "Сочи", "22-10-2022", "Ясно", 20.6);

            // Удаление записей
     //       performDeleteRows(statement);

            // Пример вычитки данных
            readCitiesFromDB(statement);
        }
    }

    private static void InsertData(Connection connection, String city,  String lDate,  String Weather, double temp ) throws SQLException {
        // Демонстрация prepared statement
        try(PreparedStatement  preparedStatement = connection.prepareStatement("INSERT INTO cities (city, LocalDate, WeatherText,  temperature) VALUES (?,?,?,?)")) {

            preparedStatement.setString(1, city);
            preparedStatement.setString(2, lDate);
            preparedStatement.setString(3, Weather);
            preparedStatement.setDouble(4, temp);
            preparedStatement.addBatch();

            preparedStatement.executeBatch();
        }
    }

    private static void performDeleteRows(Statement statement) throws SQLException {
        statement.executeUpdate("DELETE FROM cities WHERE id > 9000");
    }

    private static void performUpdateDb(Statement statement) throws SQLException {
        statement.executeUpdate("UPDATE cities SET temperature = 0 WHERE id = 4");
    }

    private static void performDropTable(Statement statement) throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS cities");
    }

    private static void performCreateDB(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS cities (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "city STRING, localDate String, weatherText String, temperature DOUBLE NOT NULL);");
    }

    private static void readCitiesFromDB(Statement statement) throws SQLException {
        ResultSet resultSet = statement.executeQuery("SELECT * FROM cities");
        // В данном случае result set выгружает всю результирующую выборку
        ArrayList<MyClass> arrayList = new ArrayList<>();
        while (resultSet.next()) {
            System.out.println(
                    resultSet.getInt("id") + " - " +
                            resultSet.getString("city") + " - " +
                            resultSet.getString("localDate") + " - " +
                            resultSet.getString("weatherText") + " - " +
                            resultSet.getDouble("temperature") + " - "
            );

    arrayList.add(new MyClass(resultSet.getInt(1),resultSet.getString(2),
            resultSet.getString(3),resultSet.getString(4),resultSet.getDouble("temperature")));
        }
        System.out.println("");
    }

    public static class MyClass{
        private Integer id;
        private String city;
        private String localDate;
        private String weatherText;
        private Double score;

        public MyClass(Integer id, String city, String localDate, String weatherText, Double score) {
            this.id = id;
            this.city = city;
            this.localDate = localDate;
            this.weatherText = weatherText;
            this.score = score;
        }
    }
}
