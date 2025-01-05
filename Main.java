import context.PaymentContext;
import factory.PaymentStrategyFactory;
import observer.AuditLogger;
import observer.NotificationService;
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

        // Creating a paypal payment using the Factory pattern.
        PaymentStrategy paypal = PaymentStrategyFactory.createPaymentStrategy("paypal", "user@example.com");
        context.setPaymentStrategy(paypal);
        context.executePayment(155.25);

        // Creating a pix payment using the Factory pattern.
        PaymentStrategy pix = PaymentStrategyFactory.createPaymentStrategy("pix", "123.456.789-00");
        context.setPaymentStrategy(pix);
        context.executePayment(550.25);
    }
}