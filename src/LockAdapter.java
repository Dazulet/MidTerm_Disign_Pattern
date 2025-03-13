public class LockAdapter implements SmartDevice {
    private OldLockSystem oldLockSystem;
    public LockAdapter(OldLockSystem oldLockSystem) { this.oldLockSystem = oldLockSystem; }
    public void turnOn() { oldLockSystem.activateLock(); }
    public void turnOff() { oldLockSystem.deactivateLock(); }
    public String getStatus() { return "Old Lock System: Integrated"; }
}
