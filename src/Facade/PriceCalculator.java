package Facade;

class PriceCalculator {

    private static final int BASE_PRICE = 500;
    private static final int PRICE_PER_KM = 100;
    private static final int PRICE_PER_KG = 200;
    private static final int EXPRESS_EXTRA = 500;
    private static final int DRONE_EXTRA = 300;

    public int calculate(double weightKg, int distanceKm,
                         String deliveryType, String transportType) {

        int chargedWeight = (int) Math.ceil(weightKg);

        int price = BASE_PRICE
                + distanceKm * PRICE_PER_KM
                + chargedWeight * PRICE_PER_KG;

        if ("express".equals(deliveryType)) {
            price += EXPRESS_EXTRA;
        }

        if ("drone".equals(transportType)) {
            price += DRONE_EXTRA;
        }

        return price;
    }
}