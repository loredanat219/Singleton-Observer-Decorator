package problem2;

public class FriesMenuDecorator extends MenuDecorator {
    public FriesMenuDecorator(Menu menu) {
        super(menu);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("adding fries");
    }
}
