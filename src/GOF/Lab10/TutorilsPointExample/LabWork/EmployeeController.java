package GOF.Lab10.TutorilsPointExample.LabWork;

public class EmployeeController {

    IEmployee root;

    public void getOrganogram(ChangeScheduleSubject subject) {

        Teacher teacher1 = new Teacher("mnk", 10000, "ms", "active", subject);
        Teacher teacher2 = new Teacher("mnk", 10000, "ms", "active", subject);
        Teacher teacher3 = new Teacher("mnk", 10000, "ms", "active", subject);
        Teacher teacher4 = new Teacher("mnk", 10000, "ms", "active", subject);
        Doo doo1 = new Doo("irfan", 150000, "doo1", subject);
        Doo doo2 = new Doo("khan", 150000, "doo2", subject);
        Hod hod1 = new Hod("njb", 200000, "cs", subject);
        Hod hod2 = new Hod("salman", 200000, "eee", subject);
        Director director = new Director("dum,mmy", 5000000, subject);
        hod1.setSubordinates(teacher1);
        hod1.setSubordinates(teacher2);
        hod1.setSubordinates(doo1);
        hod2.setSubordinates(teacher3);
        hod2.setSubordinates(teacher4);
        hod2.setSubordinates(doo2);
        director.setSubordinate(hod1);
        director.setSubordinate(hod2);
        root = director;

    }

    public void activateBonus(String type, int percentage) {
        Iterator iter = ((Director) root).getIterator();

        iter.preOrder();

        while (iter.hasNext()) {

            IEmployee person = iter.next();
            System.out.println(person.toString() + " ,bounus type: " + type + " ,bonus amount: "
                    + person.giveBouns(percentage));

        }

    }

    public IEmployee getRoot() {
        return root;
    }
}
