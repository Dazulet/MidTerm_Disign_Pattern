public class AdvancedSmartHomeFactory implements SmartHomeFactory {
    public SmartDevice createLight() { return new LoggingDecorator(new Light()); }
    public Thermostat createThermostat() { return new Thermostat(); }
}
