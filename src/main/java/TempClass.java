import com.google.gson.Gson;

import java.util.HashMap;

public class TempClass {
   HashMap<String, String> countryHashMap = new HashMap<>();

        public HashMap<String, String> getCountryMap() {
            if(countryHashMap.isEmpty()) {
                CountriesList countriesList = new CountriesList();
                int count = countriesList.getCountriesList().size();
                for (int i = 0; i < count; i++) {
                    String countryToRequest = countriesList.getCountriesList().get(i);
                    System.out.println("requesting ... " + countryToRequest);
                    CountriesAPIReguest countriesAPIReguest = new CountriesAPIReguest();
                    Country[] countryResultSet = countriesAPIReguest.getCountriesFromApi(countryToRequest);
                    String tempCountryName = countriesList.getCountriesList().get(i);
                    String tempCountryFlagRef = countryResultSet[0].flag;
                    countryHashMap.put(tempCountryName, tempCountryFlagRef);
                    System.out.println("tempCountryName: " + tempCountryName + " Flag: " + tempCountryFlagRef);
                    System.out.println();
                }
                Gson gson = new Gson();
                String serialized = gson.toJson(countryHashMap);
                System.out.println(serialized);
            }
            return countryHashMap;
        }
}
