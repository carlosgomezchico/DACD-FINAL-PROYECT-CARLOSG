package org.carlos.businessunit;

import org.carlos.businessunit.infrastructure.SQLiteConnector;
import org.carlos.businessunit.infrastructure.SubscribersSetup;
import org.carlos.businessunit.infrastructure.*;
import java.io.IOException;
import static org.carlos.businessunit.infrastructure.HttpServer.startHttpServer;

public class Main {

    public static void main(String[] args) throws IOException {
        SQLiteConnector.createNewTable();
        SubscribersSetup.initializeSubscribers();
        startHttpServer();
    }
}
