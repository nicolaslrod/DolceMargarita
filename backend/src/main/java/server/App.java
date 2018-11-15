package server;



import org.uqbar.xtrest.api.XTRest;

@SuppressWarnings("all")
public class App {
    public static void main(final String[] args) {
        Server _restfulServer = new Server();
        XTRest.startInstance(9003,  _restfulServer);
    }
}
