package GOF.Lab4.Iterator;

public class Student {

    String Name;
    String RegNo;

    public Student(String Name, String RegNo) {
        this.Name = Name;
        this.RegNo = RegNo;
    }

    public String getName() {
        return Name;
    }

    public String getRegNo() {
        return RegNo;
    }

}
