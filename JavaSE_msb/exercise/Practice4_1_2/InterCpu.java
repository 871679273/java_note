package Practice4_1_2;

public class InterCpu implements CPU{
    private String brand = "inter";
    private String hz = "3.8GHz";


    public InterCpu() {

    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    @Override
    public String getHZ() {
        return this.hz;
    }
}
