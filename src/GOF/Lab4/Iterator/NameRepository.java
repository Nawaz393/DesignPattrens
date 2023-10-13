package GOF.Lab4.Iterator;

public class NameRepository implements Container {
   public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }

   private class NameIterator implements Iterator {

      int index;

      @Override
      public boolean hasNext() {
      
         if(index < names.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return names[index++];
         }
         return null;
      }

      @Override
      public Object previous() {

         if(names.length>0){
            return names[--index];
         }
         return null;
      }

      @Override
      public Object moveToFirst() {
        index = 0;
        return names[index];
      }

      @Override
      public Object moveToLast() {
         index = names.length-1;
         return names[index];
      }
      
      
      
   }
}