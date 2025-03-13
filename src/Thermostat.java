public class Thermostat implements SmartDevice {
    private int temperature = 22;
    @Override
    public void turnOn() { System.out.println("Thermostat is active"); }
    @Override
    public void turnOff() { System.out.println("Thermostat is inactive"); }
    public void setTemperature(int temp) { temperature = temp; }
    @Override
    public String getStatus() { return "Thermostat: " + temperature + "C"; }
}
