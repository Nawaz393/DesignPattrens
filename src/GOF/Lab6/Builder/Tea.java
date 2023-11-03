package GOF.Lab6.Builder;

public class Tea extends HotDrink {

    @Override
    public String name() {
        return "Tea";
    }

    @Override
    public float price() {
        return 70.0f;
    }

}
