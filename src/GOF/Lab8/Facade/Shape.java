package GOF.Lab8.Facade;

public abstract class Shape {

   public void draw(String data) {

      String[] items = data.split(",");
      StringBuilder sBuilder = new StringBuilder();

      for (String str : items) {
         sBuilder.append(str.trim()).append(" ");
      }

      System.out.println("Drawing from Shape class: " + sBuilder.toString());
   }

}
