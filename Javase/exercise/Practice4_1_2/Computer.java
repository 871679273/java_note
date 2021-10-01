package Practice4_1_2;

public class Computer {
     public void show(CPU cpu,HardDisk hardDisk){
         System.out.println("计算机的组成如下：");
         System.out.println("CPU:"+cpu.getBrand()+"   ,主频："+cpu.getHZ());
         System.out.println("硬盘： "+hardDisk.getVolumn());
     }
}
