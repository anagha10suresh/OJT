import java.util.Scanner;
public class vote{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=input.nextInt();
        if(age>18){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
        input.close();
    }
}