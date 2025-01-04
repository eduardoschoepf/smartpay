import context.PaymentContext;
import strategy.CreditCardPayment;

public class Main {
    public static void main(String[] args) {

        // Gets the Singleton instance from the context
        PaymentContext context = PaymentContext.getInstance();
    
        // Define the credit card payment strategy.
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.executePayment(250.75);
    }
}