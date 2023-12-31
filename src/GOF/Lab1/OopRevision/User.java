package GOF.Lab1.OopRevision;


// this class demonstrate encapsulation
public class User {




    private String fullName;
    private String email;
    private  String address;
    private  String password;
    private  int age;

    public User(String fullName, String email, String address, String password, int age) {
        this.fullName = fullName;
        this.email = email;
        this.address = address;
        this.password = password;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
