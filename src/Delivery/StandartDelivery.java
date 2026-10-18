package Delivery;

import Transport.Transport;

public class StandartDelivery extends Delivery {
    public StandartDelivery(Transport transport){
        super(transport);
    }
    @Override
    public void deliverPackage(String packageName){
        transport.deliver(packageName, "Standart");
    }
}
