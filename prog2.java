public class prog2
{
    public static void main(String[] args)     
    {
        for (int i = 2; i < 1000; i++)
        {
            boolean a = true;
            for (int j = 2; j < i; j++) 
            {
                if (i % j == 0) 
                {
                    a = false;
                    break;
                }
            }
            if (a) 
            {
                System.out.print(i + " ");
            }
        }
    }
}
