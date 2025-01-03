package context;

import java.util.ArrayList;
import java.util.List;

public class PaymentContext {
    private static PaymentContext instance;

    private PaymentContext() {}

    public static PaymentContext getInstance() {
        if (instance == null) {
            instance = new PaymentContext();
        }
        return instance;
    }
}
