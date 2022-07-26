package code;

import java.sql.*;
import Utils.DatabaseUtil;

public class DBAutomation3 {

    public static void main(String[] args) throws SQLException {
        DatabaseUtil.createConnection();

        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM employees");

        resultSet.next();

        System.out.println(resultSet.getString(1));
        // Meta Data

        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        // Column Count 11

        int actualNumberOfColumnInEmployeeTable = resultSetMetaData.getColumnCount();
        int expectedNumberOfColumnInEmployeeTable = 11;

        System.out.println(resultSetMetaData.getColumnCount());

        System.out.println(resultSetMetaData.getColumnName(2));

        System.out.println();

    }
}
