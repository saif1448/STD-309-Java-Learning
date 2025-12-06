package NestedLoopExamples;

public class NestedLoop6 {
    public static void main(String[] args) {
        // num = 5812
        // output = 5+8+1+2 = 16
        // sum of all digits of a given number
        int num = 5812;
        int sum = 0;
        int num2 = 0;
        while(num > 0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num2= num2*10 + lastDigit;
            num = num/10;
        }

        System.out.println(sum);
        System.out.println(num2);
    }
}
