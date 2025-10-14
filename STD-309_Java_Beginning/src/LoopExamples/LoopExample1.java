package LoopExamples;

public class LoopExample1 {
    public static void main(String[] args) {

        int a1[] = {10,20,30,40,50};
        int a2[] = {100,200,300,400,500};

        // [(10,100),(20,200),(30,300),(40,400),(50,500)] --> implement this using loop
        String output = "[";

        int i = 0;
        while ( i < a1.length ){
            String pair = "("+a1[i]+ "," + a2[i] + ") ";
            output += pair;
            i++;
        }

        output = output.strip();
        output = output.replace(" ", ",");
        output+="]";
        System.out.println(output);

    }
}
