package GOF.Lab13.FactoryMethod.WikipediaExample;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        PersonFactory factory =new PersonFactory();


        List<IPerson> persons=new ArrayList<>();

        persons.add(factory.getPerson(PersonType.Rural));
        persons.add(factory.getPerson(PersonType.Urban));


        for(IPerson person:persons){

            System.out.println( person.getName());
        }
    }



}
