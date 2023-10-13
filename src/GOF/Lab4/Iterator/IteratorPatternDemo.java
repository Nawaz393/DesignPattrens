package GOF.Lab4.Iterator;

public class IteratorPatternDemo {

   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
         Student name = (Student) iter.next();
         System.out.println("Name : " + name.getName() + "RegNo : " + name.getRegNo());
      }

      System.out.println("Move to first");
      Iterator iter = namesRepository.getIterator();
      Student std = (Student) iter.moveToFirst();
      System.out.println("Name : " + std.getName());

      System.out.println("Move to last");
      iter = namesRepository.getIterator();
      Student std2 = (Student) iter.moveToFirst();
      System.out.println("Name : " + std2.getName());

      System.out.println("Move to previous");
      iter = namesRepository.getIterator();
      System.out.println("Name : " + iter.next());
      Student std3 = (Student) iter.moveToFirst();
      System.out.println("Name : " + std3.getName());

   }
}