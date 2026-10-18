import Facade.DeliveryFacade;

public class Main {
    public static void main(String[] args) {
        DeliveryFacade facade = new DeliveryFacade(10000);

        try {
            int laptopPrice = facade.deliverPackage(
                    "laptop", 1.5, 5, "standard", "bike"
            );
            System.out.println("Цена: " + laptopPrice);

            int phonePrice = facade.deliverPackage(
                    "phone", 0.3, 4, "express", "drone"
            );
            System.out.println("Цена: " + phonePrice);

            int tabletPrice = facade.deliverPackage(
                    "tablet", 0.7, 6, "standard", "drone"
            );
            System.out.println("Цена: " + tabletPrice);

            System.out.println("Остаток: " + facade.getBalance());

        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}