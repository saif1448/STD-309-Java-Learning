package TwoDArrayExamples.frqPractice;

public class WeatherGrid {
    private int[][] temps;
    public int coldestRow(){
        int minRowIdx = 0;
        int minRowIdxVal = Integer.MAX_VALUE;

        for(int i = 0; i < temps.length; i++){
            int rowWiseMinValue = Integer.MAX_VALUE;
            for(int j = 0; j < temps[i].length; j++){
                if(temps[i][j] < rowWiseMinValue){
                    rowWiseMinValue = temps[i][j];
                }
            }
            if(rowWiseMinValue < minRowIdxVal){
                minRowIdxVal = rowWiseMinValue;
                minRowIdx = i;
            }
        }

        return minRowIdx;
    }
}
