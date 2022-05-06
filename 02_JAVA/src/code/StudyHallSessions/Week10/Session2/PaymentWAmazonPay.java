package code.StudyHallSessions.Week10.Session2;

import java.time.LocalDate;

public class PaymentWAmazonPay extends Payment{

    @Override
    public void pay() {
       //  System.out.println("Payment was made with AmazonPay in "+ LocalDate.now());

        System.out.println("Payment was made with AmazonPay !!");
        System.out.println(this.payerName + " paid " +this.amount + " to "+this.recieverName + " Date : "+LocalDate.now());
    }
}
