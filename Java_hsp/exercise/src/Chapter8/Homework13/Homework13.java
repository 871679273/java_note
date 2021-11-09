package Chapter8.Homework13;

/**
 * @Auther: xhq
 * @Date: 2021-11-09 - 18:11
 * @Description: Chapter8.Homework
 * @version: 1.0
 */
public class Homework13 {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Student("jack",'男',18,"102200");
        people[1] = new Student("rose",'女',17,"102202");
        people[2] = new Teacher("may",'女',40,20);
        people[3] = new Teacher("marry",'女',36,12);

        Homework13.sort(people);

        for (Person person : people) {
            person.printInfo();
        }


    }
    public static void sort(Person[] people){
        Person temp;
        for (int i = 0; i < people.length - 1; i++) {
            for (int j = 0; j < people.length - i - 1; j++) {
                if(people[j].getAge()<people[j+1].getAge()){
                    temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }
    public static String work(Person person){
        if(person instanceof Student){
            return ((Student)person).play();
        }else if (person instanceof Teacher){
            return ((Teacher)person).play();
        }else{
            return "输入对象错误";
        }
    }
}
class Person{
    private String name;
    private char sex;
    private int age;

    public Person() {
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String play(){
        return name + "爱玩";
    }

    public String basicInfo(){
        return "姓名："+name+"\n年龄："+age+"\n性别："+sex;
    }
    public void printInfo(){};
}
class Student extends Person{
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    public void study(){
        System.out.println("我承诺，我会好好学习");
    }

    @Override
    public String play() {
        return super.play()+"足球";
    }
    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println(super.basicInfo());
        System.out.println("学号："+stu_id);
        study();
        System.out.println(play());
        System.out.println("--------------------");

    }

}
class Teacher extends Person{
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    public void teach(){
        System.out.println("我承诺，我会好好教书");
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }
    public void printInfo(){
        System.out.println("老师的信息：");
        System.out.println(super.basicInfo());
        System.out.println("工龄："+work_age);
        teach();
        System.out.println(play());
        System.out.println("--------------------");
    }
}