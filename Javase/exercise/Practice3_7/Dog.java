package Practice3_7;

public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;

    public Dog(){

    }
    public Dog(String name,int health,String strain){
        this.name = name;
        this.health = health;
        this.strain = strain;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setHealth(int health) {
        if(health>=1 && health<=100){
            this.health = health;
        }else{
            System.out.println("输入错误");
        }
    }
    public int getHealth(){
        return this.health;
    }
    public void setStrain(String strain) {
        this.strain = strain;
    }
    public String getStrain() {
        return strain;
    }

    public void show(){
        System.out.println("name: "+this.name);
        System.out.println("health: "+this.health);
        System.out.println("love: "+this.love);
        System.out.println("strain: "+this.strain);
    }
}
