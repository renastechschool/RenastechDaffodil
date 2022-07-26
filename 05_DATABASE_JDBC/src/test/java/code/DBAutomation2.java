package code;

import java.sql.*;
import Utils.DatabaseUtil;

public class DBAutomation2 {

    public static void main(String[] args) throws SQLException {

        DatabaseUtil.createConnection();
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM countries");

        //resultSet.next();
        resultSet.absolute(8);

        System.out.println(resultSet.getString("country_name"));

        // check if cursor is after last row
        //System.out.println(resultSet.isAfterLast());

        // check cursor is before first row
        //System.out.println(resultSet.isBeforeFirst());

        // n.
//        resultSet.next();
//        resultSet.next();
//        resultSet.next();
//        resultSet.next();

        //resultSet.absolute(6);

        //resultSet.absolute(40);
        //System.out.println(resultSet.getString(1));

    }
}
