package GOF.Lab4.Iterator;

public class IteratorPatternDemo {
	
   public static void main(String[] args) {
      NameRepository namesRepository = new NameRepository();

      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
         String name = (String)iter.next();
         System.out.println("Name : " + name);
      } 
      
      
      System.out.println("Move to first");
      Iterator iter = namesRepository.getIterator();
      System.out.println("Name : " + iter.moveToFirst());


      System.out.println("Move to last");
      iter = namesRepository.getIterator();
      System.out.println("Name : " + iter.moveToLast());


      System.out.println("Move to previous");
      iter = namesRepository.getIterator();
      System.out.println("Name : " + iter.next());
      System.out.println("Name : " + iter.previous());

   }
}