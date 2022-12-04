import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to generics....");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three integer numbers");
        Integer intNum1 = sc.nextInt();
        Integer intNum2 = sc.nextInt();
        Integer intNum3 = sc.nextInt();
        System.out.println("Maximum number is : " + new Maximum<>(intNum1, intNum2, intNum3).max());
        System.out.println("Enter three float numbers : ");
        Float floatNum1 = sc.nextFloat();
        Float floatNum2 = sc.nextFloat();
        Float floatNum3 = sc.nextFloat();
        System.out.println("Maximum number is : " + new Maximum<>(floatNum1, floatNum2, floatNum3).max());
        System.out.println("Enter three Strings : ");
        String string1 = sc.next();
        String string2 = sc.next();
        String string3 = sc.next();
        System.out.println("Maximum number is : " +new Maximum<>(string1, string2, string3).max());
    }

}