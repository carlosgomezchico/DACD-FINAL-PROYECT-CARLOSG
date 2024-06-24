package org.carlos.eventstore.application;

public interface EventStore {
    void storeEventToFile(String json, String topicName);
}
