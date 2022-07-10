package code.stepDefinitions;

import code.pages.OrangeHRMAdmin;
import code.pages.OrangeHRMHome;
import code.pages.OrangeHRMLogin;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OrangeHRMSteps extends BrowserUtils {
    OrangeHRMLogin orangeHRMLogin=new OrangeHRMLogin();
    OrangeHRMHome orangeHRMHome = new OrangeHRMHome();
    OrangeHRMAdmin orangeHRMAdmin=new OrangeHRMAdmin();
    @Given("The user wants to go to Orange HRM Website")
    public void the_user_wants_to_go_to_orange_hrm_website() {
        System.out.println("Browser is launched and testing started");
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
        BrowserUtils.waitForPageToLoad(4);
    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        orangeHRMLogin.setUserName(ConfigurationsReader.getProperties("userName"));
        orangeHRMLogin.setPassword(ConfigurationsReader.getProperties("password"));
    }
    @Then("The user wants to click on Login button")
    public void the_user_wants_to_click_on_login_button() {
        orangeHRMLogin.setLoginButton();
    }
    @Then("The user wants to verify that browser landed on Dashboard")
    public void the_user_wants_to_verify_that_browser_landed_on_dashboard() {
        orangeHRMHome.verifyDashboardMessage();
    }
    @Then("The user wants to verify that browser landed on {string}")
    public void the_user_wants_to_verify_that_browser_landed_on(String string) {
       orangeHRMHome.verifyDashboardMessage(string);
    }

    @Then("The user wants to click on PIM module")
    public void the_user_wants_to_click_on_pim_module() {
      orangeHRMHome.setPIM();
    }
    @Then("The user wants to go to Add Employee page")
    public void the_user_wants_to_go_to_add_employee_page() {
        orangeHRMHome.setAddEmployee();
    }
    @Then("The user wants to add first name as {string}")
    public void the_user_wants_to_add_first_name_as(String string) {
        orangeHRMHome.setFirstName(string);
    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String string) {
        orangeHRMHome.setLastName(string);
    }
    @Then("The user wants to save personal information")
    public void the_user_wants_to_save_personal_information() {
        orangeHRMHome.setSaveButton();
    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {
        orangeHRMHome.setPersonalDetailsHeader(string);
    }

    @Then("The user wants to add employee's first and last name as following")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following(Map<String,String> dataTable) {
        orangeHRMHome.setAddEmployee();
        orangeHRMHome.setFirstName(dataTable.get("FirstName"));
        orangeHRMHome.setLastName(dataTable.get("LastName"));
    }
    @Then("The user wants to add login details as following")
    public void the_user_wants_to_add_login_details_as_following(Map<String, String> dataTable) {
        orangeHRMHome.setAddLoginDetails();
        orangeHRMHome.setUserName(dataTable.get("UserName"));
        orangeHRMHome.setPassword(dataTable.get("Password"));
        orangeHRMHome.setConfirmPassword(dataTable.get("Password"));
        orangeHRMHome.setStatusDrowndown(dataTable.get("Status"));
    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {
        orangeHRMHome.setSaveButton();

    }

    @Then("The user wants to add employee's first and last name as following List")
    public void the_user_wants_to_add_employee_s_first_and_last_name_as_following_list(List<List<String>> dataTable) {
        orangeHRMHome.setAddEmployee();
        orangeHRMHome.setFirstName(dataTable.get(0).get(0));//This will give us information from first row and first column
        orangeHRMHome.setLastName(dataTable.get(0).get(1));//This will give us information from first row and second column
    }
    @Then("The user wants to add login in a list way")
    public void the_user_wants_to_add_login_in_a_list_way(List<List<String>> dataTable) {
        orangeHRMHome.setAddLoginDetails();
        orangeHRMHome.setUserName(dataTable.get(1).get(0));
        orangeHRMHome.setPassword(dataTable.get(1).get(1));
        orangeHRMHome.setConfirmPassword(dataTable.get(1).get(1));
        orangeHRMHome.setStatusDrowndown(dataTable.get(1).get(2));
    }

    @Then("The user wants to go to Admin Page")
    public void the_user_wants_to_go_to_admin_page() {
        orangeHRMAdmin.setAdminButton();
    }
    @Then("The user wants to go to Nationalities section")
    public void the_user_wants_to_go_to_nationalities_section() {
        orangeHRMAdmin.setNationalitiesMenu();
    }
    @Then("The user wants to click on add new nationality")
    public void the_user_wants_to_click_on_add_new_nationality() {
        orangeHRMAdmin.setAddButton();
    }
    @Then("The user wants to add new nationalties as {string}")
    public void the_user_wants_to_add_new_nationalties_as(String string) {
        orangeHRMAdmin.setNationalityName(string);
        orangeHRMAdmin.setNationalitiesList(string);
    }
    @Then("The user wants to add employee's first and last name")
    public void the_user_wants_to_add_employee_s_first_and_last_name() {
        orangeHRMHome.setAddEmployee();
        orangeHRMHome.setFirstName("Eda");
        orangeHRMHome.setLastName("Atar");
    }
    @Then("The user wants to add login information as {string} {string} {string}")
    public void the_user_wants_to_add_login_information_as(String username, String password, String status) {
        orangeHRMHome.setAddLoginDetails();
        orangeHRMHome.setUserName(username);
        orangeHRMHome.setPassword(password);
        orangeHRMHome.setConfirmPassword(password);
        orangeHRMHome.setStatusDrowndown(status);
    }

    @Given("The user wants to login OrangeHRM using Excel file")
    public void the_user_wants_to_login_orange_hrm_using_excel_file() throws IOException {
        Driver.getDriver().get(ConfigurationsReader.getProperties("OrangeHRMTest"));
        String filePath="C:\\Users\\oralr\\IdeaProjects\\RenastechDaffodil\\04_CucumberBDD\\src\\test\\resources\\Book2.xlsx";
        FileInputStream fileInputStream =new FileInputStream(filePath);//In order to load excel file we need this class
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);//To open loaded excel file
        XSSFSheet sheet = workbook.getSheet("Sheet1");//To open a specific sheet

        int rows=sheet.getLastRowNum();//This will give us the last row number
        int cols=sheet.getRow(0).getLastCellNum();


        XSSFRow row=sheet.getRow(2);//Here we are on the second row
        System.out.println(row.getCell(0));
        System.out.println(row.getCell(1));

        System.out.println("Total number of rows is "+rows);
        System.out.println("Total number of columns is "+cols);

        orangeHRMLogin.setDataFromExcel(row.getCell(0).toString(),row.getCell(1).toString());

    }

}
