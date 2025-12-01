import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private final String name;
    private final List<Subscriber> subscribers = new ArrayList<>();

    public NewsAgency(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subscriber s) {
        subscribers.add(s);
        System.out.println(s + " subscribed!");
    }

    @Override
    public void unsubscribe(Subscriber s) {
        if (subscribers.remove(s)) {  // Removes by reference — always works!
            System.out.println(s + " unsubscribed.");
        }
    }

    @Override
    public void notifySubscribers(String news) {
        System.out.println("\n" + name + " BREAKING NEWS: " + news);
        System.out.println("Notifying " + subscribers.size() + " subscriber(s)...\n");

        // Safe copy — prevents issues if someone unsubscribes during notification
        for (Subscriber s : new ArrayList<>(subscribers)) {
            s.update(news);
        }
    }

    // Easy way to publish
    public void publish(String news) {
        notifySubscribers(news);
    }
}