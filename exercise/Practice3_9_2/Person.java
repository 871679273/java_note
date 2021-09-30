package Practice3_9_2;

public class Person {

//    public void feed(Dog dog){
//        dog.feed();
//    }
//    public void feed(Cat cat){
//        cat.feed();
//    }
    public void feed(Pet pet){
        pet.eat();
    }

    public Pet buyPet(int type){
        if(type==1){
            return new Dog();
        }else if (type==2){
            return new Cat();
        }else {
            return new Penguin();
        }
    }

    public void play(Pet pet){
        if(pet instanceof Dog){
            Dog dog = (Dog)pet;
            dog.catchingFlyDisc();
        }else if (pet instanceof Penguin){
            Penguin penguin = (Penguin) pet;
            penguin.swimming();
        }
    }

    public static void main(String[] args) {

        // test1
//        Person p = new Person();
//        Pet dog = new Dog();
//        Pet cat = new Cat();
//        Pet penguin = new Penguin();
//        p.feed(dog);
//        p.feed(cat);
//        p.feed(penguin);

        // test2
//        Pet pet = p.buyPet(1);
//        if(pet instanceof Dog){
//            System.out.println("买的是一只狗");
//        }else if(pet instanceof Cat){
//            System.out.println("买的是一只猫");
//        }else {
//            System.out.println("买的是一只企鹅");
//        }

        // test3
        Pet pet = new Penguin();
        Person p = new Person();
        p.play(pet);
        pet.show();
    }
}

