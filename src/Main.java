public class Main {
    public static void main(String[] args) {
        SmartHomeFactory factory = new AdvancedSmartHomeFactory();
        SmartHomeController controller = new SmartHomeController();

        SmartDevice light = factory.createLight();
        SmartDevice thermostat = factory.createThermostat();
        SmartDevice lock = new LockAdapter(new OldLockSystem());

        SmartRoom livingRoom = new SmartRoom();
        livingRoom.addDevice(light);
        livingRoom.addDevice(thermostat);

        controller.addDevice(livingRoom);
        controller.addDevice(lock);

        controller.turnAllOn();
        controller.getSystemStatus();
        controller.turnAllOff();
    }
}
