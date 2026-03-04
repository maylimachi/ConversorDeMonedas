import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Principal {
    static Scanner sc = new Scanner(System.in);
    static final String API_KEY = "key";
    public static void main(String[] args) throws Exception {
        int opcion = 0;
        while (opcion != 7) {
            Conversor.mostrarMenu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    convertirMoneda("USD", "ARS", "Dólar a Peso Argentino");
                    break;
                case 2:
                    convertirMoneda("ARS", "USD", "Peso Argentino a Dólar");
                    break;
                case 3:
                    convertirMoneda("USD", "BRL", "Dólar a Real Brasileño");
                    break;
                case 4:
                    convertirMoneda("BRL", "USD", "Real Brasileño a Dólar");
                    break;
                case 5:
                    convertirMoneda("USD", "COP", "Dólar a Peso Colombiano");
                    break;
                case 6:
                    convertirMoneda("COP", "USD", "Peso Colombiano a Dólar");
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        }
    
    }

    public static void convertirMoneda(String monedaOrigen, String monedaDestino, String texto) throws Exception {
        System.out.println("Elegiste: " + texto);
        System.out.println("Ingrese el monto: ");
        double monto = sc.nextDouble();

        double tasa = obtenerTasaConversion(monedaOrigen, monedaDestino);
        double resultado = convertir(monto, tasa);
        System.out.println("El monto convertido es: " + resultado);
    }

    public static double obtenerTasaConversion(String monedaOrigen, String monedaDestino) throws Exception {
        String url = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/" + monedaOrigen + "/" + monedaDestino;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();

        JsonObject objectRoot = JsonParser.parseString(json).getAsJsonObject();
        double tasa = objectRoot.get("conversion_rate").getAsDouble();
        return tasa;
    }

    public static double convertir(double monto, double tasa) {
        return monto * tasa;
    }
}
