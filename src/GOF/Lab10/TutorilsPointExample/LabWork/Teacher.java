package GOF.Lab10.TutorilsPointExample.LabWork;

import java.util.List;

public class Teacher extends BaseEmployee implements IEmployee, Observer {

    String qualification;
    String status;
    ChangeScheduleSubject subject;

    public Teacher(String name, int salary, String qualification, String status, ChangeScheduleSubject subject) {
        super(name, salary);
        this.qualification = qualification;
        this.status = status;
        this.subject = subject;

        this.subject.attach(this);
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public double giveBouns(int percentage) {

        return (super.salary / 100) * percentage;
    }

    @Override
    public String toString() {
        return "Teacher [" + " ,name =" + super.name + ", salary=" + super.salary + ", qualification=" + qualification
                + ", status=" + status + "]";
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
