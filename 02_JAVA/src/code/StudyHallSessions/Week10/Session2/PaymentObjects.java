package code.StudyHallSessions.Week10.Session2;

public class PaymentObjects {
    public static void main(String[] args) {


        Payment p1=new Payment();
        p1.pay();




        System.out.println("**************");

        PaymentWPayPal pp=new PaymentWPayPal();
        pp.pay();

        pp.amount=100;

        System.out.println("***************");

        PaymentWApplePay apple=new PaymentWApplePay();

        apple.pay();

        System.out.println("***************");
        PaymentWAmazonPay amazon=new PaymentWAmazonPay();

        amazon.pay();

        System.out.println("__________________");

        PaymentWAmazonPay amazonPay=new PaymentWAmazonPay();

        System.out.println(amazonPay.amount); //0.0

        amazonPay.amount=200;
        amazonPay.payerName="AA";
        amazonPay.recieverName="BB";

        System.out.println(amazonPay.amount); //200.0

        amazonPay.pay(); //Payment was made !!

    }
}
