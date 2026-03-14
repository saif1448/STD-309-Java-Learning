package TwoDArrayExamples;

import java.util.Arrays;

public class TicTacToe {



    public static void main(String[] args) {
        /*
   Tic Tac Toe Grid (3x3)

     |   |
  ---+---+---
     |   |
  ---+---+---
     |   |

*/
        String[][] grid = new String[3][3];

        // initializing the grid
        grid[0] = new String[]{"","",""};
        grid[1] = new String[]{"","",""};
        grid[2] = new String[]{"","",""};

        // ""|""|""
        //------------
        // ""|""|""
        //-----------
        // ""|""|""

       printGrid(grid);
       System.out.println("*************************");
       gameMove(1, 1, 1, grid);
       printGrid(grid);
    }

    public static void printGrid(String[][] grid){
        // i --> row
        // j --> col

        // 00 01 02
        //--------------
        // 10 11 12
        //-------------
        // 20 21 22


        for(int i = 0; i < 3; i++){
            for(int j = 0; j< 3; j++){

                if(j == 2){
                    System.out.print(" "+grid[i][j]+" ");
                }else {
                    System.out.print(" "+grid[i][j]+" "+"|");
                }
            }
            System.out.println();
            if(i != 2)
                System.out.println("--------");
        }
    }

    public static void gameMove(int player, int row, int col, String[][] grid){
        // if player == 1 --> 0
        // if player == 2 --> X

        if(player == 1){
            grid[row][col] = "0";
        }else{
            grid[row][col] = "X";
        }
    }
}
