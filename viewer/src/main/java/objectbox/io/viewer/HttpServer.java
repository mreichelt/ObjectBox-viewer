package objectbox.io.viewer;

import java.io.IOException;
import java.util.List;

import fi.iki.elonen.NanoHTTPD;
import io.objectbox.Box;

public class HttpServer extends NanoHTTPD {

    private final Box<?> box;

    public HttpServer(Box<?> box) throws IOException {
        super(8912);
        this.box = box;
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }

    @Override
    public Response serve(IHTTPSession session) {
        String msg = "<html><body><h1>Notes:</h1><ul>\n";
        List<?> all = box.getAll();
        for (Object o : all) {
            msg += "<li>" + o.toString() + "</li>\n";
        }
        return newFixedLengthResponse(msg + "</ul></body></html>\n");
    }

}
