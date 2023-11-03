package GOF.Lab6.Builder;

public class DietCoke extends ColdDrink {

    @Override
    public String name() {
        return "Diet Coke";
    }

    @Override
    public float price() {
        return 40.0f;
    }

}
