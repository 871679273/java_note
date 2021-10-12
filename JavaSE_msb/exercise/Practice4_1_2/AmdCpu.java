package Practice4_1_2;

public class AmdCpu implements CPU{
    @Override
    public String getBrand() {
        return "AMD";
    }

    @Override
    public String getHZ() {
        return "2.6GHz";
    }
}
