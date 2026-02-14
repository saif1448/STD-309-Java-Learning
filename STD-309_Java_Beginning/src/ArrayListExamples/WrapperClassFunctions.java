package ArrayListExamples;

public class WrapperClassFunctions {
    public static void main(String[] args) {

        String numStr = "1234";
        String numStr2 = "5678";
        int num1 = Integer.parseInt(numStr); // String ---> Integer ---> primitive
        int num2 = Integer.parseInt(numStr2);

        System.out.println(num1 + num2);

        String boolStr = "true";
        boolean b = Boolean.parseBoolean(boolStr);
        System.out.println(b);

        String doubleStr = "12.21";
        double d = Double.parseDouble(doubleStr);
        System.out.println(d);

        // Conversion

        System.out.println(Integer.toBinaryString(8));
        System.out.println(Double.toHexString(8.23));

        System.out.println(Integer.compare(29,25));

        System.out.println(Integer.reverse(8));

        System.out.println(Double.isNaN(0.0/0.0));


        Integer i1 = Integer.valueOf("123"); // caching

        Integer i2 = new Integer(20); // deprecated way of creating X
        Integer i3 = Integer.valueOf(20); // X
        Integer i4 = 45;

        String i1Str = Integer.toString(56);
        String i2Str = Integer.toString(78);

        System.out.println(i1Str + i2Str);


        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;

        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;

        



    }
}
