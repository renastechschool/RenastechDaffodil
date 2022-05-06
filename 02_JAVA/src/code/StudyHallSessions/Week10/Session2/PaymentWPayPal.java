package code.StudyHallSessions.Week10.Session2;


import java.time.LocalDate;

//           childClass              ParentClass
public class PaymentWPayPal extends Payment{
    // because I extended Payment class into the child class , PaymentWpaypal will have same methods.
    // Becuse I extended Payment class into the child class, PaymentWpaypal will have same attributes.



    public void pay(){
//        System.out.println("Payment was made with PayPal in "+ LocalDate.now());

        System.out.println("Payment was made with PayPal !!");
        System.out.println(this.payerName + " paid " +this.amount + " to "+this.recieverName + " Date : "+LocalDate.now());
    }

}
