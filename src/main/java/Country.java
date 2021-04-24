import java.util.Currency;
import java.util.List;

public class Country {
    String name;
    List<TopLevelDomain> topLevelDomain;
    String alpha2Code;
    String alpha3Code;
    String callingCodes;
    String capital;
    List<AltSpelling> altSpellings;
    String region;
    String subregion;
    String population;
    List<Latlng> latlng;
    String demonym;
    String area;
    String gini;
    List<Timezone> timezones;
    List<Border> borders;
    String nativeName;
    String numericCode;
    List<Currency> currencies;
    List<Language> languages;
    List<Translation> translations;
    String flag;
    List<RegionalBlock> regionalBlocks;
    String cioc;

    @Override
    public String toString() {
        return "Country [{name:" + name + "topLevelDomain:[" + topLevelDomain.toString() + "], alpha2Code:" + alpha2Code +
                ", alpha3Code:" + alpha3Code + ", callingCodes :[" + callingCodes + "], capital: " + capital +
                ", altSpellings: [" + altSpellings.toString() + "], region: " + region + ", subregion: " + subregion +
                ", population " + population + ", latlng:[" + latlng.toString() + "], demonym: " + demonym +
                ",area: " + area + ", gini: " + gini + ",timezones:[" + timezones.toString() + "],borders:[ " +
                borders.toString() + "], nativeName: " + nativeName + ", numericCode: " + numericCode +
                ", currencies[{" + currencies.toString() + "}], languages:[{" + languages.toString() +
                "}], translations:{" + translations.toString() + "}, flag: " + flag +
                ", regionalBlocs:[ " + regionalBlocks.toString() + "], cioc: " + cioc + "}]";

    }
}

