import context.PaymentContext;
import factory.PaymentStrategyFactory;
import observer.AuditLogger;
import observer.NotificationService;
import strategy.CreditCardPayment;
import strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {

        // Gets the Singleton instance from the context
        PaymentContext context = PaymentContext.getInstance();

        // Add observers
        context.addObserver(new AuditLogger());
        context.addObserver(new NotificationService());
    
        // Creating a credit card payment using the Factory pattern.
        PaymentStrategy creditCard = PaymentStrategyFactory.createPaymentStrategy("creditcard", "1234-5678-9012-3456");
        context.setPaymentStrategy(creditCard);
        context.executePayment(250.75);

    }
}