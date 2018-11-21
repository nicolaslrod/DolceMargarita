package server;

import backend.entities.Pedido;
import backend.entities.chocolates.Chocolate;
import backend.service.ServiceChocolate;
import backend.service.ServiceForma;
import backend.service.ServiceTamanio;
import backend.service.ServiceTipoChocolate;
import org.uqbar.xtrest.api.Result;
import org.uqbar.xtrest.api.annotation.Body;
import org.uqbar.xtrest.api.annotation.Get;
import org.uqbar.xtrest.api.annotation.Post;
import org.uqbar.xtrest.http.ContentType;
import org.uqbar.xtrest.json.JSONUtils;
import org.eclipse.jetty.server.Request;
import org.uqbar.xtrest.result.ResultFactory;
import server.frontClasses.FormaFront;
import server.frontClasses.TamanioFront;
import server.frontClasses.TipoChocolateFront;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Server extends ResultFactory {

    private ServiceChocolate servicioDeChocolates;
    private ServiceForma formas;
    private ServiceTipoChocolate tiposChocolate;
    private JSONUtils JSONUtils;
    private ServiceTamanio tamanio;


    public Server() {
        this.JSONUtils = new JSONUtils();
        this.servicioDeChocolates = new ServiceChocolate();
        this.formas = new ServiceForma();
        this.tiposChocolate = new ServiceTipoChocolate();
        this.tamanio = new ServiceTamanio();

    }


    @Get("/tiposChocolate")
    public Result getTiposChocolate(final String target, final Request baseRequest,
                                    final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        List<TipoChocolateFront> data =
                this.tiposChocolate.recuperarTodos().stream().map(t -> new TipoChocolateFront
                        (t.getClass().getSimpleName(), t.getImg())).collect(Collectors.toList());



        return ResultFactory.ok(this.JSONUtils.toJson(data));
    }

    @Get("/chocolates")
    public Result getChocolates(final String target, final Request baseRequest,
                                final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        List<Chocolate> data = this.servicioDeChocolates.getChocolates();


        return ResultFactory.ok(this.JSONUtils.toJson(data));
    }

    @Get("/tamanios")
    public Result getTamanios(final String target, final Request baseRequest,
                                final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        List<TamanioFront> data =
                this.tamanio.recuperarTodos().stream().map( t -> new TamanioFront
                        (t.getClass().getSimpleName(), t.getImg())).collect(Collectors.toList());


        return ResultFactory.ok(this.JSONUtils.toJson(data));
    }

    @Get("/formas")
    public Result getFormas(final String target, final Request baseRequest,
                                final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        List<FormaFront> data =
                this.formas.recuperarTodos().stream().map(t -> new FormaFront
                        (t.getClass().getSimpleName(), t.getImg())).collect(Collectors.toList());


        return ResultFactory.ok(this.JSONUtils.toJson(data));
    }


    @Post("/pedidos")
    public Result agregarPedido(@Body final String body, final String target, final Request baseRequest,
                                final HttpServletRequest request, final HttpServletResponse response) {
        response.setContentType(ContentType.APPLICATION_JSON);

        try {
            Integer dni = JSONUtils.getPropertyAsInteger(body,"dniCliente");
            Pedido nuevoPedido = new Pedido(dni);
            this.servicioDeChocolates.addPedido(nuevoPedido);
            return ResultFactory.ok();
        } catch (Exception e) {
            return ResultFactory.badRequest(e.getMessage());
        }

    }



    @Override
    public void handle(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        {
            handleGet(target, baseRequest, request, response, "/chocolates");
        }
        {
            handleGet(target, baseRequest, request, response, "/tiposChocolate");
        }
        {
            handleGet(target, baseRequest, request, response, "/formas");
        }
        {
            handleGet(target, baseRequest, request, response, "/tamanios");
        }
        {
            handlePost(target, baseRequest, request, response, "/pedidos");
        }
    }

    private void handleGet(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response, String endPoint) {
        Matcher matcher =
                Pattern.compile(endPoint).matcher(target);

        if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches() && endPoint.equals("/tiposChocolate")) {
            // take parameters from request

            // take variables from url

            // set default content type (it can be overridden during next call)
            response.setContentType("application/json");

            Result result = getTiposChocolate(target, baseRequest, request, response);
            result.process(response);

            response.addHeader("Access-Control-Allow-Origin", "*");
            baseRequest.setHandled(true);
            return;
        }

        if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches() && endPoint.equals("/chocolates")) {
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

        if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches() && endPoint.equals("/formas")) {
            // take parameters from request

            // take variables from url

            // set default content type (it can be overridden during next call)
            response.setContentType("application/json");

            Result result = getFormas(target, baseRequest, request, response);
            result.process(response);

            response.addHeader("Access-Control-Allow-Origin", "*");
            baseRequest.setHandled(true);
            return;
        }

        if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches() && endPoint.equals("/tamanios")) {
            // take parameters from request

            // take variables from url

            // set default content type (it can be overridden during next call)
            response.setContentType("application/json");

            Result result = getTamanios(target, baseRequest, request, response);
            result.process(response);

            response.addHeader("Access-Control-Allow-Origin", "*");
            baseRequest.setHandled(true);
            return;
        }

    }

    private void handlePost(String target, Request baseRequest, HttpServletRequest request, HttpServletResponse response, String endPoint) {
        Matcher matcher =
                Pattern.compile(endPoint).matcher(target);

        if (request.getMethod().equalsIgnoreCase("Post") && matcher.matches()) {
            // take parameters from request
            String body = readBodyAsString(request);

            // take variables from url

            // set default content type (it can be overridden during next call)
            response.setContentType("application/json");

            Result result = agregarPedido(body, target, baseRequest, request, response);
            result.process(response);

            response.addHeader("Access-Control-Allow-Origin", "*");
            baseRequest.setHandled(true);
            return;
        }
    }
}
