package Chapter8.Homework;

/**
 * @Auther: xhq
 * @Date: 2021-11-09 - 14:54
 * @Description: Chapter8.Homework
 * @version: 1.0
 */
public class Homework04 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 500, 365, 1.2, 30000);
        NormalEmployee john = new NormalEmployee("john", 300, 365, 1.0);
        jack.print();
        john.print();
    }
}
class Employee{
    private String name = "";
    private double dayIncome = 0;
    private int days = 0;
    private double grade = 1.0;

    public Employee() {
    }

    public Employee(String name, double dayIncome, int days, double grade) {
        this.name = name;
        this.dayIncome = dayIncome;
        this.days = days;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDayIncome() {
        return dayIncome;
    }

    public void setDayIncome(double dayIncome) {
        this.dayIncome = dayIncome;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    //打印工资
    public void print(){
        System.out.println(name+"工资金额："+dayIncome*days*grade);
    }
}
class Manager extends Employee{
    private double bonus = 0;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double dayIncome, int days, double grade, double bonus) {
        super(name, dayIncome, days, grade);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void print() {
        System.out.println("经理：");
        System.out.println(getName()+"工资金额："+(getBonus()+getDayIncome()*getDays()*getGrade()));
    }
}
class NormalEmployee extends Employee{
    public NormalEmployee() {
    }

    public NormalEmployee(String name, double dayIncome, int days, double grade) {
        super(name, dayIncome, days, grade);
    }

    @Override
    public void print() {
        System.out.println("普通员工：");
        super.print();
    }
}