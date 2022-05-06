package code.StudyHallSessions.Week10.Session2;

public class PaymentObjects2 {
    public static void main(String[] args) {


        PaymentWPayPal payPal=new PaymentWPayPal();
        payPal.pay(); // Payment was made with PayPal in 2022-05-05

        PaymentWApplePay applePay=new PaymentWApplePay();
        applePay.pay(); // Payment was made with ApplePay in  2022-05-05

        PaymentWAmazonPay amazonPay=new PaymentWAmazonPay();
        amazonPay.pay(); //Payment was made with AmazonPay in 2022-05-05
    }
}
