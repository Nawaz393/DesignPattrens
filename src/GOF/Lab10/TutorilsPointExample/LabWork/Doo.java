package GOF.Lab10.TutorilsPointExample.LabWork;

import java.util.List;

public class Doo extends BaseEmployee implements IEmployee, Observer {
    ChangeScheduleSubject subject;

    String rank;

    public Doo(String name, int salary, String rank, ChangeScheduleSubject subject) {
        super(name, salary);
        this.rank = rank;

        this.subject = subject;

        this.subject.attach(this);
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public double giveBouns(int percentage) {

        return (super.salary / 100) * percentage;
    }

    @Override
    public String toString() {
        return "Doo [" + " name = " + super.name + " , salary=" + super.salary + " ,rank= " + rank + "]";
    }

    @Override
    public List<IEmployee> getSubordinates() {
        return null;

    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

}
