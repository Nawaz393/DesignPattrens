package GOF.Lab6.Builder;

public class SweetDecorater extends TeaDecorater {

    public SweetDecorater(HotDrink drink) {
        super(drink);

    }

    @Override
    public String name() {

        return drink.name() + " with sweetness";
    }

    @Override
    public float price() {
        return drink.price() + 5.0f;
    }

}
