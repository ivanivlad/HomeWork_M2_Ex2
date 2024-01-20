package airport;

public class Worker {
    private final String name;

    public Worker(String name) {
        this.name = name;
    }

    public void pullBaggage(Luggage luggage) {
        System.out.printf("{%s}: Мужики, ловите чемодан %s \n", name, luggage.getFlightNumber());
    }
}
