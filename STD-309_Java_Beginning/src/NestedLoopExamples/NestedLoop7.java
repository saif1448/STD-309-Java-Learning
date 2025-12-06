package NestedLoopExamples;

public class NestedLoop7 {
    public static void main(String[] args) {
        String str = "abcd";
        String revStr = "";
        int len = str.length() - 1;
        while (len >= 0){
            revStr += str.charAt(len);
            len--;
        }

        System.out.println(revStr);
    }
}
