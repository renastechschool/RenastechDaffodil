package code.day32_Polymorphism;

public class Encapsulation {

    // //oop questions
    //    //tips to remember
    //
    //    //1.explain what is it
    //    //2.explain how you achive
    //    //3.where you are using in your project

    //why oop
    //Reusability
    //cleaner -- easy to read -- easy to present for even non technical peoples
    //time saves
    //less memory usage
    //easy to maintain your code


    private String password;
    private String userName;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}

class encapTest{

    public static void main(String[] args) {

        Encapsulation obj =new Encapsulation();
//        obj.password

        obj.setPassword("123450");
        obj.setUserName("ali");

        System.out.println("obj.getUserName() = " + obj.getUserName());
        System.out.println("obj.getPassword() = " + obj.getPassword());
    }
}