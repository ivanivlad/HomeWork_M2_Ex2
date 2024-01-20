package airport;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LuggageSpace {
    private final Queue<Luggage> cases = new LinkedList<>();
    private final List<Worker> workers = new ArrayList<>();

    public void addWorker(Worker worker) {
        this.workers.add(worker);
    }

    public void arrival(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            cases.add(new Luggage(flightNumber));
        }
    }

    public void unloadLuggage() {
        while (!cases.isEmpty()) {
            for (Worker worker : workers) {
                Luggage luggage = cases.poll();
                if (luggage == null) {
                    return;
                }
                worker.pullBaggage(luggage);
            }
        }
    }
}
