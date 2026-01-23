package MiscExamples.StaticVariableExample;

import MiscExamples.StaticVariableExample.AeroPlaneExample.Country;

public class Student {

    private String name;
    private String id;
    private String countryName;

    public Student(String name, String id, int countryIdx){
        this.name = name;
        this.id = id;
        countryName = Country.getCountryName(countryIdx);
    }

}
