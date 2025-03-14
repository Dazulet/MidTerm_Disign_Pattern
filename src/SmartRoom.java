import java.util.ArrayList;
import java.util.List;

public class SmartRoom implements SmartDevice {
    private List<SmartDevice> devices = new ArrayList<>();
    public void addDevice(SmartDevice device) { devices.add(device); }
    @Override
    public void turnOn() { devices.forEach(SmartDevice::turnOn); }
    @Override
    public void turnOff() { devices.forEach(SmartDevice::turnOff); }
    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder("Room Status:\n");
        for (SmartDevice device : devices) {
            status.append(device.getStatus()).append("");
            System.out.println();
        }
        return status.toString();
    }

}