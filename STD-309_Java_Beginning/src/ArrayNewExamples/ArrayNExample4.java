package ArrayNewExamples;

public class ArrayNExample4 {
    public static void main(String[] args) {
        Student[] stdArr = {
                new Student("ABC", 123),
                new Student("XYZ", 456),
                new Student("OQR", 897),
                new Student("PQR", 897),
                new Student("IOW", 897),
        };

        // This is printing the student name starting with a vowel
//        for(int i = 0; i < stdArr.length; i++){
////            if(stdArr[i].getName().charAt(0) == 'A' ||
////                    stdArr[i].getName().charAt(0) == 'E' ||
////                    stdArr[i].getName().charAt(0) == 'I' ||
////                    stdArr[i].getName().charAt(0) == 'O' ||
////                    stdArr[i].getName().charAt(0) == 'U'
////            )
//            String name = stdArr[i].getName();
//            if(!isStartWithVowel(name))
//            {
//                System.out.println(stdArr[i]);
//            }
//        }

        for(Student std : stdArr){
            String name = std.getName();
            if(isStartWithVowel(name)){
                System.out.println(std);
            }
        }

    }

    public static boolean isStartWithVowel(String name){
        return name.startsWith("A") || name.startsWith("E") || name.startsWith("I") || name.startsWith("O") || name.startsWith("U");
    }
}
