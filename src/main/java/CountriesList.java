import java.util.Arrays;
import java.util.List;

public class CountriesList {
    private String[] countryArray = new String[]{
            "Afghanistan",
            "Åland",
            "Albania",
            "Algeria",
            "American",
            "Andorra",
            "Angola",
            "Anguilla",
            "Antarctica",
            "Antigua",
            "Argentina",
            "Armenia",
            "Aruba",
            "Australia",
            "Austria",
            "Azerbaijan",
            "Bahamas",
            "Bahrain",
            "Bangladesh",
            "Barbados",
            "Belarus",
            "Belgium",
            "Belize",
            "Benin",
            "Bermuda",
            "Bhutan",
            "Bolivia",
            "Bonaire,",
            "Bosnia",
            "Botswana",
            "Bouvet",
            "Brazil",
            "Britain",
            "Brunei",
            "Bulgaria",
            "Burkina",
            "Burundi",
            "Cabo",
            "Cambodia",
            "Cameroon",
            "Canada",
            "Cayman",
            "Central",
            "Chad",
            "Chile",
            "China",
            "Christmas",
            "Cocos",
            "Colombia",
            "Comoros",
            "Congo",
            "Cook",
            "Costa",
            "Côte",
            "Croatia",
            "Cuba",
            "Curaçao",
            "Cyprus",
            "Czech",
            "Denmark",
            "Djibouti",
            "Dominica",
            "Dominican",
            "Ecuador",
            "Egypt",
            "Emirates",
            "Equatorial",
            "Eritrea",
            "Estonia",
            "Eswatini",
            "Ethiopia",
            "Falkland",
            "Faroe",
            "Fiji",
            "Finland",
            "France",
            "French",
            "Gabon",
            "Gambia",
            "Georgia",
            "Germany",
            "Ghana",
            "Gibraltar",
            "Greece",
            "Greenland",
            "Grenada",
            "Guadeloupe",
            "Guam",
            "Guatemala",
            "Guernsey",
            "Guinea",
            "Guinea-Bissau",
            "Guyana",
            "Haiti",
            "Heard",
            "Holy",
            "Honduras",
            "Hong",
            "Hungary",
            "Iceland",
            "India",
            "Indonesia",
            "Iran",
            "Iraq",
            "Ireland",
            "Isle",
            "Israel",
            "Italy",
            "Jamaica",
            "Japan",
            "Jersey",
            "Jordan",
            "Kazakhstan",
            "Kenya",
            "Kiribati",
            "Korea",
            "Kuwait",
            "Kyrgyzstan",
            "Lao",
            "Latvia",
            "Lebanon",
            "Lesotho",
            "Liberia",
            "Libya",
            "Liechtenstein",
            "Lithuania",
            "Luxembourg",
            "Macao",
            "Madagascar",
            "Malawi",
            "Malaysia",
            "Maldives",
            "Mali",
            "Malta",
            "Marshall",
            "Martinique",
            "Mauritania",
            "Mauritius",
            "Mayotte",
            "Mexico",
            "Micronesia",
            "Moldova",
            "Monaco",
            "Mongolia",
            "Montenegro",
            "Montserrat",
            "Morocco",
            "Mozambique",
            "Myanmar",
            "Namibia",
            "Nauru",
            "Nepal",
            "Netherlands",
            "Nicaragua",
            "Niger",
            "Nigeria",
            "Niue",
            "Norfolk",
            "North",
            "Northern",
            "Norway",
            "Oman",
            "Pakistan",
            "Palau",
            "Palestine,",
            "Panama",
            "Papua",
            "Paraguay",
            "Peru",
            "Philippines",
            "Pitcairn",
            "Poland",
            "Portugal",
            "Puerto",
            "Qatar",
            "Réunion",
            "Romania",
            "Russian",
            "Rwanda",
            "Saint",
            "Samoa",
            "San",
            "Sao",
            "Saudi",
            "Senegal",
            "Serbia",
            "Seychelles",
            "Sierra",
            "Singapore",
            "Sint",
            "Slovakia",
            "Slovenia",
            "Solomon",
            "Somalia",
            "South",
            "Spain",
            "Sri",
            "Sudan",
            "Suriname",
            "Svalbard",
            "Swaziland",
            "Sweden",
            "Switzerland",
            "Syrian",
            "Taiwan",
            "Tajikistan",
            "Tanzania,",
            "Thailand",
            "Timor-Leste",
            "Togo",
            "Tokelau",
            "Tonga",
            "Trinidad",
            "Tunisia",
            "Turkey",
            "Turkmenistan",
            "Turks",
            "Tuvalu",
            "Uganda",
            "Ukraine",
            "Uruguay",
            "USA",
            "Uzbekistan",
            "Vanuatu",
            "Venezuela",
            "Viet",
            "Virgin",
            "Wallis",
            "Western",
            "Yemen",
            "Zambia",
            "Zimbabwe"

    };

