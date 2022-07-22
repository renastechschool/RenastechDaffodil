package code;

import org.junit.jupiter.api.*;

import java.sql.*;
import Utils.DatabaseUtil;

public class DBDepartmentsTable {

    @BeforeEach
    public void setup(){
        DatabaseUtil.createConnection();
    }

    @AfterEach
    public void teardown(){
        DatabaseUtil.closeConnection();
    }

    @Test( )//"Given connected database and departments table when we check the column number then it must be equal to given data"
    public void columnNumber(){

        // Given
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM DEPARTMENTS");
        int expectedNumberOfColumnsInDepartmentsTable = 4; // coming from UI

        // When
        ResultSetMetaData resultSetMetaData = null;
        int actualNumberOfColumnsInDepartmentsTable = 0;

        try{
            resultSetMetaData = resultSet.getMetaData();
            actualNumberOfColumnsInDepartmentsTable = resultSetMetaData.getColumnCount();
        }catch (SQLException throwables){
            System.out.println("system couldn't get Meta Data");
        }

        // Then
        Assertions.assertEquals(actualNumberOfColumnsInDepartmentsTable,expectedNumberOfColumnsInDepartmentsTable,"Departments table column count is Incorrect");
    }

    @Test( )// "Given connected database and departments table when we check the first column name then it must be equal to given data"
    public void columnName(){

        // Given
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM DEPARTMENTS");
        String expectedFirstColumnNameInDepartmentTable = "DEPARTMENT_ID"; // coming from UI

        // When
        ResultSetMetaData resultSetMetaData = null;
        String actualFirstColumnNameInDepartmentsTable = "";

        try{
            resultSetMetaData = resultSet.getMetaData();
            actualFirstColumnNameInDepartmentsTable = resultSetMetaData.getColumnName(1);
        }catch (SQLException throwables){
            System.out.println("System couldn't get Meta Data");
        }

        // Then
        Assertions.assertEquals(actualFirstColumnNameInDepartmentsTable, expectedFirstColumnNameInDepartmentTable, "First Column Name in the Departments Table is Incorrect");
    }
}
