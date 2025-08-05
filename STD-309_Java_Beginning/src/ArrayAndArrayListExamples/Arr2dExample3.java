package ArrayAndArrayListExamples;

public class Arr2dExample3 {

    public static void main(String[] args) {

        char[][] names = new char[3][];

        names[0] = new char[] {'S', 'A', 'I', 'F'};
        names[1] = new char[] {'M', 'A', 'H', 'M', 'U', 'D'};
        names[2] = new char[] {'P', 'A', 'R', 'V', 'E', 'Z'};



        for(int i = 0; i < 3; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j]);
            }
            System.out.println();
        }


    }
}
