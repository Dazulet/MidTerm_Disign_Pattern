public class BasicSmartHomeFactory implements SmartHomeFactory {
    public Light createLight() { return new Light(); }
    public Thermostat createThermostat() { return new Thermostat(); }
}