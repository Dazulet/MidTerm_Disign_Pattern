public class Light implements SmartDevice {
    private boolean isOn = false;
    @Override
    public void turnOn() { isOn = true; System.out.println("Light is ON"); }
    @Override
    public void turnOff() { isOn = false; System.out.println("Light is OFF"); }
    @Override
    public String getStatus() {
        if (isOn) {
            return "Light: ON";
        } else {
            return "Light: OFF";
        }
    }
}
