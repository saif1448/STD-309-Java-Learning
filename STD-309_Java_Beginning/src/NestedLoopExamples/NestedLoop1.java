package NestedLoopExamples;

public class NestedLoop1 {
    public static void main(String[] args) {
        // printing the numbers tables from 2 - 6

        for(int i = 2; i <= 6; i++){

//            System.out.println("------------------" + i + " number table" + "-----------------------------");

            for(int j = 1; j <= 10; j++){
                System.out.print(" | "+i + " x " + j + " = " + i*j +" | ");
            }
//            System.out.println("------------------------------------------");
            System.out.println();
        }

    }
}
