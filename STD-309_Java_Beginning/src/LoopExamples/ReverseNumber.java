package LoopExamples;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        int n = 9519;
        int rem, revNum = 0;
        for (int i = 0; i <= n; i++) {
            rem = n % 10;
            revNum = revNum * 10 + rem;
            n /=10;
        }
//

//
//        while (n != 0) {
//            rem = n % 10;
//            revNum = revNum * 10 + rem;
//            n /= 10;
//        }


//        for(int i = n; i!=0; i/=10){
//            rem = i % 10;
//            revNum = revNum * 10 + rem;
//        }

        System.out.println(revNum);
    }
}
