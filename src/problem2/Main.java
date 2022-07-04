package problem2;


public class Main {
    public static void main(String[] args) {
        BasicMenu basicMenu = new BasicMenu();
        basicMenu.prepare();

        System.out.println("=========");

        Menu friesMenu = new FriesMenuDecorator(basicMenu);
        Menu drinkMenu = new DrinkMenuDecorator(basicMenu);
        Menu fullMenu = new SauceMenuDecorator(drinkMenu);
        fullMenu.prepare();
    }
}
