public class LoggingDecorator extends DeviceDecorator {
    public LoggingDecorator(SmartDevice device) { super(device); }
    @Override
    public void turnOn() { System.out.println("[LOG] Turning on"); super.turnOn(); }
    @Override
    public void turnOff() { System.out.println("[LOG] Turning off"); super.turnOff(); }
    @Override
    public String getStatus() {
        return "[LOG] " + super.getStatus();
    }

}
