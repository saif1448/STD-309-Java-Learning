package TwoDArrayExamples.frqPractice;

public class GrayImage
{
    public static final int BLACK = 0;
    public static final int WHITE = 255;

    /**
     * The 2-dimensional representation of this image. Guaranteed not to be null.
     * All values in the array are within the range [BLACK, WHITE], inclusive.
     */
    private int[][] pixelValues;

    /** constructor that takes a 2D array */
    public GrayImage(int[][] theArray)
    {
        pixelValues = theArray;
    }

    /**
     * @return the total number of white pixels in this image. Postcondition: this
     *     image has not been changed.
     */
    public int countWhitePixels() {
        int totalWhiteCount = 0;
        for(int j = 0; j < pixelValues[0].length; j++){
            for(int i = 0; i < pixelValues.length; i++){
                if(pixelValues[i][j] == WHITE){
                    totalWhiteCount++;
                }
            }
        }

//        for(int[] row : pixelValues){
//            for(int col : row){
//                if(col == WHITE){
//                    totalWhiteCount++;
//                }
//            }
//        }

        return totalWhiteCount;
    }

    public void processImage() {
        // row major traversing
        int MAX_ROW = pixelValues.length - 1;
        int MAX_COL = pixelValues[0].length - 1;
        for(int i = 0; i < pixelValues.length; i++){
            for(int j = 0; j < pixelValues[i].length; j++){
                int row_idx = i + 2;
                int col_idx = j + 2;
                if(row_idx <=  MAX_ROW && col_idx <= MAX_COL){
                    int idx_val = pixelValues[row_idx][col_idx];
                    int updated_val = pixelValues[i][j] - idx_val;
                    if(updated_val <= BLACK){
                        pixelValues[i][j] = BLACK;
                    }else{
                        pixelValues[i][j] = updated_val;
                    }
                }
            }
        }
    }

    /** main for testing */
    public static void main(String[] args)
    {
        int[][] values =
                {
                        {255, 184, 178, 84, 129},
                        {84, 255, 255, 130, 94},
                        {78, 255, 0, 0, 78},
                        {84, 130, 255, 130, 84}
                };
        GrayImage image = new GrayImage(values);
        System.out.println(
                "count white should be 5 and is " + image.countWhitePixels());
    }
}
