package factory;

import strategy.CreditCardPayment;
import strategy.PaymentStrategy;

public class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(String type, String identifier) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(identifier);
            default:
                throw new IllegalArgumentException("Invalid payment strategy type: " + type);
        }
    }
}
