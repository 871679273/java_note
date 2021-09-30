package Practice3_9_2;

public abstract class Pet {
    private int health;
    private int love;

    public Pet(){

    }
    public Pet(int health, int love) {
        this.health = health;
        this.love = love;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public abstract void eat();
    public void show(){
        System.out.println("健康值："+this.health);
        System.out.println("亲密度："+this.love);
    }
}
