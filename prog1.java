import java.util.Scanner;

public class prog1 
{
    public static void main(String[] args) 
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        int result = (i * (i + 1)) / 2;
        System.out.printf("Треугольное число: %d\n" ,result);
        iScanner.close();
    }
}
