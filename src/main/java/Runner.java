import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import jdk.swing.interop.SwingInterOpUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws IOException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("https://restcountries.eu/rest/v2/name/cuba");
        request.addHeader("method", "get");
        request.addHeader("Client-Id", "836");
        request.addHeader("Api-Key", "0296d4f2-70a1-4c09-b507-904fd05567b9");
        HttpResponse response = httpClient.execute(request);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuffer result = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        String resultString = result.toString();
        String toConvert = resultString.substring(1, resultString.length()-1);


        // преобразуем полученные json в обекты с помощью библиотеки Gson
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
//        Gson gson2 = new Gson();
        Country country = gson.fromJson(toConvert, Country.class);

        System.out.println(country.toString());

//        System.out.println("country: " + country.name +
//                "\n a2_code: " + country.alpha2Code +
//                "\n a3_code: " + country.alpha3Code);

    }
}
