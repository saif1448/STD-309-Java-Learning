package StringExamples;

public class CountSubstring {
    public static int countSubString(String subStr, String str){

        int index = 0;
        int count = 0;

        while (true){
            index = str.indexOf(subStr, index);
            if (index != -1){
                count++;
            }else{
                break;
            }
            index = index + subStr.length();
        }

        return count;
    }

    public static int countSubString2(String subStr, String str){

        int index = 0;
        int count = 0;

        while (true){
            index = str.indexOf(subStr, index);
            if (index != -1){
                count++;
            }else{
                break;
            }
            index = index + subStr.length();
        }

        return count;
    }
}
