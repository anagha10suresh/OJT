import java.util.Scanner;
public class gradecalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the mark :: ");
        double mark=sc.nextDouble();
        if(mark>40 && mark<=50)
        {System.out.println("A");}
        else if(mark>30 && mark<=40)
        {System.out.println("B");}
        else if(mark>20 && mark<=30)
        {System.out.println("C");}
        else
        {System.out.println("D");}
    }
}
