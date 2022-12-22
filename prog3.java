import java.util.Scanner;
 
public class prog3 {
    public static void main(String[] args) 
    {
        int num1;
        int num2;
        String operation;
        Scanner iScanner = new Scanner(System.in);

        System.out.printf("Введите первое число: ");
        num1 = iScanner.nextInt();

        System.out.printf("Введите операцию: ");
        operation = iScanner.next();

        System.out.printf("Введите второе число: ");;
        num2 = iScanner.nextInt();

        String s = num1 +" "+ operation +" "+ num2 + " = ";

        if (operation.equals("+"))
        {
            System.out.println("Ответ: " + s + (num1 + num2));
        }
        if (operation.equals("-"))
        {
            System.out.println("Ответ: " + s + (num1 - num2));
        }
        if (operation.equals("/"))
        {
            System.out.println("Ответ: " + s + (num1 / num2));
        }
        if (operation.equals("*"))
        {
            System.out.println("Ответ: " + s + (num1 * num2));
        }
        iScanner.close();
    }
}
