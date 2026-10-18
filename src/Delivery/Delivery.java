package Delivery;

import Transport.Transport;

public abstract class Delivery {
    protected Transport transport;

    public Delivery(Transport transport){
        this.transport = transport;
    }

    public void setTransport(Transport transport){
        this.transport = transport;
    }
    public abstract void deliverPackage(String packageName);
}
