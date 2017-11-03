package usersBD;

import java.sql.*;

public class Database {
     public static String getData() {
         String result = "";
         try {
             Class.forName("org.postgresql.Driver");
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }

         String connectionString = "jdbc:postgresql://localhost:5432/OSP?user=postgres&password=13693509";
         try {
             Connection connection = DriverManager.getConnection(connectionString);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from users");
              result = "<table border=\"1\">" +
                      "<tr>\n" +
                      "<th>id</th>\n" +
                      "<th>username</th>\n" +
                      "<th>mail</th>\n" +
                      "<th>Location</th>\n" +
                      "<th>Description</th>\n" +
                      "<th>Call Number</th>\n" +
                      "</tr>";
             while (resultSet.next()){
               result += "<tr><td>" + resultSet.getString("id") + "</td>";
                 result += "<td>" + resultSet.getString("username") + "</td>";
                 result += "<td>" + resultSet.getString("mail") + "</td>";
                 result += "<td>" + resultSet.getString("location") + "</td>";
                 result += "<td>" + resultSet.getString("discription") + "</td>";
                 result += "<td>" + resultSet.getString("call_number") + "</td></tr>";
             }
             result += "</table>";

         } catch (SQLException e) {
             e.printStackTrace();
         }

         return result;
    }


}
