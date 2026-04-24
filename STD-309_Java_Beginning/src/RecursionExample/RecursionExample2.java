package RecursionExample;

public class RecursionExample2 {



    // 10 + 9 + 8 + 7 + ... + 1 + 0 = ?
    public static int tailSum(int num, int sum){

        // tailSum(10, 0) ---> sum = 0 + 10  ---> tailSum(9, sum) ---> tailSum(9, 10)
        // taiSum(9, 10) --->  sum = 10 + 9 ----> tailSum(8, 10 + 9)
        // tailSum(8, 10 + 9) ---> sum = 8 + 10 + 9 ---> tailSum(7, 10 + 9 + 8)
        // tailSum(7, 10 + 9 + 8) --> sum = 7 + 10 + 9 + 8 ---> tailSum(6, 10 + 9 + 8 + 7)
        // .....
        /// tailSum(0, 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1) ---> return 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1

        if(num == 0){
            return sum;
        }
        sum += num;
        return tailSum(num -1, sum);
    }


    // 0 + 1 + 2 + 3 + .... + 10 = ?
    public static int headSum(int num){
        if(num == 0){
            return 0;
        }
        return num + headSum(num - 1);
        // 10 + headSum(9)
        //          9  + headSum(8)
        //                  8 + headSum(7)
        //                                  headSum(5)
        //                                  5 + headSum(4) ---> return 5 + 4 + 3 + 2 + 1
        //                                  4 + headSum(3) ---> return 4 + 3 + 2 + 1 0
        //                                  3 + headSum(2) ---> return 3 + 2 + 1 + 0
        //                                  2 + headSum(1) ---> return 2 + 1 + 0
        //                                  1 + headSum(0) ---> return 1 + 0
        //                                  headSum(0) ---> 0
        //

    }

    public static void main(String[] args) {
        int sum = tailSum(10, 0);

        System.out.println(sum);
    }
}
