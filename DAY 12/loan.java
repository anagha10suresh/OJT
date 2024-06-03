import java.util.Scanner;
public class loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  
        System.out.print("Enter your annual income: ");
        int income = scanner.nextInt();
        if (age < 18)
        {
            System.out.println("Not eligible for a loan.");
        }
        else if (age >= 18 && age <= 25 && income >= 2500) 
        {
            System.out.println("Eligible for a small loan.");
        } 
        else if (age >= 26 && age <= 35 && income >= 50000) 
        {
            System.out.println("Eligible for a medium loan.");
        }
        else if (age > 35 && income >= 75000) 
        {
            System.out.println("Eligible for a large loan.");
        } 
        else
        {
            System.out.println("Not eligible for a loan.");
        }
    }
}
