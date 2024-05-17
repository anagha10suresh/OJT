import java.util.Scanner;
public class bonus {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your salary:");
        double x=s.nextDouble();
        System.out.println("Enter your years of experience:");
        double y=s.nextDouble();
        double z=x*(5.0/100);
        double k=x+z;
        if(y>=5){
            System.out.println("The total salary amount will be:"+k);
        }
        else{
            System.out.println("The amount without bonus be:"+x);
        }
s.close();
    }
}
