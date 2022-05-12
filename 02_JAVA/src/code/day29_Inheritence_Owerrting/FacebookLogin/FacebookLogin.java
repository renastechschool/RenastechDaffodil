package code.day26_StaticBloc_Constructor.day29_Inheritence_Owerrting.FacebookLogin;

public class FacebookLogin {
    //try this with chrome , firefox , opera ,safari , edge
    //open browser
    //go to facebook login page url
    //passing credentials
    //close browser

    //variables :
    //username , password

    //methods
    //open browser () , go to url ,, pass credentials , closebrowser

    private String userName;
    private String password;
    //encapsulation
    //first hide the data from outside by using private keyword
    //second step is to create setter/getter methods to read and modify them

    //short cut to create encapsulation getter and setter method
    // right click - generate - getter setter


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //methods
    //open browser () , go to url ,, pass credentials , closebrowser

    public void openBrowser(){
        System.out.println("Browser is started");
    }

    public void goToUrl(){
        System.out.println("We are on facebook login page");
    }

    public void passingCredentials(String userName , String password){
        setUserName(userName);
        setPassword(password);
    }

    public void closeBrowser(){
        System.out.println("Browser is closed");
    }

}
