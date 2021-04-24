import java.util.Currency;
import java.util.List;

public class Country {
    String name;
    List<String> topLevelDomain;
    String alpha2Code;
    String alpha3Code;
    List<String> callingCodes;
    String capital;
    List<String> altSpellings;
    String region;
    String subregion;
    String population;
    List<String> latlng;
    String demonym;
    String area;
    String gini;
    List<String> timezones;
    List<String> borders;
    String nativeName;
    String numericCode;
    List<Object> currencies;
    List<Object> languages;
    Translation translations;
    String flag;
    List<String> regionalBlocks;
    String cioc;

    @Override
    public String toString() {
        return "Country: \nname:" + name + ",\n" + "topLevelDomain:" + topLevelDomain + ", alpha2Code:" + alpha2Code +
                ", alpha3Code:" + alpha3Code + ", callingCodes :" + callingCodes + ", capital: " + capital +
                ", altSpellings: " + altSpellings + "," + "\n" + "region: " + region + ", subregion: " + subregion +
                ", population " + population + ", latlng:" + latlng + ", demonym: " + demonym +
                ", area: " + area + ", gini: " + gini + ",timezones:" + timezones + ", borders: " +
                borders + "," + "\n" + "nativeName: " + nativeName + ", numericCode: " + numericCode +
                ", currencies" + currencies + "," + "\n" + "languages:" + languages +
                "," + "\n" + "translations:{" + translations.toString() + "}" + ", regionalBlocs:[ " +
                regionalBlocks + "], cioc: " + cioc + ",\n" + "flag: " + flag;
    }
}

