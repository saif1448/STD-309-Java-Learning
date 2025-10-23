package NestedLoopExamples;

public class NestedLoop2 {
    public static void main(String[] args) {
        int n = 5;
        int m = 7;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <=m;  j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i = 1; i <=n; i++){
            for(int j = 1; j <= m; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
