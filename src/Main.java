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
        System.out.println("Maximum number is : " + main.max(intNum1, intNum2, intNum3));
        System.out.println("Enter three float numbers : ");
        Float floatNum1 = sc.nextFloat();
        Float floatNum2 = sc.nextFloat();
        Float floatNum3 = sc.nextFloat();
        System.out.println("Maximum number is : " + main.max(floatNum1, floatNum2, floatNum3));
        System.out.println("Enter three Strings : ");
        String string1 = sc.next();
        String string2 = sc.next();
        String string3 = sc.next();
        System.out.println("Maximum number is : " + main.max(string1, string2, string3));
    }

    private <T extends Comparable<T>> T max(T val1, T val2, T val3) {
        T max = val1;
        if (val2.compareTo(val1) > 0)
            max = val2;
        if (val3.compareTo(val2) > 0)
            max = val3;
        return max;
    }
}