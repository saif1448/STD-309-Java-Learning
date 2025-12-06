import MethodExamples.Method1Example;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.StrictMath.log10;

public class Test1 {

    public static int countSubString(String subStr, String str){

        int index = 0;
        int count = 0;

        while (true){
            index = str.indexOf(subStr, index);
            if (index != -1){
                count++;
            }else{
                break;
            }
            index = index + subStr.length();
        }

        return count;
    }


    public static boolean catdog(String str){
       int countCat = countSubString("cat", str);
       int dogCount = countSubString("dog", str);
       return countCat == dogCount;
    }

    public static void main(String[] args) {
        catdog("1cat1dog1cat1cat1dog");
    }




}