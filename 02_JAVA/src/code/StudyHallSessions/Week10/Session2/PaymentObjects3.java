package code.StudyHallSessions.Week10.Session2;

public class PaymentObjects3 {

    public static void main(String[] args) {
        PaymentWApplePay applePay=new PaymentWApplePay();
        applePay.payerName=" AA ";
        applePay.recieverName=" BB ";
        applePay.amount=99.99;


        applePay.pay();
        //Payment was made with ApplePay !!
        // AA  paid 99.99 to  BB  Date : 2022-05-05
        //Fee was  : 0.5

        System.out.println("******************");

        PaymentWPayPal payPal=new PaymentWPayPal();
        payPal.payerName="John Depp";
        payPal.recieverName="HH";
        payPal.amount=100000000;


        payPal.pay();
        //Payment was made with PayPal !!
        //John Depp paid 1.0E8 to HH Date : 2022-05-05

        System.out.println("****************");

        PaymentWAmazonPay amazonPay=new PaymentWAmazonPay();

        amazonPay.pay();
        //Payment was made with AmazonPay !!
        //null paid 0.0 to null Date : 2022-05-05

        System.out.println("******************");
        amazonPay.payerName="OO";
        amazonPay.recieverName="UU";
        amazonPay.amount=2;

        amazonPay.pay();
        //Payment was made with AmazonPay !!
        //OO paid 2.0 to UU Date : 2022-05-05
    }
}
