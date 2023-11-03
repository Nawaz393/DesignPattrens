package GOF.Lab6.Builder;

public  class CreamDecorater extends TeaDecorater {

    public CreamDecorater(HotDrink drink) {
        super(drink);

    }

    @Override
    public String name() {

        return drink.name() + "  added Cream";
    }

    @Override
    public float price() {
        return drink.price() + 20.0f;
    }

}
