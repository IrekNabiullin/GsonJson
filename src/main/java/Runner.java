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
        System.out.println("response = " + response);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuffer result = new StringBuffer();
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        System.out.println("Result:");
        String resultString = result.toString();
        System.out.println(resultString);
        System.out.println();


        // преобразуем полученные json в обекты с помощью библиотеки Gson
        GsonBuilder builder = new GsonBuilder();
//        builder.setPrettyPrinting();
        Gson gson = builder.create();
//        System.out.println("Gson: " + gson.toString());
        System.out.println();
        System.out.println("resultString.length() = " + resultString.length() );

//        Country country = gson.fromJson(resultString, Country.class);
//                System.out.println("country_name: " + country.name +
//                "\n a2_code: " + country.alpha2Code +
//                "\n a3_code: " + country.alpha3Code);


//       String testString = "[{\"name\":\"Cuba\",\"topLevelDomain\":[\".cu\"],\"alpha2Code\":\"CU\",\"alpha3Code\":\"CUB\",\"callingCodes\":[\"53\"],\"capital\":\"Havana\",\"altSpellings\":[\"CU\",\"Republic of Cuba\",\"República de Cuba\"],\"region\":\"Americas\",\"subregion\":\"Caribbean\",\"population\":11239004,\"latlng\":[21.5,-80.0],\"demonym\":\"Cuban\",\"area\":109884.0,\"gini\":null,\"timezones\":[\"UTC-05:00\"],\"borders\":[],\"nativeName\":\"Cuba\",\"numericCode\":\"192\",\"currencies\":[{\"code\":\"CUC\",\"name\":\"Cuban convertible peso\",\"symbol\":\"$\"},{\"code\":\"CUP\",\"name\":\"Cuban peso\",\"symbol\":\"$\"}],\"languages\":[{\"iso639_1\":\"es\",\"iso639_2\":\"spa\",\"name\":\"Spanish\",\"nativeName\":\"Español\"}],\"translations\":{\"de\":\"Kuba\",\"es\":\"Cuba\",\"fr\":\"Cuba\",\"ja\":\"キューバ\",\"it\":\"Cuba\",\"br\":\"Cuba\",\"pt\":\"Cuba\",\"nl\":\"Cuba\",\"hr\":\"Kuba\",\"fa\":\"کوبا\"},\"flag\":\"https://restcountries.eu/data/cub.svg\",\"regionalBlocs\":[],\"cioc\":\"CUB\"}]";
        Gson gson2 = new Gson();
        Country country = gson2.fromJson(resultString, Country.class);
        System.out.println(country);
//
//        Countries countries = gson.fromJson(resultString, Countries.class);
//        System.out.println("countries: " + countries);

//        Country country = gson.fromJson(resultString, Country.class);
//        System.out.println("country: " + country.name +
//                "\n a2_code: " + country.alpha2Code +
//                "\n a3_code: " + country.alpha3Code);

    }
}
