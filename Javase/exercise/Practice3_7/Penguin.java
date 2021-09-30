package Practice3_7;

public class Penguin {
    private String name;
    private int health;
    private int love;
    private String sex;
    static String SEX_MALE = "Q仔";
    static String SEX_FEMALE = "Q妹";

    public Penguin(){

    }
    public Penguin(String name,int health,String sex){
        this.name = name;
        this.health = health;
        this.sex = sex;
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
    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public void show(){
        System.out.println("name: "+this.name);
        System.out.println("health: "+this.health);
        System.out.println("love: "+this.love);
        System.out.println("sex: "+this.sex);
    }
}
