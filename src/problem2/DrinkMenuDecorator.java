package problem2;

public class DrinkMenuDecorator extends  MenuDecorator{
    public DrinkMenuDecorator(Menu menu) {
        super(menu);
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("adding drinks");
    }
}
