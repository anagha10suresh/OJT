import java.util.Scanner;
public class triangle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first side");
        int num1=input.nextInt();
        System.out.println("Enter the second side");
        int num2=input.nextInt();
        System.out.println("Enter the third side");
        int num3=input.nextInt();
        if (num1+num2+num3==180){
            System.out.println("It is a triangle");
        }
        else{
            System.out.println("It is a not a triangle");
        }
input.close();
    }
}
