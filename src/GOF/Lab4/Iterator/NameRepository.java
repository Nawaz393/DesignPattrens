package GOF.Lab4.Iterator;

public class NameRepository implements Container {
   public Student students[] = {

         new Student("Robert", "10"),
         new Student("John", "20"),
         new Student("Laura", "30"),
         new Student("Diana", "40"),
         new Student("Mike", "50")
   };

 

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {

         if (index < students.length) {
            return true;
         }
         return false;
      }

      @Override
      public Object next() {

         if (this.hasNext()) {
            return students[index++];
         }
         return null;
      }

      @Override
      public Object previous() {

         if (students.length > 0) {
            return students[--index];
         }
         return null;
      }

      @Override
      public Object moveToFirst() {
         index = 0;
         return students[index];
      }

      @Override
      public Object moveToLast() {
         index = students.length - 1;
         return students[index];
      }

   }
}