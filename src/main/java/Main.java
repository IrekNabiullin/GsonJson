import com.google.gson.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        String countryToRequest = "Afghanistan";
        CountriesAPIReguest countriesAPIReguest = new CountriesAPIReguest();
        countriesAPIReguest.getCountriesFromApi(countryToRequest);
/*
        // формируем запрос к внешнему API
        HttpClient httpClient = HttpClientBuilder.create().build();
        String countryName = "russia"; //default name
        String uri = "https://restcountries.eu/rest/v2/name/" + countryName;
//        HttpGet request = new HttpGet("https://restcountries.eu/rest/v2/name/russia");
        HttpGet request = new HttpGet(uri);
        request.addHeader("method", "get");
        HttpResponse response = httpClient.execute(request);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuffer result = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        String resultString = result.toString();


        // преобразуем полученные json в обекты с помощью библиотеки Gson
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder
                .setLenient()
                .create();
        System.out.println();
        Country[] countries = gson.fromJson(resultString, Country[].class);

        // output to console:
        for (int i = 0; i < countries.length; i++) {
//            System.out.println(countries[i].toString());
            System.out.println("Country: " + countries[i].name);
            System.out.println("Translations: " + countries[i].translations);
            System.out.println("Capital: " + countries[i].capital);
            System.out.println("Region: " + countries[i].region);
            System.out.println("Population: " + countries[i].population);
            System.out.println("Languages: " + countries[i].languages);
            System.out.println("Currencies: " + countries[i].currencies);
            System.out.println("Flag:" + countries[i].flag);
        }


//        System.out.println(country.toString());

 */
    }
}
