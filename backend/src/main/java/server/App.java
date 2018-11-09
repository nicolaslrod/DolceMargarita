package server;

import backend.service.ServiceChocolate;
import org.eclipse.jetty.server.Handler;
import org.uqbar.xtrest.api.XTRest;

@SuppressWarnings("all")
public class App {
    public static void main(final String[] args) {
        Server _restfulServer = new Server(new ServiceChocolate());
        XTRest.startInstance(9003,  _restfulServer);
    }
}
