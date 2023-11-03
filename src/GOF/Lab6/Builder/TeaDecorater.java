package GOF.Lab6.Builder;

public abstract class TeaDecorater extends HotDrink {

    HotDrink drink;

    public TeaDecorater(HotDrink drink) {

        this.drink = drink;
    }

    @Override
    public String name() {
        return drink.name();
    }

    @Override
    public float price() {
        return drink.price();
    }
}
