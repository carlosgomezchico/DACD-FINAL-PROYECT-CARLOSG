package org.carlos.businessunit.service;

public interface EventStore {
    void storeEvent(String json, String topicName);
}
