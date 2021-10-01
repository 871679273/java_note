package Practice4_1_2;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new InterCpu(); //多态
        HardDisk kingstonHardDisk = new KingstonHardDisk(); //多态
        computer.show(cpu,kingstonHardDisk);

    }
}
