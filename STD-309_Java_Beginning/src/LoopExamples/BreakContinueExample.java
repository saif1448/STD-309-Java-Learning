package LoopExamples;

public class BreakContinueExample {
    public static void main(String[] args) {
        int limit = 100;
        //break example
        for (int i = 10; i <=limit; i+=10){
            // if the value of i is gonna cross 60% of the limit, we are gonna hit the break
            if(i > limit*0.6){
                break;
            }
            System.out.println(i);
        }

        //continue example
        for (int i = 10; i <=limit; i+=10){
            // if the value of i is a mutiplicant of 30, we are gonna skip it
            if(i % 30 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
