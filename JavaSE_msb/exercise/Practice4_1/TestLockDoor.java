package Practice4_1;

public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor = new LockDoor();
        lockDoor.openLock();
        lockDoor.openDoor();
        lockDoor.closeDoor();
        lockDoor.closeLock();
        lockDoor.photo();
    }
}
