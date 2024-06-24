package org.carlos.eventstore.application;

public interface Subscriber {
    void start();
    void subscribe(String topicName);
}
