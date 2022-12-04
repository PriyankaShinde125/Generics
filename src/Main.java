import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to generics....");
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers");
        Integer intNum1 = sc.nextInt();
        Integer intNum2 = sc.nextInt();
        Integer intNum3 = sc.nextInt();
        System.out.println("Maximum number is : " + main.max(intNum1,intNum2,intNum3));
}

    private Integer max(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0)
            max = num2;
        if (num3.compareTo(max) > 0)
            max = num3;
        return max;
    }
}