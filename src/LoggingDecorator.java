public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) {
        super(device);
    }

    @Override
    public void turnOn() {
        System.out.println("INFO: Turning on " + decoratedDevice.toString());
        super.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("INFO: Turning off " + decoratedDevice.toString());
        super.turnOff();
    }

    @Override
    public String getStatus() {
        return "INFO: " + super.getStatus();
    }
}
