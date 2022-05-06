package code.StudyHallSessions.Week10.Session2;

import java.time.LocalDate;

public class PaymentWApplePay extends Payment{



    //PaymentWApplePay class will have all Payment actions because of inheritance

    public void pay(){
        //  System.out.println("Payment was made with ApplePay in  "+ LocalDate.now());

        System.out.println("Payment was made with ApplePay !!");
        System.out.println(this.payerName + " paid " +this.amount + " to "+this.recieverName + " Date : "+LocalDate.now());

    }

}
