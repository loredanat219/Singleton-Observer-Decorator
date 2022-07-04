package problema1.lazyInitialization;

public class Main {
    public static void main(String[] args) {
        Guvern guvern1 = Guvern.getInstance();
        Guvern guvern2 = Guvern.getInstance();
        Guvern guvern3 = Guvern.getInstance();

        System.out.println(guvern1==guvern2);
        System.out.println(guvern2==guvern3);

        System.out.println(Guvern.nrOfInstances);

    }
}
