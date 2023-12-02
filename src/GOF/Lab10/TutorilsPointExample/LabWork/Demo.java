package GOF.Lab10.TutorilsPointExample.LabWork;

public class Demo {

    public static void visit(IEmployee node) {
        System.out.println(node.toString());
    }

    public static void main(String[] args) throws InterruptedException {
        EmployeeController controller = new EmployeeController();
        ChangeScheduleSubject subject = new ChangeScheduleSubject();
        controller.getOrganogram(subject);

        Director director = (Director) controller.getRoot();
        Iterator iter = director.getIterator();
        System.out.println(">>>>>>>>>>>>>>>>>>>> post order traversel >>>>>>>>>>>>>>>>>>");
        iter.postOrder();

        while (iter.hasNext()) {
            visit(iter.next());
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>> pre order traversel >>>>>>>>>>>>>>>>>>");
        iter.preOrder();

        while (iter.hasNext()) {
            visit(iter.next());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>> in order traversel >>>>>>>>>>>>>>>>>>");
        iter.preOrder();

        while (iter.hasNext()) {
            visit(iter.next());
        }

        System.out.println(">>>>>>>>>>>>>>>>>>>> activating bouns >>>>>>>>>>>>>>>>>>");

        controller.activateBonus("Eid Bonus", 10);

        System.out.println(">>>>>>>>>>>>>>>>>>>> observer starting " +
                ">>>>>>>>>>>>>>>>>>");

        Thread.sleep(1000);

        for (int i = 0; i < 5; i++) {
            subject.setMessage("schedule change no: " + (i + 1));
            Thread.sleep(500);
        }

    }
}