    private String[] countryFlags = new String[]{
            "afg",
            "ala",
            "alb",
            "dza",
            "asm",
            "and",
            "ago",
            "aia",
            "ata",
            "atg",
            "arg",
            "arm",
            "abw",
            "aus",
            "aut",
            "aze",
            "bhs",
            "bhr",
            "bgd",
            "brb",
            "blr",
            "bel",
            "blz",
            "ben",
            "bmu",
            "btn",
            "bol",
            "bes",
            "bih",
            "bwa",
            "bvt",
            "bra",
            "gbr",
            "brn",
            "bgr",
            "bfa",
            "bdi",
            "cpv",
            "khm",
            "cmr",
            "can",
            "cym",
            "caf",
            "tcd",
            "chl",
            "chn",
            "cxr",
            "cck",
            "col",
            "com",
            "cog",
            "cok",
            "cri",
            "civ",
            "hrv",
            "cub",
            "cuw",
            "cyp",
            "cze",
            "dnk",
            "dji",
            "dma",
            "dom",
            "ecu",
            "egy",
            "are",
            "gnq",
            "eri",
            "est",
            "swz",
            "eth",
            "flk",
            "fro",
            "fji",
            "fin",
            "fra",
            "guf",
            "gab",
            "gmb",
            "geo",
            "deu",
            "gha",
            "gib",
            "grc",
            "grl",
            "grd",
            "glp",
            "gum",
            "gtm",
            "ggy",
            "gnq",
            "gnb",
            "guy",
            "hti",
            "hmd",
            "vat",
            "hnd",
            "hkg",
            "hun",
            "isl",
            "iot",
            "idn",
            "irn",
            "irq",
            "irl",
            "imn",
            "isr",
            "ita",
            "jam",
            "jpn",
            "jey",
            "jor",
            "kaz",
            "ken",
            "kir",
            "prk",
            "kwt",
            "kgz",
            "lao",
            "lva",
            "lbn",
            "lso",
            "lbr",
            "lby",
            "lie",
            "ltu",
            "lux",
            "mac",
            "mdg",
            "mwi",
            "mys",
            "mdv",
            "mli",
            "mlt",
            "mhl",
            "mtq",
            "mrt",
            "mus",
            "myt",
            "mex",
            "fsm",
            "mda",
            "mco",
            "mng",
            "mne",
            "msr",
            "mar",
            "moz",
            "mmr",
            "nam",
            "nru",
            "npl",
            "nld",
            "nic",
            "ner",
            "nga",
            "niu",
            "nfk",
            "mnp",
            "mnp",
            "nor",
            "omn",
            "pak",
            "plw",
            "pse",
            "pan",
            "png",
            "pry",
            "per",
            "phl",
            "pcn",
            "pol",
            "prt",
            "pri",
            "qat",
            "reu",
            "rou",
            "rus",
            "rwa",
            "blm",
            "asm",
            "smr",
            "stp",
            "sau",
            "sen",
            "srb",
            "syc",
            "sle",
            "sgp",
            "bes",
            "svk",
            "svn",
            "slb",
            "som",
            "atf",
            "esp",
            "lka",
            "ssd",
            "sur",
            "sjm",
            "swz",
            "swe",
            "che",
            "syr",
            "twn",
            "tjk",
            "tza",
            "tha",
            "tls",
            "tgo",
            "tkl",
            "ton",
            "tto",
            "tun",
            "tur",
            "tkm",
            "tca",
            "tuv",
            "uga",
            "ukr",
            "ury",
            "usa",
            "uzb",
            "vut",
            "ven",
            "vnm",
            "vgb",
            "wlf",
            "esh",
            "yem",
            "zmb",
            "zwe"
    };

            List < String > countriesList = Arrays.asList(countryArray);

    public String[] getCountriesArray() {
        return countryArray;
    }

    public String[] getCountryFlags() {
        return countryFlags;
    }

    public List<String> getCountriesList() {
        return countriesList;
    }


}
