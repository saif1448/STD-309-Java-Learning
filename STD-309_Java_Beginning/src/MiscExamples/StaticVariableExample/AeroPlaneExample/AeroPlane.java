package MiscExamples.StaticVariableExample.AeroPlaneExample;

public class AeroPlane {

    private String aeroPlaneId;
    private String aeroPlaneName;
    private String startingCountry;
    private String destinationCountry;
    private Passenger[] passengers = new Passenger[50];
    private int passengerCurrentIdx = 0;
    private double journeyDistance;

    public AeroPlane(String aeroPlaneId, String aeroPlaneName, int startingCountryId, int destinationCountryId, double journeyDistance) {
        this.aeroPlaneId = aeroPlaneId;
        this.aeroPlaneName = aeroPlaneName;
        this.startingCountry = Country.getCountryName(startingCountryId);
        this.destinationCountry = Country.getCountryName(destinationCountryId);
        this.journeyDistance = journeyDistance;
    }

    public void addPassenger(Passenger newPassenger){
        passengers[passengerCurrentIdx] = newPassenger;
        passengerCurrentIdx++;
    }

    @Override
    public String toString() {
        String output = "AeroPlane Name: " + aeroPlaneName + "\nPassenger List: ";
        for(Passenger p : passengers){
            if(p != null){
                output += "\n"+ p;
            }
        }
        return output;
    }

    public double getJourneyDistance() {
        return journeyDistance;
    }

    public String getAeroPlaneName() {
        return aeroPlaneName;
    }

    public String getStartingCountry() {
        return startingCountry;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void updatePassengerJourneyStatus(){
        for(Passenger p : passengers){
            if(p != null){
                p.updatePassengerJourneyStatus();
            }
        }
    }
}
