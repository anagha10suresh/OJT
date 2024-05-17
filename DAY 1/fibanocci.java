import java.util.Scanner;
public class fibanocci{
    public static void main(String[] args) {
        int f1=-1; 
        int f2=1;
        int f3;
        Scanner s= new Scanner(System.in);
       System.out.println("Enter the limit:");
    int limit=s.nextInt();
        for(int i=0;i<limit;i++){
            f3=f1+f2;
           f1=f2;
           f2=f3;
           System.out.println(f3);

        }
    }
}