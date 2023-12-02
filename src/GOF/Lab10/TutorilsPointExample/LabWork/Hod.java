package GOF.Lab10.TutorilsPointExample.LabWork;

import java.util.ArrayList;
import java.util.List;

public class Hod extends BaseEmployee implements IEmployee, Container,Observer{

    String department;
    List<IEmployee> subordinates;
    ChangeScheduleSubject subject;


    public Hod(String name, int salary, String departments,ChangeScheduleSubject subject) {
        super(name, salary);
        this.department = departments;
        subordinates = new ArrayList<>();
        this.subject=subject;
        this.subject.attach(this);

    }

    public String getDepartments() {
        return department;
    }

    public void setDepartments(String departments) {
        this.department = departments;
    }

    public void remove(IEmployee employee) {
        this.subordinates.remove(employee);
    }

    public List<IEmployee> getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(IEmployee subordinate) {
        this.subordinates.add(subordinate);
    }

    @Override
    public double giveBouns(int percentage) {
        return (super.salary / 100) * percentage;
    }

    @Override
    public String toString() {
        return "Hod [" + ", name =" + super.name + ", salary=" + super.salary + ", deparment= " + department + "]";
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
