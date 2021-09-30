package Practice3_9_2;

public class Dog extends Pet{

    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    public void catchingFlyDisc(){
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
        System.out.println("和狗狗玩接飞盘游戏，狗狗的健康值减少10，不主人亲密度增加5。");
    }
}
