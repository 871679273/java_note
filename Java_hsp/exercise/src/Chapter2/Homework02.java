package Chapter2;

/**
 * @Auther: xhq
 * @Date: 2021-10-31 - 6:58
 * @Description: Chapter2
 * @version: 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        Person lisi = new Person("李四","男","广东","广州");
        System.out.println(lisi);
    }
}
class Person{
    private String name;
    private String gender;
    private String jg;
    private String address;

    public Person(String name, String gender, String jg, String address) {
        this.name = name;
        this.gender = gender;
        this.jg = jg;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getJg() {
        return jg;
    }

    public void setJg(String jg) {
        this.jg = jg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "[姓名："+this.name+", 性别："+this.gender+", 籍贯："+jg+", 住址："+this.address+"]";
    }
}