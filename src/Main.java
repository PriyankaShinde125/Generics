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
        System.out.println("Maximum number is : " + main.maxInt(intNum1,intNum2,intNum3));
        System.out.println("Enter three float numbers : ");
        Float floatNum1= sc.nextFloat();
        Float floatNum2= sc.nextFloat();
        Float floatNum3= sc.nextFloat();
        System.out.println("Maximum number is : " + main.maxFloat(floatNum1,floatNum2,floatNum3));
    }

    private Float maxFloat(Float floatNum1, Float floatNum2, Float floatNum3) {
        Float max = floatNum1;
        if (floatNum2.compareTo(max) > 0)
            max = floatNum2;
        if (floatNum3.compareTo(max) > 0)
            max = floatNum3;
        return max;
    }

    private Integer maxInt(Integer intNum1, Integer intNum2, Integer intNum3) {
        Integer max = intNum1;
        if (intNum2.compareTo(max) > 0)
            max = intNum2;
        if (intNum3.compareTo(max) > 0)
            max = intNum3;
        return max;
    }
}