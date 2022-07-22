package code;

import java.sql.*;
import Utils.DatabaseUtil;
import org.junit.jupiter.api.*;

public class DBCountriesTable {

    @BeforeEach
    public void setup(){
        DatabaseUtil.createConnection();
    }

    @AfterEach
    public void teardown(){
        DatabaseUtil.closeConnection();
    }

    @Test()//"Given connected database and countries table when we check the column number then it must be equal to given data"
    public void columnNumber(){

        // Given
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM COUNTRIES");
        int expectedNumberOfColumnsInCountriesTable = 3; // coming from UI

        // When
        ResultSetMetaData resultSetMetaData = null;
        int actualNumberOfColumnsInCountriesTable = 0;

        try{
            resultSetMetaData = resultSet.getMetaData();
            actualNumberOfColumnsInCountriesTable = resultSetMetaData.getColumnCount();
        }catch (SQLException throwables){
            System.out.println("system couldn't get Meta Data");
        }

        // Then
        Assertions.assertEquals(actualNumberOfColumnsInCountriesTable,expectedNumberOfColumnsInCountriesTable,"Countries table column count is Incorrect");
    }

    @Test()//"Given connected database and countries table when we check the first column name then it must be equal to given data"
    public void columnName(){

        // Given
        ResultSet resultSet = DatabaseUtil.runQuery("SELECT * FROM COUNTRIES");
        String expectedFirstColumnNameInCountriesTable = "COUNTRY_ID"; // coming from UI

        // When
        ResultSetMetaData resultSetMetaData = null;
        String actualFirstColumnNameInCountriesTable = "";

        try{
            resultSetMetaData = resultSet.getMetaData();
            actualFirstColumnNameInCountriesTable = resultSetMetaData.getColumnName(1);
        }catch (SQLException throwables){
            System.out.println("System couldn't get Meta Data");
        }

        // Then
        Assertions.assertEquals(actualFirstColumnNameInCountriesTable, expectedFirstColumnNameInCountriesTable, "First Column Name in Countries Table is Incorrect");
    }

}
