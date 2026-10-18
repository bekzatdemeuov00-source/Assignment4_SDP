package Facade;

import Delivery.Delivery;
import Delivery.StandartDelivery;
import Delivery.ExpressDelivery;
import Transport.Transport;
import Transport.BikeTransport;
import Transport.DroneTransport;

class DeliveryService {

    public void deliver(String packageName, String deliveryType,
                        String transportType) {

        Transport transport;

        if ("bike".equals(transportType)) {
            transport = new BikeTransport();
        } else if ("drone".equals(transportType)) {
            transport = new DroneTransport();
        } else {
            throw new IllegalArgumentException("Неизвестный транспорт");
        }

        Delivery delivery;

        if ("standard".equals(deliveryType)) {
            delivery = new StandartDelivery(transport);
        } else if ("express".equals(deliveryType)) {
            delivery = new ExpressDelivery(transport);
        } else {
            throw new IllegalArgumentException("Неизвестный тип доставки");
        }

        delivery.deliverPackage(packageName);
    }
}