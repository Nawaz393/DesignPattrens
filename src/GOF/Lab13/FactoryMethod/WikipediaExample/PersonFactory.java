package GOF.Lab13.FactoryMethod.WikipediaExample;

public class PersonFactory {

public  IPerson getPerson (PersonType type){

    return  switch (type){
        case Rural -> new Villager();
        case Urban -> new CityPerson();
    };
}

}
