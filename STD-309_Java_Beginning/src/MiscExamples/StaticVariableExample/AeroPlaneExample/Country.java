package MiscExamples.StaticVariableExample.AeroPlaneExample;

public class Country {

    private static String[] countries = {"Bangladesh", "India", "Peru", "Australia", "Denmark", "India", "Pakistan", "Germany", "Italy", "Newzeeland", "Brazil"};

    public static String getCountryName(int countryIdx){
        return countries[countryIdx];
    }

}
