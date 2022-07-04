package problema1.lazyInitialization;

public class Guvern {
    private static volatile Guvern instance;
    public static int nrOfInstances;

    private Guvern() {
        System.out.println("Din constructorul default");
        nrOfInstances++;

    }

    public static Guvern getInstance() {
        if (instance == null) {
            instance = new Guvern();
        }
        return instance;
    }
}
