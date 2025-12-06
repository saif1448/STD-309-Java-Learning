package NestedLoopExamples;

public class NestedLoop8 {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "abcd";

//        System.out.println(str1.compareTo(str2));
        System.out.println(compareToImplement(str1, str2));
    }

    public static int compareToImplement(String str1, String str2){

        // str1 , str2 ---> match character by character, length same ----> 0
        // str1, str2 ---> match character by character, length not same, str1.length > str2.length ---> 1
        // str1, str2 ---> match character by character, length not same, str1.length < str2.length ---> -1
        // str1, str2 ---> not match, if str1 char > str2 char ----> 1
        // str1, str2 ---> not match, if str1 char < str2 < char ---> -1

        int len1 = str1.length();
        int len2 = str2.length();

        int i = 0;
        int j = 0;
        while (i < len1 && j < len2){
            char str1_char = str1.charAt(i);
            char str2_char = str2.charAt(j);
            if(str1_char != str2_char){
                if(str1_char > str2_char) return 1;
                else return -1;
            }
            i++;
            j++;
        }

        if(len1 > len2){
            return 1;
        } else if (len1 < len2) {
            return -1;
        }else {
            return 0;
        }

    }
}
