package FileIOExample;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileData {
    public static void main(String[] args) {

        // every file has absolute path ---> the actual location of the file
        // if the code and the file in the same directory, you dont have to use absolute path
        // simply use the file name only

        String filePath = "src/FileIOExample/questions.txt";
        File file = new File(filePath);

        //We read via the scanner
        // if the file is not present or have any issue, it might throw and exception
        // that is why we need to wrap it up with try catch

        try {
            Scanner sc = new Scanner(file);
            // hasNext() ----> it checks wheather there is another line as in the input
            while (sc.hasNext()){
                // nextLine() ----> it is reading the line currently

                String line = sc.nextLine();
                System.out.println(line);
            }

            sc.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("File reading finished");

    }
}
