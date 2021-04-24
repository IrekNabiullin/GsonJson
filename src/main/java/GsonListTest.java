import java.util.List;
import com.google.gson.Gson;
public class GsonListTest {
    public static void main(String args[]) throws Exception {
        String jsonString = "{\"employees\":[{\"name\":\"Raja Ramesh\", \"technology\":\"Java\"}]}";

        Gson gson = new Gson();
        Software software = gson.fromJson(jsonString, Software.class);
        System.out.println(software);

        String testString = "{\"name\":\"Cuba\",\"topLevelDomain\":[\".cu\"],\"alpha2Code\":\"CU\",\"alpha3Code\":\"CUB\",\"callingCodes\":[\"53\"],\"capital\":\"Havana\",\"altSpellings\":[\"CU\",\"Republic of Cuba\",\"República de Cuba\"],\"region\":\"Americas\",\"subregion\":\"Caribbean\",\"population\":11239004,\"latlng\":[21.5,-80.0],\"demonym\":\"Cuban\",\"area\":109884.0,\"gini\":null,\"timezones\":[\"UTC-05:00\"],\"borders\":[],\"nativeName\":\"Cuba\",\"numericCode\":\"192\",\"currencies\":[{\"code\":\"CUC\",\"name\":\"Cuban convertible peso\",\"symbol\":\"$\"},{\"code\":\"CUP\",\"name\":\"Cuban peso\",\"symbol\":\"$\"}],\"languages\":[{\"iso639_1\":\"es\",\"iso639_2\":\"spa\",\"name\":\"Spanish\",\"nativeName\":\"Español\"}],\"translations\":{\"de\":\"Kuba\",\"es\":\"Cuba\",\"fr\":\"Cuba\",\"ja\":\"キューバ\",\"it\":\"Cuba\",\"br\":\"Cuba\",\"pt\":\"Cuba\",\"nl\":\"Cuba\",\"hr\":\"Kuba\",\"fa\":\"کوبا\"},\"flag\":\"https://restcountries.eu/data/cub.svg\",\"regionalBlocs\":[],\"cioc\":\"CUB\"}";
        Gson gson2 = new Gson();
        Country country = gson2.fromJson(testString, Country.class);
        if (testString == country.toString()) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        System.out.println(testString);
        System.out.println(country);
    }
}