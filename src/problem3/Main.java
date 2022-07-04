package problem3;

public class Main {
    public static void main(String[] args) {
        JavaDev user1 = new JavaDev("Maria");
        JavaDev user2 = new JavaDev("Dan");
        JavaDev user3 = new JavaDev("Alex");
        JavaDev user4 = new JavaDev("Diana");

        DevTalks devTalks = new DevTalks();

        user1.subscribe(devTalks);
        user2.subscribe(devTalks);
        user3.subscribe(devTalks);

        devTalks.setMessage("Buy Tichets");
        devTalks.notifyObserver();

        user3.unsubscribe(devTalks);
        user4.subscribe(devTalks);

        devTalks.setMessage("check topics");
        devTalks.notifyObserver();
    }
}
