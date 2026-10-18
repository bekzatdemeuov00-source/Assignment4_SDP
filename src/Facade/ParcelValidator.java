package Facade;

class ParcelValidator {

    public void validate(String packageName, double weightKg, int distanceKm,
                         String deliveryType, String transportType) {

        if (packageName == null || packageName.isBlank()) {
            throw new IllegalArgumentException("Название посылки обязательно");
        }

        if (!Double.isFinite(weightKg) || weightKg <= 0 || weightKg > 20) {
            throw new IllegalArgumentException(
                    "Вес должен быть больше 0 и не больше 20 кг"
            );
        }

        if (distanceKm <= 0 || distanceKm > 50) {
            throw new IllegalArgumentException(
                    "Расстояние должно быть от 1 до 50 км"
            );
        }

        if (!"standard".equals(deliveryType) && !"express".equals(deliveryType)) {
            throw new IllegalArgumentException(
                    "Тип доставки: standard или express"
            );
        }

        if (!"bike".equals(transportType) && !"drone".equals(transportType)) {
            throw new IllegalArgumentException(
                    "Транспорт: bike или drone"
            );
        }

        if ("drone".equals(transportType) && (weightKg > 2 || distanceKm > 15)) {
            throw new IllegalArgumentException(
                    "Дрон перевозит до 2 кг на расстояние до 15 км"
            );
        }
    }
}