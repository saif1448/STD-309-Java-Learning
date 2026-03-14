package TwoDArrayExamples;

import java.util.Arrays;

public class Arr2dModification {
    public static void main(String[] args) {
        int[][] classWiseStdMarks = new int[3][];

        classWiseStdMarks[0] = new int[]{2, 4, 6, 8, 10, 12, 100};
        classWiseStdMarks[1] = new int[]{1, 3, 5, 13};
        classWiseStdMarks[2] = new int[]{7, 9, 11, 17, 23, 31};

        for(int i = 0; i < classWiseStdMarks.length; i++){
            System.out.println(Arrays.toString(classWiseStdMarks[i]));
        }

        // 0 ---> 4th ---> 8 ---> 15

        classWiseStdMarks[0][3] = 15;
        for(int i = 0; i < classWiseStdMarks.length; i++){
            System.out.println(Arrays.toString(classWiseStdMarks[i]));
        }

        // 3rd class --> last value ---> 55
        int lastIdx = classWiseStdMarks[2].length-1;
        classWiseStdMarks[2][lastIdx] = 55;

        System.out.println("-------------");
        for(int i = 0; i < classWiseStdMarks.length; i++){
            System.out.println(Arrays.toString(classWiseStdMarks[i]));
        }

        classWiseStdMarks[1][1] = 66;
    }
}
