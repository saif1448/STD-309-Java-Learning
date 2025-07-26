package LoopExamples;

public class ForLoopExample {
    public static void main(String[] args) {
        // printing from 1 to 10
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
