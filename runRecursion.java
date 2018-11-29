import java.util.Scanner; 
public class runRecursion
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number you want to find the factorial of:");
        int begin = sc.nextInt();
        Recursion haha = new Recursion();
        System.out.println(haha.factorial(begin));
    }
}
