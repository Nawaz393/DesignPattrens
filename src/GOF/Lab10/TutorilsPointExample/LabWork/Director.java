package GOF.Lab10.TutorilsPointExample.LabWork;

import java.util.ArrayList;
import java.util.List;

public class Director extends BaseEmployee implements IEmployee, Container, Observer {
    List<IEmployee> subordinates;
    ChangeScheduleSubject subject;

    public Director(String name, int salary, ChangeScheduleSubject subject) {
        super(name, salary);
        subordinates = new ArrayList<>();
        this.subject = subject;
        this.subject.attach(this);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    public void remove(IEmployee employee) {
        this.subordinates.remove(employee);
    }

    public void setSubordinate(IEmployee subordinate) {
        this.subordinates.add(subordinate);
    }

    @Override
    public double giveBouns(int percentage) {

        return (super.salary / 100) * percentage;
    }

    @Override
    public String toString() {
        return "Director [name= " + super.name + " , salary= " + super.salary + "]";
    }

    @Override
    public Iterator getIterator() {
        return new EmployeeIterator(this);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

}
