package NestedLoopExamples;

public class NestedLoop5 {
    public static void main(String[] args) {
        String[] str = {"abc", "defg", "pq", "oprs"};

        int i = 0;
        while (i< str.length){
            System.out.println("----------"+str[i]+"------------------");
            printFunction(str[i], i);
            i++;
        }
    }

    public static void printFunction(String str, int a){

        for(int j =0; j<str.length(); j++){
            System.out.println(str.charAt(j) + "--->"+a);
        }
    }

}
