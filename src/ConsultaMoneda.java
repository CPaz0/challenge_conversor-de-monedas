import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda buscarMoneda(String baseCode, String targetCode) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/66d970cacdfa52dfcabae88a/pair/"+baseCode+"/"+targetCode);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            return  new Gson().fromJson(response.body(), Moneda.class);

        } catch (Exception e) {
            throw new RuntimeException("No encontre ese tipo de Cambio");

        }
    }
}
