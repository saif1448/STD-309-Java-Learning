package MiscExamples.StaticVariableExample.AeroPlaneExample;

public class AeroPlaneMain {
    public static void main(String[] args) {
        AeroPlane biman_01 = new AeroPlane("biman_001", "Biman_01", 2, 6, 150.00);

        Passenger p1 = new Passenger("Passenger1", "1231abas", 6);
        Passenger p2 = new Passenger("Passerger2", "iupop123", 4);

        biman_01.addPassenger(p1);
        biman_01.addPassenger(p2);

        System.out.println("Before starting journey:");
        System.out.println("-----------------------");
        System.out.println(biman_01);
        System.out.println("-----------------------");

        System.out.println(biman_01.getAeroPlaneName() + " is taking off from " + biman_01.getStartingCountry());

        for(double i = 0; i <= biman_01.getJourneyDistance(); i+=10){
            System.out.println("Aeroplane has crossed " + i + "km of distance");
        }

        biman_01.updatePassengerJourneyStatus();

        System.out.println(biman_01.getAeroPlaneName() + " has reached "+ biman_01.getDestinationCountry());

        System.out.println("After finishing journey:");
        System.out.println("-----------------------");
        System.out.println(biman_01);
        System.out.println("-----------------------");


    }
}
