package GOF.Lab10.TutorilsPointExample.LabWork;

public class BaseEmployee {

    String name;
    int salary;

    public BaseEmployee(String name, int salary) {
        this.salary = salary;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


}
