import java.util.List;
import com.google.gson.Gson;
public class GsonListTest {
    public static void main(String args[]) throws Exception {
        String jsonString = "{\"employees\":[{\"name\":\"Raja Ramesh\", \"technology\":\"Java\"}]}";
        Gson gson = new Gson();
        Software software = gson.fromJson(jsonString, Software.class);
        System.out.println(software);
    }
}