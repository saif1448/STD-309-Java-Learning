package ArrayAndArrayListExamples;

public class ArrayExample2 {

    public static void main(String[] args) {
//        char[] chars = new char[20];
//
//        chars[0] = 'S';
//        chars[1] = 'A';
//        chars[2] = 'I';
//        chars[3] = 'F';

        char[] chars = {'S', 'A', 'I', 'F'};

        System.out.println(chars);

        // we are creating a string from an array of character
        String name = new String(chars);
        System.out.println(name);

        System.out.println(chars.length);


        for(char c : chars){
            System.out.println(c);
        }


        // We are printing the string character by character

        String s = "MAHMUD";

        for(int i = 0; i < s.length(); i++){
            System.out.println(s.charAt(i));
        }



    }
}
