package ArrayListPractice;


import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {

    private List<ClimbingInfo> climbingInfoList;

    public ClimbingClub(){
        climbingInfoList = new ArrayList<>();
    }

    public void addClimb(String peakName, int climbTime){

        ClimbingInfo newClimb = new ClimbingInfo(peakName, climbTime);

        climbingInfoList.add(newClimb);
    }

    


}
