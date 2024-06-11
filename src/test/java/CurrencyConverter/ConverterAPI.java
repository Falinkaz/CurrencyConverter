package CurrencyConverter;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverterAPI {

    //String address = "https://v6.exchangerate-api.com/v6/cd7b708fe846d646f3d84197/pair/"+fromCurrency+"/"+toCurrency;
        public static void main(String[] args) throws IOException, InterruptedException {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/cd7b708fe846d646f3d84197/pair/USD/MXN"))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            double rate = jsonObject.get("conversion_rate").getAsDouble();

            System.out.println(rate);

    }

    public double getRate(String fromCurrency, String toCurrency) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/cd7b708fe846d646f3d84197/pair/"+ fromCurrency + "/" + toCurrency))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

        return jsonObject.get("conversion_rate").getAsDouble();


    }

}
