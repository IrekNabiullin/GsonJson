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

    }
}
