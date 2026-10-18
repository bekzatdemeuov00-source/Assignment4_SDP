package Transport;

public class DroneTransport implements Transport {
    @Override
    public void deliver(String packageName, String deliveryType) {
        System.out.println(deliveryType + " delivery of " + packageName + " by drone");
    }
}
