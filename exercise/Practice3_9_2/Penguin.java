package Practice3_9_2;

public class Penguin extends Pet{
    @Override
    public void eat() {
        System.out.println("企鹅在吃...");
    }

    public void swimming(){
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
        System.out.println("和企鹅玩游泳游戏，企鹅的健康值减少10，不主人亲密度增加5。");
    }
}
