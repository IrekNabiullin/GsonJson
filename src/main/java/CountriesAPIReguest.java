import com.google.gson.*;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountriesAPIReguest {

    Country[] countries;

    Country[] getCountriesFromApi(String countryName) {
        // формируем запрос к внешнему API
        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            String uri = "https://restcountries.eu/rest/v2/name/" + countryName;
            //        HttpGet request = new HttpGet("https://restcountries.eu/rest/v2/name/russia"); //default path
 //           HttpGet request = new HttpGet("https://restcountries.eu/rest/v2/currency/usd");
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
            countries = gson.fromJson(resultString, Country[].class);

            // output to console:
            for (int i = 0; i < countries.length; i++) {
//                System.out.println(resultString);
                System.out.println("Country: " + countries[i].name);
//                System.out.println("Translations: " + countries[i].translations);
//                System.out.println("Capital: " + countries[i].capital);
//                System.out.println("Region: " + countries[i].region);
//                System.out.println("Population: " + countries[i].population);
//                System.out.println("Languages: " + countries[i].languages);
//                System.out.println("Currencies: " + countries[i].currencies);
                System.out.println("Flag:" + countries[i].flag);
            }

        } catch (IOException e) {
            String defaultResponse = "[{\"name\":\"Russian Federation\",\"topLevelDomain\":[\".ru\"]," +
                    "\"alpha2Code\":\"RU\",\"alpha3Code\":\"RUS\",\"callingCodes\":[\"7\"],\"capital\":\"Moscow\"," +
                    "\"altSpellings\":[\"RU\",\"Rossiya\",\"Russian Federation\",\"Российская Федерация\"," +
                    "\"Rossiyskaya Federatsiya\"],\"region\":\"Europe\",\"subregion\":\"Eastern Europe\"," +
                    "\"population\":146599183,\"latlng\":[60.0,100.0],\"demonym\":\"Russian\",\"area\":1.7124442E7," +
                    "\"gini\":40.1,\"timezones\":[\"UTC+03:00\",\"UTC+04:00\",\"UTC+06:00\",\"UTC+07:00\"," +
                    "\"UTC+08:00\",\"UTC+09:00\",\"UTC+10:00\",\"UTC+11:00\",\"UTC+12:00\"]," +
                    "\"borders\":[\"AZE\",\"BLR\",\"CHN\",\"EST\",\"FIN\",\"GEO\",\"KAZ\",\"PRK\",\"LVA\",\"LTU\"," +
                    "\"MNG\",\"NOR\",\"POL\",\"UKR\"],\"nativeName\":\"Россия\",\"numericCode\":\"643\"," +
                    "\"currencies\":[{\"code\":\"RUB\",\"name\":\"Russian ruble\",\"symbol\":\"₽\"}]," +
                    "\"languages\":[{\"iso639_1\":\"ru\",\"iso639_2\":\"rus\",\"name\":\"Russian\"," +
                    "\"nativeName\":\"Русский\"}],\"translations\":{\"de\":\"Russland\",\"es\":\"Rusia\"," +
                    "\"fr\":\"Russie\",\"ja\":\"ロシア連邦\",\"it\":\"Russia\",\"br\":\"Rússia\",\"pt\":\"Rússia\"," +
                    "\"nl\":\"Rusland\",\"hr\":\"Rusija\",\"fa\":\"روسیه\"}," +
                    "\"flag\":\"https://restcountries.eu/data/rus.svg\"," +
                    "\"regionalBlocs\":[{\"acronym\":\"EEU\",\"name\":\"Eurasian Economic Union\"," +
                    "\"otherAcronyms\":[\"EAEU\"],\"otherNames\":[]}],\"cioc\":\"RUS\"}]\n";
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder
                    .setLenient()
                    .create();
            countries = gson.fromJson(defaultResponse, Country[].class);
            e.printStackTrace();
        }
        return countries;
    }
}
