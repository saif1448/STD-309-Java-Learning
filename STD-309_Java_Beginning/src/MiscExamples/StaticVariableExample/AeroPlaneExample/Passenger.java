package MiscExamples.StaticVariableExample.AeroPlaneExample;

public class Passenger {
    private String name;
    private String passportNumber;
    private String countryName;
    private int countryCode;
    private boolean isJourneyFinished;

    public Passenger(String name, String passportNumber, int countryCode) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.countryCode = countryCode;
        this.countryName = Country.getCountryName(countryCode);
        isJourneyFinished = false;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", passportNumber='" + passportNumber + '\'' +
                ", countryName='" + countryName + '\'' +
                ", countryCode=" + countryCode +
                ", isJourneyFinished=" + isJourneyFinished +
                '}';
    }

    public void modifyCountry(int updatedCountryIdx){
        countryName = Country.getCountryName(updatedCountryIdx);
        System.out.println("Passenger " + name + "'s country has been updated to: "+ countryName);
    }

    public void updatePassengerJourneyStatus(){
        isJourneyFinished = !isJourneyFinished;
    }
}
