import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        devices.forEach(SmartDevice::turnOn);
    }

    public void turnAllOff() {
        devices.forEach(SmartDevice::turnOff);
    }

    public void getSystemStatus() {
        System.out.println("System Status:\n");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }

}
