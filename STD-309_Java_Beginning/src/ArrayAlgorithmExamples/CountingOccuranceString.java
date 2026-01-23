package ArrayAlgorithmExamples;

public class CountingOccuranceString {

    public static void printCharacterFrequency(String inputStr){

        int[] characterFrequency = new int[26];  // 0 - 25, 0-a, 25-z

        // adf  bc
        // [a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
        // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25]
        // [1, 0, 0, 1, 0, 0, 0, 0, 0, 0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0]
        //  'a' - 'a' ---> int
        //  92 - 92 ---> 0
        // [0]++
        // 'd' - 'a' ---> 3
        // [3]++


        for(char c : inputStr.toCharArray()){
            if(Character.isAlphabetic(c)){
                int ch = Character.toLowerCase(c) - 'a';
                // d --> ch = 3
                // characterFrequency[3]++
                characterFrequency[ch]++;
            }
        }

        for(int i = 0; i < characterFrequency.length; i++){
            if(characterFrequency[i] != 0){
                // i = 0 ---> a + 'a' ---> 92 ---> (char) ---> a
                // i = 1 ---> b + 'a'
                char ch = (char)(i + 'a');
                System.out.println(ch + " : "+ characterFrequency[i]);
            }

        }

    }

    public static void main(String[] args) {

        // Case insensitive way
        // 0 - 25 ----> 26 length array
        // a - z
        //
        String str = "This is a string";
        // This is a string
        // ['T', 'h', 'i', 's,' ', 'i', 's',' ', 'a', ' ' , 's','t','r','i','n','g'] ---> toCharArray()
//        for(char c : str.toCharArray()){
//            if(Character.isAlphabetic(c)){
//                int ch = Character.toLowerCase(c);
//                System.out.println(ch-'a');
//            }
//
//        }

        printCharacterFrequency(str);
    }
}
