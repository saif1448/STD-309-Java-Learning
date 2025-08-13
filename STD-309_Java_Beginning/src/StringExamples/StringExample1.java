package StringExamples;

public class StringExample1 {
    public static void main(String[] args) {
        char a = 'a'; //character type, it is not a string
//        char b = "b"; // double quote represent a string. that is why this line will give error.

        String name = "ABCD";

        // length ---> it is gonna show the length of the string
        System.out.println(name.length());

        //for equality check of the string, always use equals() method
        String name2 = "abcd";
        System.out.println(name.equals("ABCD"));

        //toLowerCase()
        //toUpperCase()
        System.out.println(name.toLowerCase());
        System.out.println(name2.toUpperCase());

        //startsWith() ---> it checks if a string with starting with the given string
        name = "Saif Mahmud";
        System.out.println(name.startsWith("Sa"));

        //endsWith() ---> it checks if a string ends with the given string
        System.out.println("ends with example: " + name.endsWith("ud"));

        //contains() ----> it checks if a substring is present in a string
        System.out.println("contains example: " + name.contains("mu"));

        //concat()
        String name1 = "ABCD";
        String name3 = "DEFG";

//        String name4 = name1 + " " + name3;
        String name4 = name1.concat(" ").concat(name3);
//        name4.concat(name3);
        //name4 = "ABCD DEFG"
        System.out.println("Contcat Example1 :  " + name4);

        //charAt() ---> it gives you the character at a particular index of the string
        System.out.println("character at 2 index of name1: " + name1.charAt(2));

        // isEmpty()
        // it is gonna return true only if the string length is 0
        String name5="                  "; // it is containing a NULL value. In python it will contain a NONE value
        System.out.println("is empty example " + name5.isEmpty());

        //isBlank()
//        Returns true if the string is empty or contains only white space codepoints, otherwise false
        System.out.println("is blank example: "+ name5.isBlank());

        //indexOf()

        //name4 = "ABCD DEFG"
        System.out.println("index of example: " + name4.indexOf("D", 4));



        //replace()
        //name4= "ABCD DEFG"
        System.out.println("Before replacing CD: "+ name4);
        name4 = name4.replace("CD", "TT");
        System.out.println("replace example:: After replacing CD: "+ name4);
        //character replacement
        name4 = name4.replace('T', 'P');
        System.out.println("replace example:: After replacing T Char: "+ name4);

        //split()
        name = "SAIF MAHMUD PARVEZ";
        String[] namePart = name.split(" ");
        System.out.println("Example of split(): ");
        for(var individualPart: namePart){
            System.out.println(individualPart);
        }
        //                      name|age|address    |email
        String personDetails1 = "ABCD|21|XYZ,123,TTT|avc@gmail.com";
        String personDetails2 = "PQRS|21||avc@gmail.com";
        String personDetails3 = "GHAF|21|XYZ,123,TTT|";

        // be careful for the special character. for special char, you have to give \\ before that
        String[] personDetails1Part = personDetails1.split("\\|");
        System.out.println("size: " + personDetails1Part.length);
//        for(String i : personDetails1Part){
//            System.out.println(i);
//        }
        for(int i=0; i<4; i++){
            System.out.println(personDetails1Part[i]);
        }

        String[] personDetails2Part = personDetails2.split("\\|");
        System.out.println("size: " + personDetails2Part.length);
//        for(String i : personDetails2Part){
//            System.out.println(i);
//        }
        for(int i=0; i<4; i++){
            System.out.println(personDetails2Part[i]);
        }

        String[] personDetails3Part = personDetails3.split("\\|", -1);
        System.out.println("size: " + personDetails3Part.length);
//        for(String i : personDetails3Part){
//            System.out.println(i);
//        }
        for(int i=0; i<4; i++){
            System.out.println(personDetails3Part[i]);
        }







    }
}
