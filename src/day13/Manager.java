package day13;


import java.time.LocalDate;

//Subclass
public sealed class Manager extends Employee permits Executive {

    private double bonus;

    public Manager(String name, LocalDate localDate, double salary, double bonus) {
        super(name, localDate, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
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
}
