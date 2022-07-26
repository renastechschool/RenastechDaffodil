package code;

import java.sql.*;

public class ConnectionDB {

    public static void main(String[] args) throws SQLException {

        String dbUrl = "jdbc:oracle:thin:@ec2-54-159-174-62.compute-1.amazonaws.com:1521:XE";

        String username = "hr";

        String password = "hr";

        Connection connection = null;

//        try {
//            connection = DriverManager.getConnection(dbUrl,username,password);
//            System.out.println("Connection created successfully");
//        }
//        // catch exception
//        catch (SQLException throwables){
//            System.out.println("Connection Failed! .....");
//        }

        // 1.step create connection
        connection = DriverManager.getConnection(dbUrl,username,password);

        //2.create statement
        Statement statement = connection.createStatement();

        // 3. store query result

        ResultSet resultSet = statement.executeQuery("SELECT * FROM countries");

        resultSet.next();

        System.out.println("First Column Value:" + resultSet.getString("country_id"));
        System.out.println("Second Column Value:" + resultSet.getString("country_name"));
        System.out.println("Third Column Value:" + resultSet.getString("region_id"));

        System.out.println("                                                                 ");

        //resultSet.next();

        System.out.println("First Column Value:" + resultSet.getString(1));
        System.out.println("First Column Value:" + resultSet.getString(2));
        System.out.println("First Column Value:" + resultSet.getString(3));

        System.out.println("                                                                 ");
        //resultSet.next();

        System.out.println("First Column Value:" + resultSet.getString(1));
        System.out.println("First Column Value:" + resultSet.getString(2));
        System.out.println("First Column Value:" + resultSet.getString("region_id"));

        int i = 0;

        while(resultSet.next()){
            i= i+1;
            System.out.println( i+ "  " +resultSet.getString("country_id")+ "   " + resultSet.getString("country_name") +"    "+resultSet.getString("region_id"));
        }

        resultSet.close();
        statement.close();
        connection.close();

        // Given Login page for a website When I enter correct username and password Then verify the main Dashboard.
        // BDD style

        // Arrange act assert
    }
}

