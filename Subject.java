public interface Subject {
    void subscribe(Subscriber sub);

    void unsubscribe(Subscriber sub);

    void notifySubs();

    void select(String name);
}
