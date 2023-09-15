package Lab1.AdvancedConcepts;

public record Student(String name,String cnic,String regno,String fathername) {

    public Student(String name, String cnic, String regno, String fathername) {
        this.name = name;
        this.cnic = cnic;
        this.regno = regno;
        this.fathername = fathername;
    }


}
