import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to generics....");
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integer numbers");
        Integer intNum1 = sc.nextInt();
        Integer intNum2 = sc.nextInt();
        Integer intNum3 = sc.nextInt();
        System.out.println("Maximum number is : " + main.maxInt(intNum1, intNum2, intNum3));
        System.out.println("Enter three float numbers : ");
        Float floatNum1 = sc.nextFloat();
        Float floatNum2 = sc.nextFloat();
        Float floatNum3 = sc.nextFloat();
        System.out.println("Maximum number is : " + main.maxFloat(floatNum1, floatNum2, floatNum3));
        System.out.println("Enter three Strings : ");
        String string1 = sc.next();
        String string2 = sc.next();
        String string3 = sc.next();
        System.out.println("Maximum number is : " + main.maxString(string1, string2, string3));
    }

    private String maxString(String string1, String string2, String string3) {
        String max = string1;
        if (string2.compareTo(string1) > 0)
            max = string2;
        if (string3.compareTo(string2) > 0)
            max = string3;
        return max;
    }

    private Float maxFloat(Float floatNum1, Float floatNum2, Float floatNum3) {
        Float max = floatNum1;
        if (floatNum2.compareTo(floatNum1) > 0)
            max = floatNum2;
        if (floatNum3.compareTo(floatNum2) > 0)
            max = floatNum3;
        return max;
    }

    private Integer maxInt(Integer intNum1, Integer intNum2, Integer intNum3) {
        Integer max = intNum1;
        if (intNum2.compareTo(intNum1) > 0)
            max = intNum2;
        if (intNum3.compareTo(intNum2) > 0)
            max = intNum3;
        return max;
    }
}