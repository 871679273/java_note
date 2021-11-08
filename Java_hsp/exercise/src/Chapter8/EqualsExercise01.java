package Chapter8;

/**
 * @Auther: xhq
 * @Date: 2021-11-08 - 17:33
 * @Description: Chapter8
 * @version: 1.0
 */
public class EqualsExercise01 {
    public static void main(String[] args) {
        Person john = new Person("John", 23, '男');
        Person john2 = new Person("John", 23, '男');
        Person marry = new Person("Marry", 22, '女');

        System.out.println(john.equals(john2));
        System.out.println(john.equals(marry));
    }
}
class Person{
    private String name;
    private int age;
    private char gender;

    public Person() {
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            Person person = (Person) obj;
            return name.equals(person.getName())
                    && age==person.getAge()
                    && gender==person.getGender();
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}