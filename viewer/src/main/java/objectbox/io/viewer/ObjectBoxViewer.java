package objectbox.io.viewer;

import java.io.IOException;

import io.objectbox.BoxStore;

public class ObjectBoxViewer {

    static HttpServer httpServer;

    public static void init(BoxStore boxStore, Class clazz) {
        try {
            httpServer = new HttpServer(boxStore.boxFor(clazz));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
