package io.objectbox.viewer.sampleapp;

import android.app.Application;

import io.objectbox.BoxStore;
import objectbox.io.viewer.ObjectBoxViewer;

public class App extends Application {

    private BoxStore boxStore;
    private static App app;

    @Override
    public void onCreate() {
        super.onCreate();
        boxStore = MyObjectBox.builder().androidContext(this).build();
        app = this;

        ObjectBoxViewer.init(boxStore, Note.class);
    }

    public static App get() {
        return app;
    }

    public BoxStore boxStore() {
        return boxStore;
    }

}
