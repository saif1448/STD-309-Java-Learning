package ArrayAndArrayListExamples;

public class Arr2dExample2 {

    public static void main(String[] args) {

        char[][] names = new char[3][];

        names[0] = new char[5];
        names[1] = new char[7];
        names[2] = new char[6];

        names[0][0] = 'S';
        names[0][1] = 'A';
        names[0][2] = 'I';
        names[0][3] = 'F';


        names[1][0] = 'M';
        names[1][1] = 'A';
        names[1][2] = 'H';
        names[1][3] = 'M';
        names[1][4] = 'U';
        names[1][5] = 'D';


        names[2][0] = 'P';
        names[2][1] = 'A';
        names[2][2] = 'R';
        names[2][3] = 'V';
        names[2][4] = 'E';
        names[2][5] = 'Z';

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < names[i].length; j++){
                System.out.print(names[i][j]);
            }
            System.out.println();
        }


    }
}
