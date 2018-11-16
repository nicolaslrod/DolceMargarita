package MercadoPago;

import com.mercadopago.*;
import com.mercadopago.exceptions.MPConfException;
import com.mercadopago.exceptions.MPException;
import com.mercadopago.resources.Payment;
import com.mercadopago.resources.datastructures.payment.Payer;

public class Main {

    public static void main(String[] args)throws MPException, MPConfException {

        MercadoPago.SDK.setClientSecret(System.getenv("uSrYVm8EyPJQQuwjtd49j23VOYQ1UxMW"));
        MercadoPago.SDK.setClientId(System.getenv("134202458393952"));

        Payment payment = new Payment()
                .setTransactionAmount(100f)
                .setToken("your_cardtoken")
                .setDescription("description")
                .setInstallments(1)
                .setPaymentMethodId("visa")
                .setPayer(new Payer()
                        .setEmail("dummy_email"));

        payment.save();

        System.out.println(payment.getStatus());

    }
}

// link MercadoPago dev -> https://www.mercadopago.com.ar/developers/es/plugins_sdks/sdks/official/java/