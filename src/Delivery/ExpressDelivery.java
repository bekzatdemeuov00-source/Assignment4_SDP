package Delivery;

import Transport.Transport;

public class ExpressDelivery extends Delivery {
    public ExpressDelivery(Transport transport){
        super(transport);
    }
    @Override
    public void deliverPackage(String packageName){
        transport.deliver(packageName, "Express");
    }
}
