package day13;


import java.time.LocalDate;
import java.util.Calendar;

//Subclass
public sealed class Manager extends Employee permits Executive {

    private double bonus;

    public Manager(String name, LocalDate localDate, double salary, double bonus) {
        super(name, localDate, salary);
        this.bonus = bonus;

    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public final double getSalary() {
        // salary + bonus
       return  this.bonus + super.getSalary();
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + super.getName() + '\'' +
                ", localDate=" + super.getLocalDate() +
                ", salary=" + super.getSalary() +
                ", bonus=" + this.bonus +
                '}';
    }

    public void fireEmployee(){}
}
