package students.Ulzana.lab13;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testCases {
    @BeforeClass
    public void setup(){
//    Step 1) Go to Guru99 Demo Site http://demo.guru99.com/V4/
        utilsDriver.getDriver().get(utilsConfigReader.getProperties("url"));
        utilsBrowser.implWait(5);}

    pageLogin pageLogin;
    pageHome pageHome;
    pageNewCustomer newCustomer;

    @Test
    public void TC_1(){
//    Step 2) In Login page check text "Guru99 Bank" is present
        pageLogin =new pageLogin();
        Assert.assertTrue(utilsDriver.getDriver().getTitle().startsWith(utilsConfigReader.getProperties("TitleLoginPage")));
        Assert.assertTrue(pageLogin.getTextGuru().isDisplayed());}

    @Test
    public void TC_2(){
//    Step 3) Login into application with given credentials(you need to enter your email in order to get credentials in advance)
        pageLogin.loginGURU(utilsConfigReader.getProperties("username"),
                utilsConfigReader.getProperties("password"));
       Assert.assertTrue(utilsDriver.getDriver().getTitle().contains(utilsConfigReader.getProperties("TitleHomePage")));}

    @Test
    public void TC_3(){
//    Step 4) Verify that the Home page contains text as "Manger Id: mngr368294"
        pageHome =new pageHome();
        Assert.assertTrue(pageHome.getTextManagerID().getText().startsWith(utilsConfigReader.getProperties("textHomePage")));}


    @Test
    public void TC_4(){
//    Step 5) Click on new customer button and verify you are in New Customer Entry Page
        pageHome.clickAddCustomerButton().click();
        utilsBrowser.staticWait(5000);
        Assert.assertEquals(utilsDriver.getDriver().getTitle(), utilsConfigReader.getProperties("TitleNewCustPage"));
        utilsBrowser.staticWait(5000);

    }


    @Test
    public void TC_5() {
//    Step 6) Fill the information for new customer
        newCustomer=new pageNewCustomer();
        newCustomer.setCustomerName("Trud");
        newCustomer.setCustomerGender("male");
        newCustomer.setAddress("10 Yonge street");
        newCustomer.setCity("Toronto");
        newCustomer.setState("Ontario");
        newCustomer.setPIN("909090");
        newCustomer.setMobileNumber("4379909090");
        newCustomer.setEmail("user9@gmail.com");
        newCustomer.setPasswordNEW("Canada90");
        newCustomer.setDateBirth("001995-09-19");
        newCustomer.getSubmitButton().click();
        utilsBrowser.staticWait(5000);

    }



//
//    Step 7) Verify new customer added sucessfully-----New customer already saved ***can not Verify***
//    @Test
//    public void TC_6(){
//        utilsBrowser.staticWait(5000);
//        Assert.assertEquals(newCustomer.getCustomerSuccess().getText(), utilsConfigReader.getProperties("textNewCustPageCustomer"));
//        Assert.assertTrue(newCustomer.getCustomerSuccess().isDisplayed());   }

        @AfterClass
    public void close(){
        utilsDriver.getDriver().manage().deleteAllCookies();
        utilsDriver.getDriver().quit();
        }


}