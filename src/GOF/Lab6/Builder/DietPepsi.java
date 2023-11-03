package GOF.Lab6.Builder;

public class DietPepsi extends ColdDrink {

    @Override
    public String name() {
        return "Diet Pepsi";
    }

    @Override
    public float price() {
        return 40.0f;
    }

}
