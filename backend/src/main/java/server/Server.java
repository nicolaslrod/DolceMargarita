package server;

import backend.entities.chocolates.Chocolate;
import backend.service.ServiceChocolate;
import org.uqbar.xtrest.api.Result;
import org.uqbar.xtrest.api.annotation.Body;
import org.uqbar.xtrest.api.annotation.Get;
import org.uqbar.xtrest.api.annotation.Post;
import org.uqbar.xtrest.http.ContentType;
import org.uqbar.xtrest.json.JSONUtils;
import org.eclipse.jetty.server.Request;
import org.uqbar.xtrest.result.ResultFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.uqbar.xtrest.result.ResultFactory.ok;

public class Server extends ResultFactory{

    private ServiceChocolate servicioDeChocolates;
    private JSONUtils JSONUtils;


    public Server(ServiceChocolate servicioDeChocolates) {
        this.JSONUtils = new JSONUtils();
        this.servicioDeChocolates = servicioDeChocolates;

    }

    @Get("/chocolates")
    public Result getChocolates(final String target, final Request baseRequest,
                             final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        List<Chocolate> data = this.servicioDeChocolates.getChocolates();

        return ResultFactory.ok(this.JSONUtils.toJson(data));
    }

    @Post("/pedidos")
    public Result agregarPedido(final String target, final Request baseRequest,
                                final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        List<Chocolate> data = this.servicioDeChocolates.getChocolates();

        return ResultFactory.ok(this.JSONUtils.toJson(data));
    }

    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Matcher matcher =
                Pattern.compile("/chocolates").matcher(target);
        if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches()) {
            // take parameters from request

            // take variables from url

            // set default content type (it can be overridden during next call)
            response.setContentType("application/json");

            Result result = getChocolates(target, baseRequest, request, response);
            result.process(response);

            response.addHeader("Access-Control-Allow-Origin", "*");
            baseRequest.setHandled(true);
            return;
        }
    }
}
