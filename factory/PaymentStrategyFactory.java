package factory;

import strategy.CreditCardPayment;
import strategy.PayPalPayment;
import strategy.PaymentStrategy;
import strategy.PixPayment;

public class PaymentStrategyFactory {
    public static PaymentStrategy createPaymentStrategy(String type, String identifier) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(identifier);
            case "paypal":
                return new PayPalPayment(identifier);
            case "pix":
                return new PixPayment(identifier);
            default:
                throw new IllegalArgumentException("Invalid payment strategy type: " + type);
        }
    }
}
