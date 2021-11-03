package Chapter8;

/**
 * @Auther: xhq
 * @Date: 2021-11-04 - 0:15
 * @Description: Chapter8
 * @version: 1.0
 */
public class ExtendsExercise03 {


    public static void main(String[] args) {
        PC pc = new PC("i7", "16g", "100TB", "msi");
        NotePad notePad = new NotePad("snapDragon", "8g", "10TB",
                "White");
        System.out.println(pc.getDetails()+"\n"+notePad.getDetails());
    }
}
class Computer{
    private String cpu;
    private String mem;
    private String hardDisk;

    public Computer(){

    }

    public Computer(String cpu, String mem, String hardDisk) {
        this.cpu = cpu;
        this.mem = mem;
        this.hardDisk = hardDisk;
    }

    public String getDetails(){
        return "cpu: "+cpu+" 内存: "+mem+" 硬盘:"+hardDisk;
    }
}

class PC extends Computer{
    private String brand;

    public PC(){

    }

    public PC(String cpu, String mem, String hardDisk, String brand) {
        super(cpu, mem, hardDisk);
        this.brand = brand;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" 品牌："+brand;
    }
}

class NotePad extends Computer{
    private String color;

    public NotePad(){

    }

    public NotePad(String cpu, String mem, String hardDisk, String color){
        super(cpu, mem, hardDisk);
        this.color = color;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" 颜色："+color;
    }
}