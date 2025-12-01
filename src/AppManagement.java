public class AppManagement {
    public static void main(String[] args) {
        NewsAgency cnn = new NewsAgency("CNN");

        NewsSubscriber saki   = new NewsSubscriber("Saki", SubscriberType.MOBILE);
        NewsSubscriber precy  = new NewsSubscriber("Precy", SubscriberType.MOBILE);
        NewsSubscriber vinz   = new NewsSubscriber("Vinz", SubscriberType.MOBILE);
        NewsSubscriber website = new NewsSubscriber("NEU.com", SubscriberType.WEBSITE);
        NewsSubscriber email   = new NewsSubscriber("NewYorkTimes@company.com", SubscriberType.EMAIL);

        cnn.subscribe(saki);
        cnn.subscribe(precy);
        cnn.subscribe(vinz);
        cnn.subscribe(website);
        cnn.subscribe(email);

        cnn.publish("Earthquake hits California!");

        // Precy leaves
        System.out.println("\n--- Precy leaves ---\n");
        cnn.unsubscribe(precy);

        // Second news — Precy does NOT get it
        cnn.publish("Stock market crashes 10%");

        // New subscriber joins late
        NewsSubscriber bert = new NewsSubscriber("Bert's Watch", SubscriberType.MOBILE);
        cnn.subscribe(bert);

        cnn.publish("DTI's 500 pesos Noche Buena draws criticism online!");
    }
}