public class NewsSubscriber implements Subscriber {
    private final String name;
    private final SubscriberType type;

    public NewsSubscriber(String name, SubscriberType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return name;
    }

    public SubscriberType getType() {
        return type;
    }

    @Override
    public void update(String news) {
        String icon = type == SubscriberType.MOBILE ? "Phone" :
                type == SubscriberType.WEBSITE ? "Web" : "Email";
        System.out.println(icon + " [" + name + "] → " + news);
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}