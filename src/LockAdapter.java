public class LockAdapter implements SmartDevice {
    private OldLockSystem oldLockSystem;

    public LockAdapter(OldLockSystem oldLockSystem) {
        this.oldLockSystem = oldLockSystem;
    }

    @Override
    public void turnOn() {
        System.out.println("[Adapter] Activating old lock system");
        oldLockSystem.activateLock();
    }

    @Override
    public void turnOff() {
        System.out.println("[Adapter] Deactivating old lock system");
        oldLockSystem.deactivateLock();
    }

    @Override
    public String getStatus() {
        return "Old Lock System: Integrated";
    }
}
