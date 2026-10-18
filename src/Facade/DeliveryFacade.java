package Facade;

public class DeliveryFacade {

    private final ParcelValidator validator = new ParcelValidator();
    private final PriceCalculator calculator = new PriceCalculator();
    private final DeliveryService deliveryService = new DeliveryService();
    private final PaymentService payment;

    public DeliveryFacade(int balance) {
        payment = new PaymentService(balance);
    }

    public int deliverPackage(String packageName, double weightKg, int distanceKm,
                              String deliveryType, String transportType) {

        validator.validate(
                packageName, weightKg, distanceKm, deliveryType, transportType
        );

        int price = calculator.calculate(
                weightKg, distanceKm, deliveryType, transportType
        );

        payment.pay(price);

        deliveryService.deliver(packageName, deliveryType, transportType);

        return price;
    }

    public int getBalance() {
        return payment.getBalance();
    }
}